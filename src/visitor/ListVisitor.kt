package visitor

class ListVisitor: Visitor() {

    var currentDir: String = ""

    override fun visit(file: File) {
        println("$currentDir/$file")
    }

    override fun visit(directory: Directory) {
        println("$currentDir/$directory")
        var saveDir: String = currentDir
        currentDir = "$currentDir/${directory.getName()}"
        var it: Iterator<Entry> = directory.iterator()
        while(it.hasNext()) {
            val entry: Entry = it.next()
            entry.accept(this)
        }
        currentDir = saveDir
    }


}