package baekjoon.datastructure

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n1 = readLine().toInt()
    val numbers = buildSet<Int> {
        val st = StringTokenizer(readLine())
        repeat(n1) {
            add(st.nextToken().toInt())
        }
    }

    val n2 = readLine().toInt()
    val st = StringTokenizer(readLine())
    val cache = mutableMapOf<Int, Int>()
    val builder = StringBuilder()

    repeat(n2) {
        val num = st.nextToken().toInt()
        val result = cache.getOrPut(num){
            if(numbers.contains(num)) 1 else 0
        }
        builder.append(result).append('\n')
    }

    print(builder.toString())
}