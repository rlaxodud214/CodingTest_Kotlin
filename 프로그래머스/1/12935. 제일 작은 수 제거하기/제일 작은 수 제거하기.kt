class Solution {
    fun solution(arr: IntArray): IntArray {
        if (arr.size == 1) {
            return intArrayOf(-1)
        }

        val minValueIndex = arr.minValueOfIndex()
        
        val mutableList = arr.toMutableList()
        mutableList.removeAt(minValueIndex)
        return mutableList.toIntArray()
    }
    
    fun IntArray.minValueOfIndex(): Int {
        var minValueIndex = 0
        
        this.forEachIndexed { index, value ->
            if (this[minValueIndex] > value)
                minValueIndex = index
        }
        
        return minValueIndex
    }

    // fun IntArray.removeAt(index: Int): IntArray {
    //     return IntArray(this.size - 1) {
    //         if (it < index) this[it] else this[it + 1]
    //     }
    // }
}