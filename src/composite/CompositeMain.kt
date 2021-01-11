package composite

import composite.Directory
import composite.File
import composite.FileTreatmentException

/** 그릇과 내용물을 동일시 하여 재귀적인 구조를 만들기 위한 디자인 패턴 */

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
        rootDir.printList()

        println("")
        var kim: Directory = Directory("Kim")
        var lee: Directory = Directory("Lee")
        var park: Directory = Directory("Park")
        usrDir.add(kim)
        usrDir.add(lee)
        usrDir.add(park)
        kim.add(File("diary.html", 1214))
        kim.add(File("JavaTest.java", 1322))
        lee.add(File("memo.tex", 12442))
        lee.add(File("game.doc", 400))
        park.add(File("junk.mail", 235))
        rootDir.printList()

    } catch (fe: FileTreatmentException) {
        fe.printStackTrace()
    }
}