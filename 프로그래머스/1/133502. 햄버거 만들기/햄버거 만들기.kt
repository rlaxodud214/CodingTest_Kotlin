import java.util.Stack

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var stack = Stack<Int>()
        val goal = listOf(1, 3, 2, 1)

        outer@ for (num in ingredient) {
            stack.push(num)

            if (stack.size < 4 || num != 1) {
                continue
            }

            for (i in 1..4) {
                if (goal[i - 1] != stack[stack.size - i]) {
                    continue@outer
                }
            }

            repeat(4) {
                stack.pop()
            }
            answer++
        }

        return answer
    }
}