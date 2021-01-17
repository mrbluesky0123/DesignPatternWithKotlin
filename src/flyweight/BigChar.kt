package flyweight

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException

class BigChar(private var charname: Char) {
    private var fontdata: String

    init {
        try {
            var path: String = "resources/numbers/big${this.charname}.txt"
            println("PATH: $path")
            var f: File = File(path)
            println("###: ${f.absolutePath}")
            val lines = f.bufferedReader().readLines()
            val buf: StringBuffer = StringBuffer()
            for(l in lines) {
                buf.append(l)
                buf.append("\n")
            }
            println("${this.charname} is created..")
            this.fontdata = buf.toString()
        } catch(e: IOException) {
            this.fontdata = this.charname + "?"
        }
    }

    fun print(): Unit {
        println(fontdata)
    }

}