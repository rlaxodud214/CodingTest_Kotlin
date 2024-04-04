class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val answer = IntArray(2) { 0 }
        val measures = gcd(yellow)

        for (num in measures) {
            val (row, col) = Pair(num, yellow / num)
           
            val brownCount = row * 2 + col * 2 + 4
            if (brownCount == brown) {
                answer[0] = col + 2
                answer[1] = row + 2
                break
            }
        }
        return answer
    }

    private fun gcd(a: Int): List<Int> {
        val measures = (1..a).filter {
            a % it == 0
        }

        return measures
    }
}