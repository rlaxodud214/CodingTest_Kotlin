class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        val totalCount = count * (count + 1) / 2  // 합 공식 : n * (n+1) / 2
        val amountPrice = price.toLong() * totalCount

        return (amountPrice - money).takeIf { amountPrice > money } ?: 0L
    }
}