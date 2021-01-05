package factorymethod

interface Pizza {
    fun prepare(): Unit
    fun bake(): Unit
    fun box(): Unit
}