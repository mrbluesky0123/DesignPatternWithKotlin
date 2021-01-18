package proxy.gof

interface Printable {
    fun setPrinterName(name: String): Unit
    fun getPrinterName(): String
    fun print(str: String): Unit
}