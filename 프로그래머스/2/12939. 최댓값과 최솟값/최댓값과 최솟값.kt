class Solution {
    fun solution(s: String): String {
        val numbers = mutableListOf<Int>()

        var sb = StringBuilder()

        for (ch in s + ' ') {
            if (ch != ' ') {
                sb.append(ch)
            }

            if (ch == ' ') {
                numbers.add(sb.toString().toInt())
                sb = StringBuilder()
            }
        }

        // min, max -> unresolved reference 오류남
        return "${numbers.minOf{ it }} ${numbers.maxOf{ it }}"
    }
}