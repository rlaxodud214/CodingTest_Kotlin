class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        // 총 이용 횟수 구할 때, sum()함수 사용 시 소요 시간 8ms 정도 추가됨 - (1..count).sum()
        val totalCount = count * (count + 1) / 2  // 합 공식 : n * (n+1) / 2
        val amountPrice = price.toLong() * totalCount

        return (amountPrice - money).takeIf { amountPrice > money } ?: 0L
    }
}