package decorator

class StringDisplay(val string: String): Display() {

    override fun getColumns(): Int = this.string.length

    override fun getRows(): Int = 1

    override fun getRowText(row: Int): String? {
        return if(row == 0) {
            string
        } else {
            null
        }
    }

}