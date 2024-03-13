class Solution {
    fun solution(n: Int, m: Int, sections: IntArray): Int {
        var answer = 0
        var nextSection = 0

        for (section in sections) {
            if (section >= nextSection) {
                nextSection = section + m
                answer++
            }
        }
        return answer
    }
}
/* 

느낀점 : 시각적으로 생각해서 굳이 배열을 만들고 색칠을 할 필요가 없다
생각을 바꾸자 / nextSection으로부터 m만큼 칠한다. -> m만큼 더한다.
--이후 재구현--
분명 전에 이해했다고 생각했는데 로직을 제대로 짜는데 꽤 많은 시간이 걸렸다
TODO: 이번주 일요일에 다시 풀어보기

*/ 