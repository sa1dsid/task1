fun inputType(): String {
    while (true) {
        println("Введите животное(cat/dog):")
        val animal = readln().lowercase()
        if (animal != "cat" && animal != "dog") {
            println("Ошибка: введите cat или dog")
            continue
        }
        return animal
    }
}

fun inputData(): Pair<String, Int> {
    while (true) {
        println("Введите имя и возраст вашего животного через пробел:")
        val input = readln()

        try {
            val parts = input.split(" ")
            val name = parts[0]
            val age = parts[1].toInt()
            return Pair(name, age)
        } catch (e: Exception) {
            println("Ошибка: убедитесь, что вы ввели имя и возраст правильно (например: Kesha 1)")
        }
    }
}

    fun main() {
        val cats = mutableListOf<Cat>()
        val dogs = mutableListOf<Dog>()

        while (true) {
            val type = inputType()
            val (name, age) = inputData()

            if (type == "cat") {
                val cat = Cat(name, age)
                cats.add(cat)
            } else {
                val dog = Dog(name, age)
                dogs.add(dog)
            }
            println("Элементы списка cats")
            for (i in cats) println(i)
            println("Элементы списка dogs")
            for (i in dogs) println(i)
        }
    }

