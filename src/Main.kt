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
        val input = readlnOrNull()?.split(" ")

        if (input == null || input.size != 2) {
            println("Ошибка: убедитесь, что вы ввели имя и возраст правильно (например: Kesha 1)")
            continue
        }

        val name = input[0]
        val age: Int

        try {
            age = input[1].toInt()
        } catch (e: NumberFormatException) {
            println("Ошибка: убедитесь что вы корректно ввели возраст вашего животного")
            continue
        }


        if (age < 0) {
            println("Ошибка: убедитесь что вы корректно ввели возраст вашего животного")
            continue
        }
        return Pair(name, age)

    }
}

fun main() {
    val cats = mutableListOf<Cat>()
    val dogs = mutableListOf<Dog>()

    // val testCat = Cat("bob", -1)

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

// обработать отрицательный age илегал аргумент исключение +
// сделать фабрику чтобы было легко расширять ( добавить животное )
// сделал makesound abstract and class animal abstract +
// fff 5 fff (проверить ввод) +
// обращаюсь к несуществующему индексу val age = parts[1].toInt() когда пустой ввод +
// валидация в конструкторе и при вводе в консоли age +