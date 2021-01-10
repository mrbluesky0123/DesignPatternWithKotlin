package visitor

interface Element {
    abstract fun accept(visitor: Visitor): Unit
}