package proxy.gof

class PrinterProxy: Printable {
    private var name: String
    private var real: Printer? = null
    init {

    }

    constructor(name: String) {
        this.name = name
    }

    @Synchronized
    override fun setPrinterName(name: String) {
        real?.setPrinterName(this.name)
        this.name = name
    }

    override fun getPrinterName(): String = this.name

    override fun print(str: String) {
        this.realize()
        this.real?.print(str)
    }

    @Synchronized
    fun realize(): Unit {
        if(real == null) {
            real = Printer(this.name)
        }
    }

}