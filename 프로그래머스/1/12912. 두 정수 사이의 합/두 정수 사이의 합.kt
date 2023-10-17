class Solution {
    fun solution(a: Int, b: Int): Long {
        var al = a.toLong()
        var bl = b.toLong()
        
        return (minOf(al, bl)..maxOf(al, bl)).sumOf { it }
    }
}