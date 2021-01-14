package flyweight

class BigString(var str: String) {

    private var bigChars: Array<BigChar?> = arrayOfNulls(this.str.length)
    init {
        for(i in this.str.indices) {
            bigChars[i] = BigCharFactory.getBigChar(str[i])
        }
    }

    fun print(): Unit {
        for(i in this.bigChars.indices) {
            bigChars[i]?.print()
        }
    }

}