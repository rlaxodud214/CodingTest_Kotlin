class Solution {
    fun solution(n: Int): String {
        val repeatCount = n / 2
        val lastChar = if (n % 2 == 1) "수" else ""

        val sb = StringBuilder(n)
        repeat(repeatCount) {
            sb.append("수박")
        }
        sb.append(lastChar) // return에서 + 연산자로 lastChar를 더하면 약 2.0ms가 느려졌음
        return sb.toString()
    }
}

/* [GPT Q&A] String 확장함수인 repeat를 사용하는 것 보다 직접 StringBuilder를 생성해서 반복시키는 게 훨씬 빨랐다. 무슨 차이가 있는 걸까?
   -> 1) String.repeat 함수를 사용할 때는 추가적인 메서드 호출, 인스턴스 생성 등의 오버헤드가 있을 수 있음
      2) 직접 구현 시에는 단 한번의 'StringBuilder' 인스턴스만 생성되고, 모든 작업이 생성된 하나의 인스턴스에서 처리됨
*/