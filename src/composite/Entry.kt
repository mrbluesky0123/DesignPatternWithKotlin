package composite

import kotlin.jvm.Throws

abstract class Entry {
    abstract fun getName(): String
    abstract fun getSize(): Int

    @Throws(FileTreatmentException::class)
    open fun add(entry: Entry) {
        throw FileTreatmentException()
    }
    fun printList(): Unit {
        printList(" ")
    }
    abstract fun printList(prefix: String): Unit
    override fun toString() = "${this.getName()} (${this.getSize()})"
}