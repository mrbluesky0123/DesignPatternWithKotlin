package visitor

/**
 * Visitor 패턴은 데이터 구조와 처리를 분리하고,
 * 데이터 구조 안을 돌아다니는 주체인 방문자 클래스로 처리를 위임함
 */

fun main(args: Array<String>) {
    try{
        println("Making root entries...")
        var rootDir: Directory = Directory("root")
        var binDir: Directory = Directory("bin")
        var tmpDir: Directory = Directory("tmp")
        var usrDir: Directory = Directory("usr")

        rootDir.add(binDir)
        rootDir.add(tmpDir)
        rootDir.add(usrDir)
        binDir.add(File("vi", 10000))
        binDir.add(File("latex", 20000))
        rootDir.accept(ListVisitor())

        println("")
        println("Making user entries...")
        var kim: Directory = Directory("Kim")
        var lee: Directory = Directory("Lee")
        var park: Directory = Directory("Park")
        kim.add(File("diary.html", 1214))
        kim.add(File("JavaTest.java", 1322))
        lee.add(File("memo.tex", 12442))
        lee.add(File("game.doc", 400))
        park.add(File("junk.mail", 235))
        rootDir.accept(ListVisitor())

    } catch (fe: FileTreatmentException) {
        fe.printStackTrace()
    }
}
