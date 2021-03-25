package baekjoon

import kotlin.math.pow

fun main() {
    val list = readLine()!!.split(" ").map {
        it.toInt()
    }.sorted()
    if (list[0] == list[1] && list[1] == list[2])
        println(2)
    else if (list[0].toDouble().pow(2.0) + list[1].toDouble().pow(2.0) == list[2].toDouble().pow(2.0)) {
        println(1)
    } else {
        println(0)
    }
}