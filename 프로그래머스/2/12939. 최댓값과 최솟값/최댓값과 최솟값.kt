class Solution {
    fun solution(s: String): String {
        val numbers = mutableListOf<Int>()

        var sb = ""

        for (ch in s + ' ') {
            if (ch != ' ') {
                sb += ch
            }

            if (ch == ' ') {
                numbers.add(sb.toInt())
                sb = ""
            }
        }

        // min, max -> unresolved reference 오류남
        return "${numbers.minOf{ it }} ${numbers.maxOf{ it }}"
    }
}