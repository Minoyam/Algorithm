package baekjoon

import kotlin.math.max

fun main() = println(
        readLine()!!
                .split(" ")
                .map { it.toInt() }
                .let {
                    val (max, min) = it.sortedDescending()
                    val inARow = if (max / 3 < min) max / 3.toDouble() else min.toDouble()
                    val twoLine = min / 2.toDouble()

                    String.format("%.3f",max(inARow, twoLine))
                }
)