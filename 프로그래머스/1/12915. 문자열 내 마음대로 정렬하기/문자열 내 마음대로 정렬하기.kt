class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()

        strings.sortWith( Comparator { a, b ->
            (a[n].compareTo(b[n])).takeIf { it != 0 } ?: a.compareTo(b)
        })

        return strings
    }
}