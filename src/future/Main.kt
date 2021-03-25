package future

fun main(args: Array<String>) {
    println("main BEGIN")
    var host: Host = Host()
    var data1: Data = host.request(10, 'A')
    var data2: Data = host.request(20, 'B')
    var data3: Data = host.request(30, 'C')

    println("main other job BEGIN")
    Thread.sleep(3000)
    println("main other job END")

    println("data1 = ${data1.getContent()}")
    println("data2 = ${data2.getContent()}")
    println("data3 = ${data3.getContent()}")

}