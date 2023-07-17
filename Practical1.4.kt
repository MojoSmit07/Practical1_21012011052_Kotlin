fun main(){
    println("Enter Number: ")
    val x = readLine()!!.toInt()

    if (x % 2 == 0)
        println("$x is even")
    else
        println("$x is odd")

}