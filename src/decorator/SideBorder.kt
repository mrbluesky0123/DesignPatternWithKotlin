package decorator

class SideBorder(override val display: Display, val ch: Char): Border(display) {
    override fun getColumns(): Int = 1 + this.display.getColumns() + 1

    override fun getRows(): Int = this.display.getRows()

    override fun getRowText(row: Int): String? = ch.toString()  + this.display.getRowText(row) + ch.toString()
}