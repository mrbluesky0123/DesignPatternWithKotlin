package factorymethod

class KRStyleMeatPizza: Pizza {

    override fun prepare() {
        println("KR style MEAT pizza is being prepared.")
    }

    override fun bake() {
        println("KR style MEAT pizza is being baked.")
    }

    override fun box() {
        println("KR style MEAT pizza is being boxed.")
    }
    
}