abstract class Animal(
    private val name: String,
    private val age: Int
) {

    abstract fun makeSound()

    override fun toString(): String {
        return "Name: $name, Age: $age"
    }
}

object AnimalFactory {
    fun create(type: String, name: String, age: Int): Animal? {
        if (age < 0) {
            println("Ошибка: возраст не может быть отрицательным")
            return null
        }
        return when (type.lowercase()) {
            "cat" -> Cat(name, age)
            "dog" -> Dog(name, age)
            "parrot" -> Parrot(name, age)
            else -> {
                println("Такого животного не существует")
                return null
            }
        }
    }
}