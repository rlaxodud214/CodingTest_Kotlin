class Solution {
    fun solution(s: String): String {
        var answer = s.split(" ")
            .map { it.toInt() }

        // min, max -> unresolved reference 오류남
        return "${answer.minOf{ it }} ${answer.maxOf{ it }}"
    }
}