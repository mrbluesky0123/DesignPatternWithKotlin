package visitor

class Directory(@JvmField private val name: String): Entry() {

    val dir: ArrayList<Entry> = ArrayList()

    override fun getName(): String = this.name
    override fun getSize(): Int {
        var size: Int = 0
        var it: Iterator<Entry> = dir.iterator()
        while(it.hasNext()) {
            val entry: Entry = it.next()
            size += entry.getSize()
        }
        return size
    }

    override fun add(entry: Entry): Entry {
        dir.add(entry)
        return this
    }

    override fun iterator(): Iterator<Entry> {
        return dir.iterator()
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}