package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().split(' ').map { it.toInt() }

    val names = HashSet<String>(n[0])
    repeat(n[0]) { names.add(readLine()) }

    val results = ArrayList<String>()
    repeat(n[1]) {
        val name = readLine()
        if(names.contains(name))
            results.add(name)
    }
    results.sort()

    val sb = StringBuilder().append(results.size)
    for (s in results) { sb.append("\n").append(s) }
    print(sb)
}