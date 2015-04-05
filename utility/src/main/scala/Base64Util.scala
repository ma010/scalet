/**
 * Created by feng on 4/4/15.
 */


package utility

import org.apache.commons.codec.binary.Base64._
import java.nio.ByteBuffer
import java.nio.ByteOrder
//import org.apache.commons.codec.binary.BinaryDecoder

object Base64Util extends App {
//  val base64Str = "QuCQmEBojzBC4jg8QKmTbkLuUC5BKe9MQwIDAECDzGtDBx4zQEwNwEMIL2pAtucZQwr0vkCmxylDC//UQLwpX0MOI29AJ+muQxQKpECJ2bhDGDFoQQUcV0MeLehAvF0gQyFBgEEu9adDIkQqQNRknEMpHXBByehCQyoS5UBbct1DKxu6QHnqSkMsFddArRmfQy3yQkEzwmJDL08wQOelKkMxKJ1A0hc/QzRL1kEw1c9DNPi4QSiYXEM4NYFAa3vTQzkAakEaQl1DPtz2QJHyqENBB7JBOb0MQ0T9gUGYZE1DRgLQQQmUh0NHMTBBswjEQ0fqLED/enNDSPa6QTRV+UNL/XhAlPpYQ03+yUCbJvZDUQWQQJWr6ENTD7xBCaiuQ1UElEBvd+hDVy+wQYuh8ENYHohB93Q2Q1lAWEGELDlDWwYsQQ/iXkNb0k5ArIkDQ19A8EERZzpDYRAYQM4P3kNiIXhAbzPhQ2LavkA9JfhDZdXaQIpXNkNqBthBMzEDQ2saqkG7NO9Da/2iQlBbPENs7DBBH5k9Q23sfEEsW8hDbwhSQd57XkNyL15A5PGbQ3LkOEEWbFZDdDdcQZtZCkN1FFRBbEAVQ3YLEECu9vJDeBGWQe0LvkN5C2BAPoOqQ3z7OEJPTcxDfgPAQw6bqkN+9uxDA0o0Q4INNEGA36FDgnBKQO+sEEODAwxAYh/oQ4WzhkCr1DBDhgIoQOVCGEOGjCBBpFyqQ4dplUG8NE1DiHIZQDqunUOI6ztArgrsQ4oI70HnEg9DipD/QW/6VkOLjDBAiytMQ4vsXkBnOC9DjfiRQKAQekOOjb1AVlicQ48bmkEIMrxDj5dFQZ5Cx0OP+exBgMbqQ5CEDUJgKlNDkRSTRDXsgkORfJBCDqSHQ5IipkCbakNDkoYZQc0dAUOS4f9BV0mfQ5N4yEJTHXRDlBLFQTZ4YkOVD8NAwYecQ5Xmq0D5ROpDltiwQdicfEOXbapAtz7wQ5gKJUFENktDmPkBQF4QbEOcEcFAj5NcQ50qZEL3XbRDnXu/QzLHWUOeEMtB82OEQ56MS0EUErNDnxcNQTdQd0OhyqlApZ/pQ6XVQUGZ37FDxYz2QHMYQ0PHo61BgftWQ+0E9EB7bmxD8xArQLo79kP5JEdAn8WjRARD4UCLLkFEBhJ2QV5oWEQJXu9AuX68RAmSpkCykWJEC9VlQJ4EaEQNzAVAjXllRA9Vp0DWu4Q="

//  val strDecoded = Base64.decodeBase64(base64Str)

//  val strDecoded = decodeString("QuCQ")
  val strDecodedByteGroup = decodeBase64("QuCQmEBojzBC4jg8") grouped 4
//  val strToFloat = ByteBuffer.wrap(strDecoded).order(ByteOrder.BIG_ENDIAN).getFloat()
  val byteToFloat = strDecodedByteGroup map(x => ByteBuffer.wrap(x).order(ByteOrder.BIG_ENDIAN).getFloat())
//  for {byteGroup <- strDecodedByteGroup} {
//    val x = ByteBuffer.wrap(byteGroup).order(ByteOrder.BIG_ENDIAN).getFloat()
//    println(x)
//  }
//    for {byteGroup <- strDecodedByteGroup}
//      yield ByteBuffer.wrap(byteGroup).order(ByteOrder.BIG_ENDIAN).getFloat()
//  val strToFloat = ByteBuffer.order(ByteBuffer.wrap(strDecoded, 8, 4)).getFloat()
//  println(strDecodedByteGroup.length)
//  println(strDecodedByteGroup()
//  println(strDecoded(1))
//  println(strToFloat)
//  println(byteToFloat.length)
  byteToFloat.foreach(println)
//  strDecodedByteGroup.foreach(println)
//  byteToFloat.foreach(println)
//  println(isBase64("QuCQmEBojzBC4jg8"))

//  /** Encodes the given String into a Base64 String. **/
//  def encodeString(in: String): String = encodeString(in.getBytes("UTF-8"))
//
//  /** Encodes the given ByteArray into a Base64 String. **/
//  def encodeString(in: Array[Byte]): String = new String(Base64.encodeBase64(in))
//
//  /** Encodes the given String into a Base64 ByteArray. **/
//  def encodeBinary(in: String): Array[Byte] = Base64.encodeBase64(in.getBytes("UTF-8"))
//
//  /** Encodes the given ByteArray into a Base64 ByteArray. **/
//  def encodeBinary(in: Array[Byte]): Array[Byte] = Base64.encodeBase64(in)
//
//  /** Decodes the given Base64-ByteArray into a String. **/
//  def decodeString(in: Array[Byte]): String = new String(decodeBinary(in))
//
//  /** Decodes the given Base64-String into a String. **/
//  def decodeString(in: String): String = decodeString(in.getBytes("UTF-8"))
//
//  /** Decodes the given Base64-String into a ByteArray. **/
//  def decodeBinary(in: String): Array[Byte] = decodeBinary(in.getBytes("UTF-8"))
//
//  /** Decodes the given Base64-ByteArray into a ByteArray. **/
//  def decodeBinary(in: Array[Byte]): Array[Byte] = (new Base64).decode(in)
}
