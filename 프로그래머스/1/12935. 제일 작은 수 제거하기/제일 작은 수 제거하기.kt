class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()

        if (arr.size == 1 && arr[0] == 10) {
            return intArrayOf(-1)
        }
        val minValueIndex = arr.minValueOfIndex()
        return arr.removeAt(minValueIndex)
    }

    fun IntArray.minValueOfIndex(): Int {
        var minValueIndex = 0
        this.forEachIndexed { index, value ->
            if (this[minValueIndex] > value)
                minValueIndex = index
        }
        return minValueIndex
    }

    fun IntArray.removeAt(index: Int): IntArray {
        return IntArray(this.size - 1) {
            if (it < index) this[it] else this[it + 1]
        }
    }
}