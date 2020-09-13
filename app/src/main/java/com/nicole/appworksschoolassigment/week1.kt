package com.nicole.appworksschoolassigment


fun main() {

    val p1 = Human("Nicole")
    println(p1.attack())

    val p2 = Mage("Jenny")
    println(p2.attack())

    p1.confirm()

}

open class Human(var name : String) {
    private val ismagic = false

    open fun attack() : String {
        return "$name use Fist Attack!"
    }

    fun confirm() {
        if (ismagic) {
            println("Human has mana！")
        } else {
            println("Human has not mana！")
        }
    }

}

class Mage(name: String) : Human(name) {
    override fun attack() : String {
        return "$name use Fireball!"
    }
}