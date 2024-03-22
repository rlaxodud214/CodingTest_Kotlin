class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var stack = mutableListOf<Int>()

        for (num in ingredient) {
            stack.add(num)

            if (stack.size < 4 || num != 1) {
                continue
            }

            var sb = StringBuilder()

            for (i in 1..4) {
                sb.append(stack[stack.size - i])
            }

            if (sb.toString() == "1321") {
                repeat(4) {
                    stack.removeAt(stack.size - 1) // stack.removeLast()가 2배 느림
                }
                answer++
            }
        }

        return answer
    }
}