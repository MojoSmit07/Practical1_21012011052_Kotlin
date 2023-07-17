fun main(){
    print("Enter enrollment number: ")
    val enrollmentNo = readLine()!!.toLong()

    print("Enter name: ")
    val name = readLine()!!

    print("Enter branch: ")
    val branch = readLine()!!

    print("Enter class: ")
    val className = readLine()!!

    print("Enter batch: ")
    val batch = readLine()!!

    print("Enter college name: ")
    val collegeName = readLine()!!

    print("Enter university name: ")
    val universityName = readLine()!!

    print("Enter age: ")
    val age = readLine()!!.toInt()

    println("Enrollment number: $enrollmentNo")
    println("Name: $name")
    println("Branch: $branch")
    println("Class: $className")
    println("Batch: $batch")
    println("College name: $collegeName")
    println("University name: $universityName")
    println("Age: $age")

}