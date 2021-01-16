package proxy.gof

interface Printable {
    fun setPrinterName(name: String): Unit
    fun getPrinterNAme(): String
    fun print(str: String): Unit
}