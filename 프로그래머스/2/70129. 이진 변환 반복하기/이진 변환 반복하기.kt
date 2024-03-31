class Solution {
    fun solution(s: String): IntArray {
        var answer = IntArray(2) { 0 }
        var x = s

        while (x != "1") {
            val zeroCount = x.count { it == '0' }
            answer[1] += zeroCount

            x = (x.length - zeroCount).toString(2)
            answer[0] += 1
        }

        return answer
    }
}