class Solution {
    fun solution(s: String): String {
        var sb = StringBuilder(s.length)
        var wordIndex = 0

        s.forEach {
            if (it == ' ') {
                wordIndex = 0
                sb.append(it)
            } else if (it != ' ') {
                val char = convertCaseByWordIndex(it, wordIndex)
                wordIndex++
                sb.append(char)
            }
        }
        return sb.toString()
    }

    fun convertCaseByWordIndex(ch: Char, wordIndex: Int): String {
        var char = ch.lowercase()
        if (wordIndex % 2 == 0) {
            char = ch.uppercase()
        }
        return char
    }
}