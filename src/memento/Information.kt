package memento

class Information (var data: String, var intData: Int){

    fun createMemento() = Memento(this.data, this.intData)

    fun restoreMemento(memento: Memento) {
        this.data = memento.data
        this.intData = memento.intData
    }

    override fun toString() = "${this.data} // ${this.intData}"

}