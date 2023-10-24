class Solution {
    fun solution(numbers: IntArray): Int {
        var numberRange = Array(9) { it + 1 } // 0..8 -> 1..9
        
        return numberRange.filter { it !in numbers }
            .sumOf { it }
    }
}