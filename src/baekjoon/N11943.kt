package baekjoon

import kotlin.math.min

fun main() {
    val firstBasket: Pair<Int, Int>
    val secondBasket: Pair<Int, Int>

    readLine()!!.split(" ").map {
        it.toInt()
    }.apply {
        firstBasket = this.first() to this.last()
    }
    readLine()!!.split(" ").map {
        it.toInt()
    }.apply {
        secondBasket = this.first() to this.last()
    }

    val first = firstBasket.first + secondBasket.second
    val second = firstBasket.second + secondBasket.first

    println(min(first,second))
}
