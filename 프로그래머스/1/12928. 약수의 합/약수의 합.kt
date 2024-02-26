class Solution {
    fun solution(n: Int) = (1..n).filter { n % it == 0 }.sum()
}