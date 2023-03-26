import java.util.*

class CreateNoteScreen(private val mutableList: MutableList<ForNote>, private val createArchieveScreen: CreateArchieveScreen):GenScreen<ForNote>("Заметка",mutableList) {
    override fun choose(x: Int) {
        DialogNote(mutableList[x],this).menu()
    }

    override fun exit() {
        createArchieveScreen.menu() //возвращаемся к предыдущему
    }

    override fun add() {
        println("Создать новую заметку.\nВвести название новой заметки")
        val x = Scanner(System.`in`).nextLine()
        println("Ввести новый текст заметки")
        val txt = Scanner(System.`in`).nextLine()
        mutableList.add(ForNote(x,txt))
        println("Вы создали заметку\n")
        menu()
    }
}