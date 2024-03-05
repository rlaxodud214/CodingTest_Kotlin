class Solution {
    fun solution(food: IntArray): String {
        var answer = StringBuilder()

        // 첫 번째 인덱스를 제외하고 roof 돌리기
        var round = 1
        food.sliceArray(IntRange(1, food.size - 1)).map {
            val canFoodCountByRound = it / 2

            answer.append((round.toString()).repeat(canFoodCountByRound))
            round += 1
            
            if (round == food.size) {
                val answerBackup = answer.reversed()
                answer.append(0)
                answer.append(answerBackup)
                return@map
            }
        }

        return answer.toString()
    }
}