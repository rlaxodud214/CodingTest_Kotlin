class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goals: Array<String>): String {
        var (index1, index2) = Pair(0, 0)

        for(goal in goals) {
            when {
                index1 < cards1.size && goal == cards1[index1] -> index1++
                index2 < cards2.size && goal == cards2[index2] -> index2++
                else -> return "No" // Answer이 false인 상태에서 무의미하게 추가로 도는 로직 개선
            }
        }

        return "Yes"
    }
}