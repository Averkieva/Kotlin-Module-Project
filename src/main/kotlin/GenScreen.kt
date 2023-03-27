import java.util.*

abstract class GenScreen <T:Gen>(private val article: String?, private val mutableList:MutableList<T>) {
    fun menu(){
        println("Здравствуйте! Вы открыли список: $article")
        while(true){  //бесконечный цикл
            println("Menu:\n0 - создать $article")
            if(mutableList.isEmpty()){
                println("Кажется, список пуст. Создайте $article")
            }
            else{
                println("Чтобы открыть, введите номер:")
                mutableList.forEachIndexed { index, t -> println("${index+1} - ${t.article}")}
            }
            println("Чтобы выйти, введите ${mutableList.size + 1}")
            val x: Int? = readlnOrNull()?.toIntOrNull()
            if(x != null) {
                if (x == 0)
                    add()
                else if (x >= 1 && x <= mutableList.size)
                    choose(x - 1)
                else if (x == mutableList.size + 1)
                    exit()
                else println("Неверное число. Введите от 0 до ${mutableList.size + 1}")
            }
            else
                println("Ошибка, на вводе ожидалась цифра")
        }
    }
    abstract fun choose(x:Int)
    abstract fun exit()
    abstract fun add()

}