class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        
        for(command in commands) {
            val i = command[0] -1
            val j = command[1]
            val k = command[2] -1
            
            val slicedarray = array.sliceArray(i until j).sorted()
            
            answer.add(slicedarray[k])
        }
        return answer.toIntArray()
    }
}