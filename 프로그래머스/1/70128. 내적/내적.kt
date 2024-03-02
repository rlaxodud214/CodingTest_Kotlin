class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return (0 until a.size).fold(0) { acc, index ->
            acc + a[index] * b[index]
        }
    }

    /*
    
    // zip으로 새로운 list를 만들기 보다는 있는 걸 최대한 활용하자.
    fun solution(a: IntArray, b: IntArray): Int {
        return a.zip(b)
            .map { (a, b) -> a * b }
            .sum()
    }

    */
}