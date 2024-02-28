class Solution {
    fun solution(s: String, n: Int): String {
        var sb = StringBuilder()

        for (ch in s) {
            val convertCh = when(ch) {
                ' ' -> ch
                in 'A'..'Z', in 'a'..'z' -> ch.nextCharWithRotation(n)
                else -> {}
            }
            sb.append(convertCh)
        }

        return sb.toString()
    }

    fun Char.nextCharWithRotation(n: Int): Char {
        val value = (toInt() + n % 26).toChar()

        val isSameCase = when {
            isUpperCase() -> value <= 'Z'
            isLowerCase() -> value <= 'z'
            else -> false
        }

        return if(isSameCase) value else value - 26
    }
}