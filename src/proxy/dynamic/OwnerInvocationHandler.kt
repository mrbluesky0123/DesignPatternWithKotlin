package proxy.dynamic

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class OwnerInvocationHandler(val person: PersonBean): InvocationHandler {

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {

        return when {
            method?.name?.startsWith("get")!! -> {
                return method.invoke(this.person, args)
            }
            method?.name == "setHotOrNotRating" -> {
                println("IllegalAccessException")
                IllegalAccessException()
            }
            method?.name?.startsWith("set")!! -> {
                return method.invoke(this.person, args)
            }
            else -> null
        }!!

    }

}