fun main(args: Array<String>) {
    val (y, x) = readLine()!!.split(' ').map(String::toInt)

    println(("*".repeat(y) + "\n").repeat(x))
}