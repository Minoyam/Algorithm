package baekjoon.bronzeIV

import kotlin.math.max

fun main(){
    val (a,b) = readLine()!!.split(" ").map {
        it.toInt()
    }
    if(a == 0 && b == 0)
        println("Not a moose")
    else if(a == b){
        println("Even ${a + b}")
    }
    else{
        println("Odd ${max(a,b) * 2}")
    }
}