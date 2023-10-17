class Solution {
    fun solution(n: Long): Long {
        return n.toString().map {
            it.toString().toLong()
        }.sortedDescending().joinToString("").toLong()
    }
}