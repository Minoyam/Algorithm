package baekjoon.bronzeIV

import kotlin.math.*

fun main() {
    val list = readLine()!!.split(" ").map {
        it.toInt()
    }
    val list2 = readLine()!!.split(" ").map {
        it.toInt()
    }

    val hList = listOf(list[1], list[3], list2[1], list2[3]).sorted()
    val h = hList[3] - hList[0]
    val wList = listOf(list[0], list[2], list2[0], list2[2]).sorted()
    val w = wList[3] - wList[0]
    println(max(h, w).toDouble().pow(2).toInt())

}
