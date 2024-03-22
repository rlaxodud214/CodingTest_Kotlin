class Solution {
    fun solution(ingredient: IntArray): Int {
        var ingredientCopy = ingredient.toMutableList()
        var answer: Int = 0
        var idx = -1
        
        while(idx < ingredientCopy.size - 4) {
            idx++
            if(ingredientCopy[idx] == 1 && ingredientCopy[idx+1] == 2 && ingredientCopy[idx+2] == 3 && ingredientCopy[idx+3] == 1) {
                
                for(i in 1..4) ingredientCopy.removeAt(idx)

                if(idx > 3) idx-= 3 else idx = -1
                answer++
            }
        }
        return answer
    }
}