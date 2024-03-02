class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.fold(listOf<Int>()) { acc, command ->
            val (i, j, k) = command.map { it - 1 }
            val subArray = array.sliceArray(i..j).sorted()
            
            acc + subArray[k]
        }.toIntArray()
    }
}