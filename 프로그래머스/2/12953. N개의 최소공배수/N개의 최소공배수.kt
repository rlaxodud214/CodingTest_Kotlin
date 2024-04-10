class Solution {
    fun solution(arr: IntArray): Int {
        return arr.fold(1) { acc, num ->
            acc * num / gcd(acc, num)
        }
    }

    // 최대 공약수 - 유클리드 호제법
    fun gcd(a: Int, b: Int): Int = if (a % b == 0) b else gcd(b, a % b)
}
