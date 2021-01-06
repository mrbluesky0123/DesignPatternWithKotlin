package proxy

import java.lang.reflect.Proxy


fun main(args: ArrayList<String>) {
    val person1: PersonBean = PersonBeanImpl()
    val ownerProxy: PersonBean = getOwnerProxy(person1)
    ownerProxy.

}

fun getOwnerProxy(personBean: PersonBean): PersonBean {
    return Proxy.newProxyInstance(personBean::class.java.classLoader, personBean::class.java.interfaces,
        OwnerInvocationHandler(personBean)) as PersonBean
}


fun getNonOwnerProxy(personBean: PersonBean): PersonBean {
    return Proxy.newProxyInstance(personBean::class.java.classLoader, personBean::class.java.interfaces,
        NonOwnerInvocationHandler(personBean)) as PersonBean
}