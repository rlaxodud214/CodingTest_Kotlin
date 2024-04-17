class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array(arr1.size) { IntArray(arr2[0].size) }
        
        // C[i][j] = A[i][1]B[1][j] + A[i][2]B[2][j] + ... + A[i][n]*B[n][j]
        for (i in arr1.indices) {
            for (j in arr2[0].indices) {
                var sum = 0

                for (n in arr1[i].indices) {
                    sum += arr1[i][n] * arr2[n][j]
                }
                
                answer[i][j] =  sum
            }
        }

        return answer
    }
}