package baekjoon.bronzeIV

fun main() {
    val list = mutableListOf<Int>()

    readLine()?.split(" ")?.map {
        it.toInt()
    }?.let {
        list.addAll(it.sorted())
    }
    var oneTeam = 0
    var twoTeam = 0

    for ((index, num) in list.withIndex()) {
        when (index) {
            0, 3 -> {
                oneTeam += num
            }
            1, 2 -> {
                twoTeam += num
            }
        }
    }
    println("${if (oneTeam >= twoTeam) oneTeam - twoTeam else twoTeam - oneTeam}")
}