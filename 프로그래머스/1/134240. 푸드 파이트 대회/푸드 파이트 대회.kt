class Solution {
    fun solution(food: IntArray): String {
        var answer = StringBuilder()

        // 첫 번째 인덱스를 제외하고 roof 돌리기
        for ((index, i) in food.withIndex()) {
            if (index == 0) continue

            val canFoodCountByRound = i / 2

            answer.append((index.toString()).repeat(canFoodCountByRound))

            if (index == food.size - 1) {
                val reverseAnswer = answer.reversed()
                answer.append(0, reverseAnswer)
            }
        }

        return answer.toString()
    }
}