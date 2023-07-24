class Car(val type: String, val model: Int, val price: Double, val owner: String, val milesDrive: Int) {
    constructor(type: String, model: Int, price: Double, owner: String) : this(type, model, price, owner, 0)

    fun getCarPrice(): Double {
        return this.price - (this.milesDrive.toDouble() * 10)
    }

    fun getOriginalCarPrice(): Double {
        return this.price
    }

    fun getCurrentCarPrice(): Double {
        return getCarPrice()
    }

    fun displayCarInfo() {
        println("Type: $type")
        println("Model: $model")
        println("Price: $price")
        println("Owner: $owner")
        println("Miles Drive: $milesDrive")
        println("Current Price: ${getCarPrice()}")
    }
}

fun main() {
    val car = Car("BMW", 2015, 10000.0, "Smit", 105)
    car.displayCarInfo()
}
