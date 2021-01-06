package proxy

import java.lang.reflect.Proxy


fun main(args: Array<String>) {
    val person1: PersonBean = PersonBeanImpl()
    val ownerProxy: PersonBean = getOwnerProxy(person1)
    ownerProxy.setName("Mark")
    ownerProxy.setGender("male")
    ownerProxy.setInterest("reading")
    ownerProxy.setHotOrNotRating(10)

    val nonOwnProxy: PersonBean = getNonOwnerProxy(person1);
    nonOwnProxy.setName("Park")

}

fun getOwnerProxy(personBean: PersonBean): PersonBean {
    return Proxy.newProxyInstance(personBean::class.java.classLoader, personBean::class.java.interfaces,
        OwnerInvocationHandler(personBean)) as PersonBean
}


fun getNonOwnerProxy(personBean: PersonBean): PersonBean {
    return Proxy.newProxyInstance(personBean::class.java.classLoader, personBean::class.java.interfaces,
        NonOwnerInvocationHandler(personBean)) as PersonBean
}