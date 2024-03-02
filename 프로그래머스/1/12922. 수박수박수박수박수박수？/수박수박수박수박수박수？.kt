class Solution {
    fun solution(n: Int): String {
        val repeatCount = n / 2
        val isOdd = (n % 2 == 1)

        return "수박".repeat(repeatCount) + ("수".takeIf{ isOdd } ?: "")
    }
}