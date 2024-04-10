class Solution {
    fun solution(n: Int): Long {
        if (n <= 2) {
            return n.toLong()
        }

        // n == 5일 때 -> 4에서 1칸 가기 + 3에서 2칸 가기
        // f(n) = f(n-1) + f(n-2)
        return (3..n).fold(Pair(1L, 2L)) { acc, num ->
            val fn = acc.run {
                (first + second) % 1234567
            }
            Pair(acc.second, fn)
        }.second
    }
}