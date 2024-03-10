class Solution {
    // 1. score를 정렬한다.
    // 2. m이 3이라면 -> 2번째 index의 값이 해당 그룹(0~2)에서 최소값이고
    //                  동일하게 5번째 값이 해당 그룹에서의 최소값이 된다.
    fun solution(k: Int, m: Int, score: IntArray): Int {
        val sortScore = score.sortedDescending()
        
        // score.size = 12 / m = 3 -> [2, 5, 8, 11] 뽑아내기
        val roofIndex = List(score.size / m) { it * m + (m - 1) } 

        return roofIndex.map {
            sortScore[it] * m
        }.sum()
    }
}