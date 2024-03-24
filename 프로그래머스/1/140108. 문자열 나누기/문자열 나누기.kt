class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0

        var x = ' '
        var count = 1

        for (ch in s) {
            if (x == ' ') {
                x = ch
                continue
            }
            count += if (x == ch) 1 else -1 

            if (count == 0) {
                x = ' '
                count = 1
                answer++
            }
        }
        if (x != ' ') {
            answer++
        }

        return answer
    }
}