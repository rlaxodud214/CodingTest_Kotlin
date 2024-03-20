class Solution {
    fun solution(keymaps: Array<String>, targets: Array<String>): IntArray {
        var answer = IntArray(targets.size) { -1 }
        var matchIndex = mutableMapOf<Char, Int>()

        for (keymap in keymaps) { // ABACD
            for(i in keymap.indices) {
                if (!matchIndex.containsKey(keymap[i])) {
                    matchIndex[keymap[i]] = i + 1
                } else if (matchIndex[keymap[i]]!! > i + 1){
                    matchIndex[keymap[i]] = i + 1
                }
            }
        }

        for (i in targets.indices) { // ABCD
            if (targets[i].any { matchIndex.containsKey(it).not() }) {
                answer[i] = -1
            } else {
                answer[i] = targets[i].map { matchIndex[it]!! }.sumOf { it }
            }
        }
        return answer
    }
}