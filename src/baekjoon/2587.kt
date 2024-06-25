package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var sum = 0
    val list = mutableListOf<Int>()

    repeat(5) {
        val n = readLine().toInt()
        list.add(n)
        sum += n
    }
    list.sort()
    println("${sum/5}\n${list[2]}")
}
