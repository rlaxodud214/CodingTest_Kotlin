import java.util.*

class Solution {
    fun solution(s: String): String {
        val array = s.toCharArray()

        for(i in 0 until array.size){
            for (j in i until array.size) {
                if (array[i] < array[j]) {
                    // array[i] = array[j].also { array[j] = array[i] }
                    val temp = array[i]
                    array[i] = array[j]
                    array[j] = temp
                } 
            }
        }
        // return array.joinToString("") -> 문자 간에 특별한 키워드를 넣어야 할때만 사용하자. 효율이 안 좋다.
        return String(array)
    }
    // 느낀점 : 다양한 확장함수를 쓰는 것 보다 아주 기본적으로 구현했을 때, 성능과 메모리가 훨씬 좋았다..
}