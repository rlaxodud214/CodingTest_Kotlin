class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        var clothesCount = IntArray(n + 1) { 1 }

        for (i in lost) {
            clothesCount[i]--
        }
        for (i in reserve) {
            clothesCount[i]++
        }

        for (idx in lost.sorted()) {
            if (clothesCount[idx] != 0) {
                continue
            }

            if (idx - 1 >= 0 && clothesCount[idx - 1] == 2) {
                clothesCount[idx - 1]--
                clothesCount[idx]++
                continue
            }

            if (idx + 1 < clothesCount.size && clothesCount[idx + 1] == 2) {
                clothesCount[idx + 1]--
                clothesCount[idx]++
                continue
            }
            answer--
        }
        return answer
    }
}