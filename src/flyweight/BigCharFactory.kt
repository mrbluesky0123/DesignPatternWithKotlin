package flyweight

object BigCharFactory {
    private var pool: HashMap<Char, BigChar> = HashMap()

    @Synchronized
    fun getBigChar(charname: Char): BigChar {
        var bc: BigChar? = pool[charname]
        if(bc == null) {
            bc = BigChar(charname)
            pool[charname] = bc
        }
        return bc
    }

}