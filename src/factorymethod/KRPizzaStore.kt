package factorymethod

class KRPizzaStore: PizzaStore() {
    override fun createPizza(type: String): Pizza? {
        if("cheese" == type) {
            return KRStyleCheesePizza()
        } else if ("meat" == type) {
            return KRStyleMeatPizza()
        }
        return null
    }
}