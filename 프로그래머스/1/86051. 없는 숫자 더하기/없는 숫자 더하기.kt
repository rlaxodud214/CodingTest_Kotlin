class Solution {
    fun solution(numbers: IntArray): Int {
        var intRange = Array(9) { it + 1 } // 1..10
        val answer = intRange.filter { it !in numbers }
            .sumOf { it }
        
        return answer
    }
}