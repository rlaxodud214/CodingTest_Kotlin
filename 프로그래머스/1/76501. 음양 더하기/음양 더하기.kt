class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        
        absolutes.mapIndexed { index, it ->
            answer += it.takeIf { signs[index] } ?: it * (-1)
        }
        return answer
    }
}