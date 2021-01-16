package proxy.gof

class Printer: Printable {

    private var name: String
    init {
        this.heavyJob("Printer의 인스턴스 생성중..")
    }

    constructor(name: String) {
        this.name = name
        this.heavyJob("Printer의 인스턴스 ${this.name} 생성중..")
    }

    override fun setPrinterName(name: String) {
        this.name = name
    }

    override fun getPrinterNAme(): String = this.name

    override fun print(str: String) {
        println("=== ${this.name} ===")
        println(str)
    }

    fun heavyJob(msg: String): Unit {
        println(msg)
        for(i in 0 until 5) {
            Thread.sleep(1000)
            print('.')
        }
        println("완료")

    }
}