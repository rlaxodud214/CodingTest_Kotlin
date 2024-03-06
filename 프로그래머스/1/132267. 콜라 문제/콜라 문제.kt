class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var leftCount = n

        while (leftCount >= a) {
            val getCount = (leftCount / a) * b
            answer += getCount
            leftCount = (leftCount % a) + getCount
        }

        return answer
    }
}