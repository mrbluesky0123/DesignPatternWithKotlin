package factorymethod

class NYPizzaStore: PizzaStore() {

    override fun createPizza(type: String): Pizza? {
        if("cheese" == type) {
            return NYStyleCheesePizza()
        } else if ("meat" == type) {
            return NYStyleMeatPizza()
        }
        return null
    }

}