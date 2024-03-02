class Solution {
    fun solution(numbers: IntArray): IntArray {
        // 2개씩 더해서 나올 수 있는 모든 경우의 수
        return  numbers.foldIndexed(setOf<Int>()) { index, acc, i ->
            val specialNumbers = numbers.filterIndexed { index2, i ->
                index != index2
            }.map { it + i }

            acc + specialNumbers.toSet()
        }.sorted().toIntArray()
    }
}