package factorymethod

class KRStyleCheesePizza: Pizza {

    override fun prepare() {
        println("KR style CHEESE pizza is being prepared.")
    }

    override fun bake() {
        println("KR style CHEESE pizza is being baked.")
    }

    override fun box() {
        println("KR style CHEESE pizza is being boxed.")
    }
    
}