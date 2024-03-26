class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        // 2. map사용
        val playerMaps = mutableMapOf<String, Int>()
        for ((index, name) in players.withIndex()) {
            playerMaps[name] = index
        }

        for (targetName in callings) {
            val curIndex = playerMaps[targetName]
            val preIndex = curIndex!! - 1

            players[curIndex] = players[preIndex].also { players[preIndex] = players[curIndex] }

            // 순위 변경에 따라 playerMaps 최신화
            playerMaps[players[curIndex]] = curIndex
            playerMaps[players[preIndex]] = preIndex
        }

        return players
    }
}