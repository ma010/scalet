/*
 * sbt build with default scala version 2.10
 */

package xml

import scala.io.Source
import scala.xml.pull._
import scala.collection.mutable.ArrayBuffer
import java.io.File
import java.io.FileOutputStream
import scala.xml.XML

object metabolomics extends App {

  val xmlFile = args(0)
  val outputLocation = new File(args(1))

  val xml = new XMLEventReader(Source.fromFile(xmlFile))

  var insidePage = false
  var buf = ArrayBuffer[String]()
  for (event <- xml) {
    event match {
      case EvElemStart(_, "scan", attr, _) => {
        insidePage = true
        val tag = "<scan" + attr + ">"
        buf += tag
      }
      case EvElemEnd(_, "scan") => {
        val tag = "</scan>"
        buf += tag
        insidePage = false

        writePage(buf)
        buf.clear
      }
      case e @ EvElemStart(_, tag, attr, _) => {
        if (insidePage) {
          buf += ("<" + tag + attr + ">")
        }
      }
      case e @ EvElemEnd(_, tag) => {
        if (insidePage) {
          buf += ("</" + tag + ">")
        }
      }
      case EvText(t) => {
        if (insidePage) {
          buf += (t)
        }
      }
      case _ => // ignore
    }
  }

  def writePage(buf: ArrayBuffer[String]) = {
    val s = buf.mkString
    val x = XML.loadString(s)
    val msLevel = (x.attribute("msLevel")..toList(0).toString
    val f = new File(outputLocation, msLevel + ".xml")
    println("writing to: " + f.getAbsolutePath())
    val out = new FileOutputStream(f)
    out.write(s.getBytes())
    out.close
  }

}