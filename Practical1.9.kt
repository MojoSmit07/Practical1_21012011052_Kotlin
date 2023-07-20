fun main(){
    val numbers = arrayListOf(1, 2, 3, 4, 5)

    var max = Int.MIN_VALUE
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    println("Maximum using without Builtin Fn: "+ max)

    val max2 = numbers.maxOrNull()
    println("Maximum using Builtin Fn: "+ max2)

}