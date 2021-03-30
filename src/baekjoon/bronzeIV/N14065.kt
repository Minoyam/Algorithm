package baekjoon.bronzeIV

fun main(){
    println(String.format("%.6f", 100 / (readLine()!!.toDouble() * (KM / LITER))))

}
const val LITER = 3.785411784
const val KM = 1.609344