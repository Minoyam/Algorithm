package baekjoon.bronzeIV

import kotlin.math.max

fun main(){
    val list = mutableListOf<Int>()
    repeat(6) {
        list.add(readLine()!!.toInt())
    }
    var a = 0
    for((index, num) in list.subList(0,4).sorted().withIndex()){
        if(index != 0)
            a += num
    }
    val b = max(list[4],list[5])

    println(a+b)
}