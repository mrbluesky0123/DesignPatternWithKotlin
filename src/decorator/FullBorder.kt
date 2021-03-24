package decorator

class FullBorder(override val display: Display): Border(display){
    override fun getColumns(): Int = 1 + display.getColumns() + 1

    override fun getRows(): Int = 1 + display.getRows() + 1

    override fun getRowText(row: Int): String? {
        return if(row == 0) {
            "+" + makeLine('-', display.getColumns()) + "+"
        } else if (row == display.getRows() + 1) {
            "+" + makeLine('-', display.getColumns()) + "+"
        } else {
            "|" + display.getRowText(row - 1) + "|"
        }
    }

    private fun makeLine(ch: Char, count: Int): String {
        var buf: StringBuffer = StringBuffer()
        for(i in 0 until count) {
            buf.append(ch)
        }
        return buf.toString()
    }
}