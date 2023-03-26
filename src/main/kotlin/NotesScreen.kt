import java.util.*

class NotesScreen(private val note:ForNote, private val dialogNote: DialogNote) {
    fun menu(){
        while (true){
            println("Название: ${note.article}\n" + "Текст: ${note.txt}\n" + "Чтобы выйти отсюда, нажмите Enter")
            Scanner(System.`in`).nextLine()
            dialogNote.menu()
        }
    }
}