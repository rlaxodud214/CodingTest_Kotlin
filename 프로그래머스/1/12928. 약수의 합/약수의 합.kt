class Solution {
    fun solution(n: Int): Int {
        return IntArray(n) { it + 1 }.filter { n % it == 0 }.sumOf { it }
    }
}