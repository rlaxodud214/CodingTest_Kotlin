class Solution {
    fun solution(numbers: IntArray): String {
        var answer = mergeSort(numbers).joinToString("")
        if(answer.all {it == '0'})
            answer = "0"
        return answer
    }
    
    fun mergeSort(arr: IntArray): IntArray {
        if(arr.size == 1)
            return arr
        
        val mid = arr.size / 2
        val left = arr.sliceArray(0 until mid)
        val right = arr.sliceArray(mid until arr.size)

        return merge(mergeSort(left), mergeSort(right))
    }
    
    fun merge(left: IntArray, right:IntArray) : IntArray {
        var result = IntArray(left.size + right.size)
        var (lei, rii, rei) = Triple(0, 0, 0)
        
        while(lei < left.size && rii < right.size) {
            // Point : 이 로직만 잘 바꾸면 끝
            // left+right 순서로 붙였을 때랑 right+left 순서로 붙였을 때랑 크기 비교
            val lPlusR = (left[lei].toString() + right[rii].toString()).toInt()
            val rPlusL = (right[rii].toString() + left[lei].toString()).toInt()

            if(lPlusR > rPlusL) 
                result[rei++] = left[lei++]
            else
                result[rei++] = right[rii++]    
        }
    
        while(lei<left.size) 
            result[rei++] = left[lei++]
        
        while(rii<right.size) 
            result[rei++] = right[rii++]
    
        return result
    }
}