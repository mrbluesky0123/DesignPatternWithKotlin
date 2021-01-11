package composite

class Directory(@JvmField val name: String): Entry() {

    private var directory: ArrayList<Entry> = ArrayList()

    override fun getName(): String = this.name

    override fun getSize(): Int {
        var size: Int = 0
        var it = directory.iterator()
        while(it.hasNext()) {
            var entry: Entry = it.next()
            size += entry.getSize()
        }
        return size
    }

    override fun add(entry: Entry) {
        directory.add(entry)
    }

    override fun printList(prefix: String) {
        println("$prefix / $this")
        var it = directory.iterator()
        while(it.hasNext()) {
            var entry: Entry = it.next()
            entry.printList("$prefix / $this")
        }
    }

}