package oo
enum class Jobs(val job:String){
    TEMPLARIO("Templario"),
    STEVE("Steve"),
    THIEF("Thief"),
    JAQIN("Jaqin");

    override fun toString(): String {
        return "$job"
    }
}

interface Upavel{
    fun upar()
}

interface Batalhar{
    fun atacar()
    fun defender()
}

class Personagem(val nome:String):Upavel,Batalhar{
    var nivel : Int = 1
        set(value){
            if( field > 100 || value <= 0)
                println("Valores invalidos")
            else
                field = value
        }
    val trabalho : Jobs
    init{
        when(nome.length){
            in 1 .. 10 -> this.trabalho = Jobs.TEMPLARIO
            in 11 .. 15 -> this.trabalho = Jobs.JAQIN
            in 12 .. 20 -> this.trabalho = Jobs.STEVE
            else -> this.trabalho = Jobs.THIEF
        }
    }

    override fun upar() {
        println("300 Flexoes!")
        println("300 pushups")
        println("3km!!")
        this.nivel += 1
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun atacar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun defender() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toString(): String {
        return "Personagem(nome='$nome', nivel=$nivel, trabalho=$trabalho)"
    }

}
fun main(){
    val personagem1 = Personagem("JOSIVALDO")
    val personagem2 = Personagem("LOLOLOOLOLOLOLOLOOOOLOLLOO")
    val personagem3 = Personagem("Jiraya")

    val personagens = listOf(personagem1,personagem2,personagem3)
    var personagem : Personagem
    for(personagem in personagens){
        println(personagem)
        personagem.upar()
        println(personagem)
        personagem.nivel = -10
    }
}