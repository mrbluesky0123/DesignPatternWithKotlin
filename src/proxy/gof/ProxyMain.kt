package proxy.gof

fun main(args:Array<String>) {
    var p: Printable = PrinterProxy("Alice")
    println("이름은 현재 ${p.getPrinterName()}이다.")
    p.setPrinterName("Bob")
    println("이름은 현재 ${p.getPrinterName()}이다.")
    p.print("Hello, World!")
}