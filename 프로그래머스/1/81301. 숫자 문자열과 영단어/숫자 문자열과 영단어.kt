class Solution {
    fun solution(s: String): Int {
        var answer = s
        var match = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        for ((num, text) in match.withIndex()) { // index == num
            answer = answer.replace(text, num.toString())
        }

        return answer.toInt()
    }
}