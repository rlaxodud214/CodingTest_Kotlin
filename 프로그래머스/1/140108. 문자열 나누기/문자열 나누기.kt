class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        
        // stack 대신 count와 baseC 사용!
        var count = 0
        var baseC = ""

        s.forEach { ch ->
            var str = ch.toString()

            // 매칭이 끝난 후 새로운 문자가 들어올 때 실행(처음 포함)되므로,
            // 예전처럼 testCase 2번에 마지막 a와 같은 상황을 별도로 처리하지 않아도 된다.
            if (count == 0) {
                baseC = str
                answer++
                count++
            }

            else if (baseC == str) { // baseC와 같은 경우
                count++
            }
            
            else { // baseC와 다른 경우
                count--
            }
        }
        return answer
        
        /*
            매번 느끼는 점 : 무조건 넣고 빼려고 생각하지 말자. 
            1. x인 경우 x가 아닌 경우 2가지로 생각하면 x가 아닐때, x의 count를 감소시키면 된다!. 
               -> x가 아닌 경우의 count를 별도로 만들 필요 없음!
            2. 문자는 x만 stack에 들어갔으므로 x를 백업하고 count만 해도 된다.
        */
    }
}

/* 다른 사람의 풀이 -> 분석 후 참고해서 기존 코드 재구성
        
    var answer: Int = 0
    val stack = mutableListOf<Char>()

    s.forEach { 
        // 빈 경우 x인 것과 아닌 것의 개수가 동일했다는 것이므로 ++
        if (stack.isEmpty()) {
            answer++
            stack.add(it)
        } 
        // it이 x라면
        else if (stack.first() == it) {
            stack.add(it)
        } 
        // it이 x가 아니라면 x요소 1개 제거 -> 포인트는 스택엔 x만 들어간다는 거!
        else {
            stack.removeFirst()
        }
    }
    return answer
    
    // 보고 배운 점 : 기존의 내 코드는 count를 누적하는 형식이였지만, 굳이 누적할 필요 없이 x와 다른 경우 pop을 통해서 x를 빼버리면 된다!!!!
*/



/* 기존 내 코드

    var answer: Int = 0
    var count = IntArray(2) { 0 }
    var baseC = ""

    s.forEach { ch ->
        var str = ch.toString()

        // baseC가 비어있는 경우
        if (baseC == "") {
            baseC = str
            count[0]++
        }

        // baseC와 같은 경우
        else if (baseC == str) {
            count[0]++
        }

        // baseC와 다른 경우
        else if (baseC != str) {
            count[1]++
        }

        // 초기화
        if (count[0] == count[1]) {
            answer++
            baseC = ""
            count = IntArray(2) { 0 }
        }
    }

    if(baseC != "")
        answer++

    return answer

*/