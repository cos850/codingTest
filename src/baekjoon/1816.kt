package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()) {
        val n = readLine().toLong()

        // 기존 시간 초과 로직은 while문을 통해 n을 소인수분해가 될 때까지 반복했다.
        // 때문에 n이 소수일 경우 최대 O(n)이 되는데, n이 1억까지 오기 때문에 시간 초과가 발생한다.
        // 변경한 이 코드는 n이 1억이 오더라도 100만까지만 반복하기 때문에 O(1)의 시간 복잡도를 가지게 되므로 시간 초과가 발생하지 않았다.
        for(i in 2L .. 1000_000L) {
            if(n%i == 0L) {
                println("NO")
                break
            }
            if(i==1000_000L)
                println("YES")
        }
    }
}