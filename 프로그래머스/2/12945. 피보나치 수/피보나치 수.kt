class Solution {
    // 메모이제이션과 재귀를 사용해서 시간 단축
    var fib = mutableListOf<Int>(0, 1, 1)
    
    fun solution(n: Int): Int {
        if (n > fib.size - 1) {
            fib.add((solution(n - 2) + solution(n - 1)) % 1234567)
        }
        
		return fib[n]
    }
}