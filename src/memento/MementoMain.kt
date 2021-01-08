package memento

/**
 *  메멘토 패턴은 객체의 상태 정보를 저장하고 사용자의 필요에 의하여 원하는 시점의 데이터를 복원 할 수 있는 패턴을 의미
 */

fun main(args: Array<String>) {
    val info: Information = Information("Hi everyone", 230)
    val careTaker: CareTaker = CareTaker()

    println("## Before modification")
    println(info.toString())
    println()

    careTaker.push(info.createMemento())

    info.data = "Everybody hi~"
    info.intData = 330

    println("## After modification")
    println(info.toString())
    println()

    info.restoreMemento(careTaker.pop())

    println("## After restoration")
    println(info.toString())
    println()

}
