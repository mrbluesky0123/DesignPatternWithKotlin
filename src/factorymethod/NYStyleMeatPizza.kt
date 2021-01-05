package factorymethod

class NYStyleMeatPizza: Pizza {

    override fun prepare() {
        println("NY style MEAT pizza is being prepared.")
    }

    override fun bake() {
        println("NY style MEAT pizza is being baked.")
    }

    override fun box() {
        println("NY style MEAT pizza is being boxed.")
    }

}