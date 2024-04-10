class Solution {fun solution(n: Int, left: Long, right: Long): IntArray {
        val size = right.toInt() - left.toInt() + 1

        var answer = IntArray(size)
        var indexPairs = MutableList<Pair<Long, Long>>(size) { Pair(0L, 0L) }

        // 매트릭스에서 필요한 i, j값 구하기
        (left..right).forEach {
            val (i, j) = Pair(it / n, it % n)
            // println("it: $it -> i: $i, j: $j")

            indexPairs[(it - left).toInt()] = Pair(i, j)
        }

        var index = 0

        for ((i, j) in indexPairs) {
            answer[index++] = (if (i >= j) {
                i + 1
            } else {
                j + 1
            }).toInt()
        }
        return answer
    }
}