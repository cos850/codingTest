package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    with(MyStack()) {
        for(i in 1 .. n) {
            val cmd = readLine()
            if(cmd.startsWith("push"))
                push(cmd.substring(5).toInt())
            else {
                val v = when (cmd) {
                    "pop" -> pop()
                    "size" -> size()
                    "empty" -> empty()
                    else -> top()
                }
                println(v)
            }
        }
    }
}

class MyStack{
    val list: MutableList<Int> = arrayListOf()
    var i = -1

    fun push(e: Int){
        list.add(++i, e)
    }

    fun pop(): Int {
        return if(i == -1) -1 else list.removeAt(i--)
    }

    fun size(): Int {
        return list.size
    }

    fun empty(): Int {
        return if(i == -1) 1 else 0
    }

    fun top(): Int {
        return if(i == -1) -1 else list.get(i)
    }
}


