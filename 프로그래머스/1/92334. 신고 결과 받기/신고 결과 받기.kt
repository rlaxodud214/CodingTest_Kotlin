class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answerMap = id_list.associateWith { 0 }.toMutableMap()
        val reportUser = mutableMapOf<String, MutableSet<String>>()

        // 1. 유저 별로 신고 당한 고유의 횟수를 파악 + 누가 신고 했는지 체크하기
        // 신고 당한 사람이 Key값, 신고한 사람이 Value -> <fromID, toID>
        for ((i, names) in report.withIndex()) {
            val (toID, fromID) = names.split(" ")

            reportUser.getOrPut(fromID) { mutableSetOf() }.add(toID)
        }

        // 2. (신고를 K번 이상 당한 유저들을) 신고한 사람들 뽑기
        val reportedUsers = reportUser.filter { it.value.size >= k }.values

        for (names in reportedUsers) {
            for (name in names) {
                answerMap[name] = answerMap[name]!! + 1
            }
        }

        return answerMap.values.toIntArray()
    }
}