class Solution {
    fun solution(n: Long) = n.toString()
        .map {it}
        .sortedDescending()
        .joinToString("")
        .toLong()
}