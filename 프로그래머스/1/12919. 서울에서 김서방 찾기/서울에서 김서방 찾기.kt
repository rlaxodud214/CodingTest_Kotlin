class Solution {
    fun solution(seoul: Array<String>): String {
        // 정렬한 뒤 탐색하는 것 보다는 바로 찾는 게 O(N)으로 가장 효율적일 것 같다.
        // [다른 사람의 풀이] indexOf 대신 indexOfFirst를 사용 -> 성능이 약 2배 좋음
        return "김서방은 ${seoul.indexOfFirst { it == "Kim" }}에 있다"
    }
}