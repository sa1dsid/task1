abstract class Animal(
    private val name: String,
    private val age: Int
) {
    init {
        require(age >= 0) { "Возраст не может быть отрицательным" }
    }

    abstract fun makeSound()

    override fun toString(): String {
        return "Name: $name, Age: $age"
    }
}