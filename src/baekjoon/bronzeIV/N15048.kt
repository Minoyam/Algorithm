package baekjoon.bronzeIV

import java.math.BigInteger

fun main(){

    val a = BigInteger(readLine()!!.toString())

    when (BigInteger.ZERO) {
        a.rem(BigInteger.TWO) -> {
            println(2)
        }
        a.rem(BigInteger("3")) -> {
            println(0)
        }
        else -> {
            println(1)
        }
    }
}