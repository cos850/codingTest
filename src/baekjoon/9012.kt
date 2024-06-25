package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * 9012번 "괄호"
 */
val yes = "YES"
val no = "NO"

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()

    // execute
    for(i in 1 .. n)
        println(validateBracket(readLine()))
}

fun validateBracket(str: String): String{
    if(str.isBlank()) return no

    val stack : Stack<Char> = Stack()

    try {
        for(char in str.toCharArray()){
            when(char){
                '(' -> stack.push(char)
                ')' -> stack.pop()
                else -> return no
            }
        }
        return if(stack.isEmpty()) yes else no
    } catch (e: EmptyStackException) {
        return no
    }
}
