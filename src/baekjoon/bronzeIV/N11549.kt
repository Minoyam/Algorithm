package baekjoon.bronzeIV

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.split(" ").map {
        it.toInt()
    }.filter { it == a }.size
        println(b)
}