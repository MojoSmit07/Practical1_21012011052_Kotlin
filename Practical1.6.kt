fun Math(a: Double, b: Double, operation: String): Double {
    var result = 0.0
    if (operation == "add") {
        result = a + b
    } else if (operation == "subtract") {
        result = a - b
    } else if (operation == "multiply") {
        result = a * b
    } else if (operation == "divide") {
        result = a / b
    }
    return result
}


fun main() {
    print("Enter First Number: ")
    val x = readLine()!!.toDouble()
    print("Enter Second Number: ")
    val y = readLine()!!.toDouble()

    println(Math(x, y, "add"))
    println(Math(x, y, "subtract"))
    println(Math(x, y, "multiply"))
    println(Math(x, y, "divide"))
}
