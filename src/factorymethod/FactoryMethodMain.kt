package factorymethod

fun main(args:Array<String>) {
    val store1: PizzaStore = NYPizzaStore()
    val store2: PizzaStore = KRPizzaStore()

    val pizza1: Pizza? = store1.orderPizza("cheese")
    val pizza2: Pizza? = store2.orderPizza("meat")
}