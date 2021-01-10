package visitor

abstract class Entry: Element {
    abstract fun getName(): String
    abstract fun getSize(): Int

    @Throws(FileTreatmentException::class)
    open fun add(entry: Entry): Entry {
        throw FileTreatmentException()
    }

    @Throws(FileTreatmentException::class)
    open fun iterator(): Iterator<Entry> {
        throw FileTreatmentException()
    }

    override fun toString(): String = "${this.getName()} (${this.getSize()})"
}