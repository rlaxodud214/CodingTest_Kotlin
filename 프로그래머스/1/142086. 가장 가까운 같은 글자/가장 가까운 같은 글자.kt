class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var nearIndex = mutableMapOf<Char, Int>()

        s.forEachIndexed { index, ch ->
            val isContainsKey = nearIndex.containsKey(ch)
            answer += if(isContainsKey) index - nearIndex[ch]!! else -1
            nearIndex[ch] = index
        }
        return answer
    }
}