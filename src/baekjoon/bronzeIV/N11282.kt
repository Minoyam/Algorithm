package baekjoon.bronzeIV

fun main() {
    readLine()?.let {
        val index = it.toInt()
        val hangleToInt = 44031 + index
        println(hangleToInt.toChar())
    }
}