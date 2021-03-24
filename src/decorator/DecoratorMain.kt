package decorator

fun main(args: Array<String>) {
    var b1: Display = StringDisplay("Hello World!")
    var b2: Display = SideBorder(b1, '#')
    var b3: Display = FullBorder(b2)
    b1.show()
    b2.show()
    b3.show()
    var b4: Display = SideBorder(
                            FullBorder(
                                FullBorder(
                                    SideBorder(
                                        FullBorder(
                                            StringDisplay("abscs")
                                        ), '*'
                                    )
                                )
                            ), '/'
                        )
    b4.show()
}