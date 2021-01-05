package factorymethod

class NYStyleCheesePizza: Pizza {
    
    override fun prepare() {
        println("NY style CHEESE pizza is being prepared.")
    }

    override fun bake() {
        println("NY style CHEESE pizza is being baked.")
    }

    override fun box() {
        println("NY style CHEESE pizza is being boxed.")
    }

}