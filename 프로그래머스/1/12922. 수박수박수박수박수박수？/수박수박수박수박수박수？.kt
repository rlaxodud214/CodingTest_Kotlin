class Solution {
    fun solution(n: Int): String {
        var answer = "수박".repeat(n / 2)
        
        if (n % 2 == 0) {
            return answer
        }
        
        return answer + "수"
    }
}