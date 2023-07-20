fun factorial(x: Int): Int {
    if (x == 0) {
        return 1
    } else {
        return x * factorial(x - 1)
    }

}

fun main() {
    print("Enter Number: ")
    val num = readLine()!!.toInt()
    println("Factorial of $num is ${factorial(num)}")
}
