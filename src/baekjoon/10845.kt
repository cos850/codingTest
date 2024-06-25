package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    with(MyQueue()) {
        for(i in 1 .. n) {
            val cmd = readLine()
            if(cmd.startsWith("push"))
                push(cmd.substring(5).toInt())
            else {
                val v = when (cmd) {
                    "pop" -> pop()
                    "size" -> size()
                    "empty" -> empty()
                    "front" -> front()
                    else -> back()
                }
                println(v)
            }
        }
    }
}

class MyQueue{
    private val list = LinkedList<Int>()

    fun push(e: Int){
        list.add(e)
    }

    fun pop(): Int {
        return if(list.isEmpty()) -1 else list.removeFirst()
    }

    fun size(): Int {
        return list.size
    }

    fun empty(): Int {
        return if(list.isEmpty()) 1 else 0
    }

    fun front(): Int {
        return try {
            list.first
        } catch (e: NoSuchElementException) {
            -1
        }
    }

    fun back(): Int {
        return try {
            list.last
        } catch (e: java.util.NoSuchElementException) {
            -1
        }
    }
}