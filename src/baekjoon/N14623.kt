package baekjoon

import kotlin.math.pow

fun main() {
    val B1 = readLine()!!.toString()
    val B2 = readLine()!!.toString()
    val result = (mut(B1) * mut(B2)).toString(2)
    if (result.first() == '0') {
        println(result.drop(1))
    } else {
        println(result)
    }
}

fun mut(string: String): Long {
    var index = (string.length - 1).toDouble()
    var sum: Long = 0
    string.forEach {
        sum += ((it.toInt() - 48).toDouble() * 2.0.pow(index)).toLong()
        index--
    }
    return sum
}
