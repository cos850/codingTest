package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cmd = readLine().split(' ')
    val n = cmd[0].toInt()
    val k = cmd[1].toInt()
    val queue : Queue<Int> = LinkedList()

    for(i in 1 .. n){
        queue.offer(i)
    }

    val sb = StringBuilder().append("<")

    while(queue.isNotEmpty()) {
        repeat(k-1) {
            val temp = queue.poll()
            queue.add(temp)
        }
        sb.append(queue.poll()).append(", ")
    }

    println(sb.deleteRange(sb.length-2, sb.length).append(">").toString())
}