class Solution {
    var correct = mutableListOf(0, 0, 0)

    fun solution(answers: IntArray): IntArray {
        for(idx in answers.indices) {
            correct[0] += iscorrect(p1, answers, idx)
            correct[1] += iscorrect(p2, answers, idx)
            correct[2] += iscorrect(p3, answers, idx)
        }

        val maxValue = correct.maxOf { it }

        return correct.mapIndexedNotNull { index, i ->
            if (i == maxValue) index + 1 else null
        }.toIntArray()
    }

    fun iscorrect(p: List<Int>, answers: IntArray, index: Int): Int {
        return if (p[index % p.size] == answers[index]) 1 else 0
    }

    companion object {
        val p1 = listOf(1, 2, 3, 4, 5)
        val p2 = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val p3 = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
    }
}