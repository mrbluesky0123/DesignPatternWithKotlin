package memento

import java.util.*

class CareTaker {
    val mementos: Stack<Memento> = Stack()

    fun push(memento: Memento): Unit {
        this.mementos.push(memento)
    }

    fun pop(): Memento = this.mementos.pop()

}