package baekjoon.bronzeIV


fun main(){
    readLine()!!.split(" ").map {
        it.toInt()
    }.let {
        if(it.first() == it.last()){
            print(it.first())
        }
        else{
            print(it.max())
        }
    }
}