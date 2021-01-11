package composite

class File(@JvmField val name: String, @JvmField val size: Int): Entry() {

    override fun getName(): String = this.name

    override fun getSize(): Int = this.size

    override fun printList(prefix: String) {
        println("$prefix / $this")
    }

}