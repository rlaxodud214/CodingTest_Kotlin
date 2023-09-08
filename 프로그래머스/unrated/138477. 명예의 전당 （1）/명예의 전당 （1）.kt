class Solution {
    fun solution(k: Int, scores: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        val ranking = mutableListOf<Int>()
        for(score in scores) {
            // 1. 빈 배열에 k만큼 score 추가
            if(ranking.size < k) {
                ranking.add(score)
                answer.add(ranking.minOrNull() ?: 0)
                continue
            }
            
            // 2. 다 채운 후) ranking의 최소값보다 크다면 score로 값 변경
            val minvalue = ranking.minOrNull() ?: 0
            if(score > minvalue) {
                ranking[ranking.indexOf(minvalue)] = score
            }
            answer.add(ranking.minOrNull() ?: 0)
        }
        return answer.toIntArray()
    }
}