import java.util.*

class DialogNote(private val note: ForNote, private val createNoteScreen: CreateNoteScreen) {
    fun menu(){
        println()
        while(true){
            println("Menu:\n" + "0 - открыть заметку ${note.article}\n" + "1 - выйти")
            val x = Scanner(System.`in`).nextInt()
            if (x == 0)
                choose()
            else if(x == 1)
                createNoteScreen.menu()
            else println("Некорректное значение, на вводе ожидалось 0 или 1")
        }
    }
    private fun choose()= NotesScreen(note,this).menu()
}