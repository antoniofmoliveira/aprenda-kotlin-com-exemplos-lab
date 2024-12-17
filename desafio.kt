// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

// ajustado nome do nível DIFICIL
enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

// alterado o tipo de classe e adicionado propriedades nome e email à classe
data class Usuario(val nome:String, val email:String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

// adicionado nível à classe
data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()

    // alterado o tipo de parâmetro e implementado o corpo do método
    fun matricular(vararg usuarios: Usuario) {
        for (usuario in usuarios ){
            this.inscritos.add(usuario)
        }
    }
}

fun main() {
    //    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario1 = Usuario("Usuario Um", "usuario1@mail.com")
    val usuario2 = Usuario("Usuario Dois", "usuario2@mail.com")
    val usuario3 = Usuario("Usuario Tres", "usuario3@mail.com")
    val usuario4 = Usuario("Usuario Quatro", "usuario4@mail.com")
    val usuario5 = Usuario("Usuario Cinco", "usuario5@mail.com")
    val usuario6 = Usuario("Usuario Seis", "usuario6@mail.com")
    val usuario7 = Usuario("Usuario Sete", "usuario7@mail.com")

    val conteudo1 = ConteudoEducacional("Conteudo Um", duracao = 10)
    val conteudo2 = ConteudoEducacional("Conteudo Dois", duracao = 20)
    val conteudo3 = ConteudoEducacional("Conteudo Tres", duracao = 10)
    val conteudo4 = ConteudoEducacional("Conteudo Quatro", duracao = 10)
    val conteudo5 = ConteudoEducacional("Conteudo Cinco", duracao = 50)
    val conteudo6 = ConteudoEducacional("Conteudo Seis", duracao = 40)
    val conteudo7 = ConteudoEducacional("Conteudo Sete")
    val conteudo8 = ConteudoEducacional("Conteudo Oito")

    val formacao1 = Formacao("Formacao Um", Nivel.BASICO, listOf(conteudo1, conteudo2, conteudo3, conteudo4))
    val formacao2 = Formacao("Formacao Dois", Nivel.AVANCADO, listOf(conteudo5,conteudo6, conteudo7, conteudo8))

    formacao1.matricular(usuario1, usuario2, usuario3, usuario4)
    formacao2.matricular(usuario5, usuario6, usuario7)

    println(formacao1)
    println(formacao1.inscritos)
    println(formacao2)
    println(formacao2.inscritos)

}
