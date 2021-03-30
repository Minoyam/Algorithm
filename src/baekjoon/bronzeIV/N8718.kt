package baekjoon.bronzeIV

fun main() {
    val (x, k) = readLine()!!.split(" ").map {
        it.toInt() * 1000
    }
    when {
        k * 7 <= x -> {
            println(k * 7)
        }
        k * 3.5 <= x -> {
            println((k * 3.5).toInt())
        }
        k * 1.75 <= x ->{
            println((k * 1.75).toInt())
        }
        else -> {
            println(0)
        }
    }
}
