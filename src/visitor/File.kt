package visitor

class File(@JvmField private val name: String, @JvmField private val size: Int): Entry() {
    override fun getName(): String = this.name
    override fun getSize(): Int = this.size

    override fun accept(visitor: Visitor) = visitor.visit(this)
}