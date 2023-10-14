class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photos: Array<Array<String>>): IntArray {
        
        // 1. <name : yearning> map 타입의 YearningByname 생성
        val YearningByname = name.zip(yearning.toList()).toMap()
        
        // 2. photo를 YearningByname의 키값으로 써서 Yearing 합산 후 반환
        return photos.map { photo -> photo.sumOf { YearningByname[it] ?: 0 } }.toIntArray()
    }
}