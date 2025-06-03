class Cat(name: String, age: Int) : Animal(name, age) {
    override fun makeSound() {
        println("мяу")
    }
}