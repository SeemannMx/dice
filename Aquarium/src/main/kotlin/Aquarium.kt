class Aquarium(var width : Int = 20, private var height : Int = 40, private var length : Int = 100) {

    constructor(fishCount : Int): this() {}

    // function
    fun volumeFunc() : Int {
        return width * height * length / 1000
    }

    // attribute
    val volume : Int get() = width * height * length / 1000
}
