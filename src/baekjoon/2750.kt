package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val array = IntArray(n)

    for(i in 0 .. n-1){
        array[i] = readLine().toInt()
    }
    quickSort(array, 0, n-1)

    val sb = StringBuilder()
    for(i in 0 .. n-2) {
        sb.append(array[i]).append("\n")
    }
    println(sb.append(array[n-1]).toString())
}

fun quickSort(array: IntArray, left: Int, right: Int){

    var leftOffset = left
    var rightOffset = right
    val pivot = array[(left + right)/2]
    var temp: Int

    do {
        while(array[leftOffset] < pivot) leftOffset++
        while(array[rightOffset] > pivot) rightOffset--
        if (leftOffset <= rightOffset) {
            temp = array[leftOffset]
            array[leftOffset] = array[rightOffset]
            array[rightOffset] = temp
            leftOffset++
            rightOffset--
        }
    } while(leftOffset <= rightOffset)

    if(left < rightOffset)
        quickSort(array, left, rightOffset)
    if(leftOffset < right)
        quickSort(array, leftOffset, right)
}


