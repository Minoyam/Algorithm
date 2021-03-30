package baekjoon.bronzeIV

fun main() {
    readLine()!!.split(" ").map {
        it.toInt()
    }.let {
        val a = it.first()
        var count = 1
        count += if ((a % (it.last() - it.first()) == 0)) {
            a / (it.last() - it.first())
        } else {
            a / (it.last() - it.first()) + 1
        }
        println(count)
    }
}