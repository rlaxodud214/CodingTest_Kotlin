class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        for(i in arr1.indices) {
            for(j in arr1[i].indices) {
                arr1[i][j] += arr2[i][j]
            }
        }

        return arr1
    }
}