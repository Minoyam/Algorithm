package baekjoon

fun main() {
    val (r, c, n) = readLine()!!.split(" ").map {
        it.toInt()
    }

    var count = if (r % n == 0) {
        (r / n).toBigInteger()
    } else {
        (r / n + 1).toBigInteger()
    }
    count = count.times(if (c % n == 0) {
        (c / n).toBigInteger()
    } else {
        (c / n + 1).toBigInteger()
    })
        println(count)
}