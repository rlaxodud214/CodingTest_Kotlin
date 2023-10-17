class Solution {
    fun solution(n: Int): Int {
        // first(): 리스트의 첫 번째 요소 반환
        // first { 조건 }: 조건을 만족하는 첫 번째 요소 반환
        return (1..n).first { n % it == 1 }
    }
}