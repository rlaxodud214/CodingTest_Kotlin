class Solution {
    fun solution(s: String): String {
        var answer = s.split(" ")
            .map { it.toInt() }

        // min, max -> unresolved reference 오류남
        // return "${answer.min()} ${answer.max()}"

        var (min, max) = Pair(Int.MAX_VALUE, Int.MIN_VALUE)

        for (num in answer) {
            if (num < min) {
                min = num
            }
            if (num > max) {
                max = num
            }
        }

        return "${min} ${max}"
    }
}