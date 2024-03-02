class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()

        for(command in commands) {
            val (i, j, k) = command.map { it - 1 }

            val subArray = array.sliceArray(i..j).sorted()

            answer.add(subArray[k])
        }
        return answer.toIntArray()
    }
}