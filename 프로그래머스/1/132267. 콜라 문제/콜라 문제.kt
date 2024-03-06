class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var leftCount = n

        while (leftCount >= a) {
            val giftCount = (leftCount / a) * b
            answer += giftCount
            leftCount = (leftCount % a) + giftCount
        }

        return answer
    }
}