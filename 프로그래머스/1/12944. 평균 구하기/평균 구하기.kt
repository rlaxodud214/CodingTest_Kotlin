class Solution {
    fun solution(arr: IntArray): Double {
        return arr.sumOf {it} / (arr.size).toDouble()
    }
}