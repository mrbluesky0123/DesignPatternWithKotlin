package decorator

abstract class Border protected constructor(protected open val display: Display): Display() {
}