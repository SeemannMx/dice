import kotlin.Unit as Unit1

fun main(){

    val aquarium = Aquarium()
    aquarium.volume

    val fish = Fish(Red, "greens")
    fish.eat()
}

// singelton
object Singeltion {
}

// hold data / attributes only
data class A(val value : Any) {}
data class B(val value : Any) {}

// enums
enum class Enum(val v: Any) {
    A(v = 0),
    B(v = 1)
}

// something like private classes
sealed class OnlyHere

class WithCompanion {
    // for const declaration
    companion object CompanionForConstants {
    }
}

// some generics magic
val a = A(0)
inline fun <reified R: A> isA() = a is A

annotation class MyAnnotation

@MyAnnotation
class SomeClass {

}

fun label() {
    // label break --> jump back to the label if the loop breaks
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if(i > 10 ) break@loop
        }
    }
}
