class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photos: Array<Array<String>>): IntArray {
        var answer = mutableListOf<Int>()
        
        // 1. <name : yearning> map 타입의 YearningByname 생성
        val YearningByname = name.zip(yearning.toList()).toMap()
        
        // 2. photo를 YearningByname의 키값으로 써서 Yearing를 answer[index]에 누적시키기
        photos.mapIndexed { index, photo ->
            answer.add(0)
            photo.map { name ->
                var Yearing: Int = YearningByname[name] ?: 0
                answer[index] += Yearing
            }
        }
        
        return answer.toIntArray()
    }
}