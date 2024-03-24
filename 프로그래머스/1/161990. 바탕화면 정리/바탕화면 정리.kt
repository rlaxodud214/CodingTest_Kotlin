class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var (minX, minY) = Pair(wallpaper.size, wallpaper[0].length)
        var (maxX, maxY) = Pair(0, 0)

        for (x in wallpaper.indices) { // 0, 1
            for (y in wallpaper[x].indices) { // 0, 1, 2, 3, 4
                if (wallpaper[x][y] != '#') {
                    continue
                }

                minX = minOf(x, minX)
                minY = minOf(y, minY)
                maxX = maxOf(x, maxX)
                maxY = maxOf(y, maxY)
            }
        }

        return intArrayOf(minX, minY, maxX + 1, maxY + 1) // 1, 4, 2, 5
    }
}