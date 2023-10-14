class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var matchCount = 0
        
        // 1. lottos와 win_nums 간에 일치하는 숫자의 개수를 파악한다.
        lottos.forEach { lotto ->
            matchCount += win_nums.count { it == lotto }
        }
        
        // 2. lottos에 있는 0의 개수를 파악한다.
        var zeroCount = lottos.count { it == 0}
        
        // 3. 최소 순위 = 7 - 당첨 숫자 개수
        var max = 7 - matchCount - zeroCount
        var min = 7 - matchCount
        
        // map 썼을 때, 5.89ms -> if문 썼을 때, 0.02ms 시간차이 많이남
        if(max > 6) max = 6
        if(min > 6) min = 6
        
        return intArrayOf(max, min)
    }
}