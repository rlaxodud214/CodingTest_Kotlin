class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        val zipAB = a.zip(b)
        val answer: Int = zipAB.sumOf { (a, b) -> a * b }

        return answer
    }
}