class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        // 1) indexOf의 시간복잡도 이슈로 인해서 시간 초과
        // for(target in callings) {
        //     val curIndex = players.indexOf(target)
        //     val preIndex = players.indexOf(target)-1
        //     players[curIndex] = players[preIndex].also { players[preIndex] = players[curIndex] } 
        // }
        
        // 2) Map을 통해 인덱스 백업 <이름, index>
        val playerMaps = mutableMapOf<String, Int>()
        for ((index, player) in players.withIndex()) {
            playerMaps[player] = index
        }
        
        for(target in callings) {
            val curIndex = playerMaps[target] ?: -1;
            val preIndex = curIndex?.minus(1) ?: -1;
            
            if (preIndex == -1) break
            
            // 순위 변경
            players[curIndex] = players[preIndex].also { players[preIndex] = players[curIndex] } 
                
            // 순위 변경에 따라 playerMaps 최신화
            playerMaps[players[curIndex]] = curIndex
            playerMaps[players[preIndex]] = preIndex
        }
        return players
    }
}