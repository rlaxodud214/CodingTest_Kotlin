class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer = StringBuilder()

        for (ch in s) {
            var count = index
            var convertCh = ch

            while (count > 0) {
                convertCh += 1

                if (convertCh.code == 'z'.code + 1) {
                    convertCh = 'a'
                }
                
                if (convertCh in skip) {
                    continue
                }
                count--
            }
            answer.append(convertCh)
        }

        return answer.toString()
    }
}