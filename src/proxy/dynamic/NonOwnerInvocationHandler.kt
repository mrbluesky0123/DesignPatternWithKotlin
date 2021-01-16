package proxy.dynamic

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class NonOwnerInvocationHandler(val person: PersonBean): InvocationHandler {

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        return when {
            method?.name?.startsWith("get") == true -> {
                method.invoke(this.person, args)
            }
            method?.name == "setHotOrNotRating" -> {
                method.invoke(person, args)
            }
            else -> {
                println("IllegalAccessException")
                IllegalAccessException()
            }
        }
    }

}