class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goals: Array<String>): String {
        var answer = true
        var (index1, index2) = Pair(0, 0)

        for(goal in goals) {
            when {
                index1 < cards1.size && goal == cards1[index1] -> index1++
                index2 < cards2.size && goal == cards2[index2] -> index2++
                else -> answer = false
            }
        }

        return if(answer) "Yes" else "No"
    }
}