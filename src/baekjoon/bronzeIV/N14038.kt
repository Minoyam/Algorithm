package baekjoon.bronzeIV

fun main() {
    var count = 0
    repeat(6) {
        if (readLine()!!.toString() == "W")
            count++
    }
    val group = when (count) {
        5, 6 -> {
            1
        }
        3, 4 -> {
            2
        }
        1, 2 -> {
            3
        }
        else -> {
            -1
        }
    }
    println(group)
}