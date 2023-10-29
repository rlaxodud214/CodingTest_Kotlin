fun main(args: Array<String>) {
    val (y, x) = readLine()!!.split(' ').map(String::toInt)
    var sb = StringBuilder()

    repeat(x) {
        repeat(y) {
            sb.append('*')
        }
        sb.append("\n")
    }
    print(sb.toString())
}