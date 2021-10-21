class Fish(color: Color = Red, food: String):
    Action by FishAction(food),
    Color by color

class FishAction(private val food: String): Action {
    override fun eat() {
        print(food)
    }
}

interface Action {
    fun eat()
}

interface Color {
    val color: String
}

object Red: Color {
    override val color: String
        get() = "red"
}
object Gold: Color {
    override val color: String
        get() = "gold"
}