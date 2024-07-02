package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

val primeNumbers  = mutableListOf<Long>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 일반적인 소인수분해를 하면 시간 초과 -> 에라토스테네스의 채를 활용해 최적화
    val limit = 1000000
    val isPrime = BooleanArray(limit + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..limit) {
        if (isPrime[i]) {
            primeNumbers.add(i.toLong())
            var j = 2 * i
            while (j <= limit) {
                isPrime[j] = false
                j += i
            }
        }
    }

    repeat(readLine().toInt()) {
        println(check(readLine().toLong()))
    }
}

fun check(n: Long) : String {
    for(prime in primeNumbers) {
        if (prime * prime > n) break
        if(n % prime == 0L) {
            return "NO"
        }
    }
    return "YES"
}