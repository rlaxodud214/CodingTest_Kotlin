class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        
        var (longLength, shortLength) = Pair(0, 0)
        
        for ((x, y) in sizes) {
            val maxValue = maxOf(x, y)
            val minValue = minOf(x, y)
            longLength = maxOf(longLength, maxValue)
            shortLength = maxOf(shortLength, minValue)
        }
        
        return longLength * shortLength       
    }
}