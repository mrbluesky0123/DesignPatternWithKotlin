package prototype

class CookieMachine(private val cookie: Cookie) {
    fun makeCookie(): Cookie = cookie.clone() as Cookie
}