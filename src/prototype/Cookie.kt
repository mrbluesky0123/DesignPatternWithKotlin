package prototype

open class Cookie: Cloneable {

    var name: String = ""

    init {
        println("Prototype is called")
    }

    public override fun clone(): Any = super.clone() as Cookie

    override fun toString(): String = "Cookie[$name]"

}