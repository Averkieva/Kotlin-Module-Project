import java.util.*
import kotlin.system.exitProcess

class CreateArchieveScreen(private val mutableList: MutableList<ForArchieve>):GenScreen<ForArchieve>("Архив", mutableList) {
    override fun choose(x: Int) {
        CreateNoteScreen(mutableList[x].notes, this).menu()
    }

    override fun exit() {
        exitProcess(1) //выходим
    }

    override fun add() {
        println("Создать новый архив.\nВвести название нового архива")
        val x = Scanner(System.`in`).nextLine()
        mutableList.add(ForArchieve(x, mutableListOf()))
        println("Вы создали архив\n")
        menu()
    }
}
