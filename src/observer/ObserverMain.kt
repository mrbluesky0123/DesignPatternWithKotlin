package observer

fun main(args: Array<String>) {
    val newsMachine: NewsMachine = NewsMachine()
    val annualSubscriber: AnnualSubscriber = AnnualSubscriber(newsMachine)
    val eventSubscriber: EventSubscriber = EventSubscriber(newsMachine)

    newsMachine.setNewsInfo("내일의 날씨", "내일은 영상 1도입니다")
    newsMachine.delete(annualSubscriber)
    newsMachine.setNewsInfo("내일의 날씨(정정)", "내일은 영하 7도입니다")
}