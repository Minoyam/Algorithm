package baekjoon

fun main() {
    readLine()!!.split(" ").filter {
        it >= "0" && it <= "9"
    }.map {
        it.toInt()
    }.let {
        if (it[0] + it[1] == it[2]) {
            print("YES")
        } else {
            print("NO")
        }
    }
}