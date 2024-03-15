class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var matchCount = IntArray(2) { 7 } // max, min

        // 1. lottos와 win_nums 간에 일치하는 숫자의 개수를 파악한다.
        lottos.forEach { lottoNumber ->
            matchCount[0] -= win_nums.count { it == lottoNumber }
            matchCount[1] -= win_nums.count { it == lottoNumber }
        }

        // 2. lottos의 0의 개수를 빼준다.
        matchCount[0] -= lottos.count { it == 0 }

        // 3. 낙첨일 경우 6등으로 변환한다.
        for (i in matchCount.indices) {
            if (matchCount[i] == 7) {
                matchCount[i] = 6
            }
        }

        return matchCount
    }
}