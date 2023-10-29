    class Solution {
        fun solution(price: Int, money: Int, count: Int): Long {
            // 합 공식 : n * (n+1) / 2
            var amountPrice = price.toLong() * (count * (count + 1) / 2)

            return if(amountPrice > money) amountPrice - money else 0L
        }
    }