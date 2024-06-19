package baekjoon.datastructure

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val pushFront = "push_front"
    val popFront = "pop_front"
    val popBack = "pop_back"
    val size = "size"
    val empty = "empty"
    val front = "front"
    val back = "back"

    with(MyDeQueue()) {
        for(i in 1 .. n) {
            when (val cmd = readLine()) {
                popFront -> println(popFront())
                popBack -> println(popBack())
                size -> println(size())
                empty -> println(empty())
                front -> println(front())
                back -> println(back())
                else -> {
                    val split = cmd.split(' ')
                    if(split[0] == pushFront)
                        pushFront(split[1].toInt())
                    else
                        pushBack(split[1].toInt())
                }
            }
        }
    }
}

class MyDeQueue{
    private val list = LinkedList<Int>()

    fun pushFront(e: Int){
        list.addFirst(e)
    }

    fun pushBack(e: Int){
        list.add(e)
    }

    fun popFront(): Int {
        return if (list.isEmpty()) -1 else list.removeFirst()
    }

    fun popBack(): Int {
        return if(list.isEmpty()) -1 else list.removeLast()
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
        } catch (e: NoSuchElementException) {
            -1
        }
    }
}