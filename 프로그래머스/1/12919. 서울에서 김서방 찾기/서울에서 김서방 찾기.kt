class Solution {
    fun solution(seoul: Array<String>): String {
        // 정렬한 뒤 탐색하는 것 보다는 바로 찾는 게 O(N)으로 가장 효율적일 것 같다.
        return "김서방은 ${seoul.indexOf("Kim")}에 있다"
    }
}