package factorymethod

abstract class PizzaStore {

    fun orderPizza(type: String): Pizza? {
        var pizza: Pizza? = createPizza(type)
        pizza?.prepare()
        pizza?.bake()
        pizza?.box()
        return pizza
    }

    abstract fun createPizza(type: String): Pizza?

}