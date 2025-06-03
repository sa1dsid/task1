open class Animal(
    private val name: String,
    private val age: Int
) {

    open fun makeSound() {
        println("Издать звук")
    }

    override fun toString(): String {
        return "Name: $name, Age: $age"
    }
}