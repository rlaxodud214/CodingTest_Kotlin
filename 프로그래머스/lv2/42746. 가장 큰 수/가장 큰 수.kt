class Solution {
    fun solution(numbers: IntArray): String {
        var answer: String = ""
        /* Kotiln에서 쓰는 배열 정렬함수
        1. sorted() / sortedDescending() : 오름차순 / 내림차순 정렬 (조건 X)
        2. sortedBy() / sortedByDescending() : value의 특성을 기반으로 정렬 ex) 배열.sortedBy { it.length } or 배열.sortedBy { it.last() }
        3. sortedWith(): Comparator를 사용하여 정렬된 새로운 배열을 반환 -> 많이 쓸 듯                                                    */
        
        numbers.sortedWith(Comparator { 
            a, b -> "$b$a".compareTo("$a$b")
        }).forEach { answer += it }
        
        if(answer.all {it == '0'}) answer = "0"
        
        return answer
        
        // var answer = mergeSort(numbers).joinToString("")
        // return answer
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
            // left+right 순서로 붙였을 때랑 right+left 순서로 붙였을 때랑 크기 비교
            val lPlusR = left[lei].toString() + right[rii].toString()
            val rPlusL = right[rii].toString() + left[lei].toString()

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