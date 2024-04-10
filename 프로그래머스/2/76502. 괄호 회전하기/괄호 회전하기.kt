import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        val texts = Array(s.length) { s }
        
        // 1. 괄호 회전하기
        for (i in 0 until texts.size) {
            var sb = StringBuilder()
            sb.append(s.drop(i))
            sb.append(s.dropLast(texts.size - i))
            texts[i] = sb.toString()
        }

        // 2. 올바른 괄호인지 판단하며, count++
        for (text in texts) {
            val result = isCollect(text)
            if (result) {
                answer++
            }
        }

        return answer
    }

    fun isCollect(text: String): Boolean {
        val stack = Stack<Char>()

        for (ch in text) {
            when(ch) {
                '(', '{', '[' -> stack.add(ch)
                ')', '}', ']' -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    if (stack.pop() != pairs[ch]) {
                        return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }

    companion object {
        var pairs = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '[',
        )
    }
}