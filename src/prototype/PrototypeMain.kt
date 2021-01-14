package prototype

fun main(args: Array<String>) {
    var tempCookie: Cookie? = null
    var prot: Cookie = CoconutCookie()
    var cookieMachine: CookieMachine = CookieMachine(prot)

    for(i in 0..99) {
        tempCookie = cookieMachine.makeCookie()
        tempCookie.name = "COCONUT $i"
        println("[$i] ${tempCookie.toString()}, hashcode: ${tempCookie.hashCode()}")
    }

    val cookie2: Cookie = Cookie()
    cookie2.name = "AAA"
    cookie2.name = "bbb"
    println("Cookie name: ${cookie2.name}")

}