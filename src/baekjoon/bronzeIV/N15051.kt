package baekjoon.bronzeIV

import kotlin.math.min

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(min(
            min((a * 2) + (c * 2), (a * 4) + (b * 2)), (b * 2) + (c * 4)
    ))

}
