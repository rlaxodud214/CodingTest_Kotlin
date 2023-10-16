class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var index1 = 0
        var index2 = 0
        
        goal.forEach { 
            if (it != cards1[index1] && it != cards2[index2]) 
                return "No"
            
            if (index1 < cards1.size - 1 && it == cards1[index1])
                index1++
            if (index2 < cards2.size - 1 && it == cards2[index2])
                index2++
        }
        return "Yes"
    }
}