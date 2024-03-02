class Solution {
    fun solution(numbers: IntArray) = Array(9) { it + 1 }.filter { it !in numbers }.sum()
}