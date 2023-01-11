// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val email: String, val id: Int )

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val user1 = Usuario("Leandro", "lleandrorj@gmail.com", 19)
    val user2 = Usuario("Leticia", "leticiabonfim@gmail.com", 23)  
    
    val conteudoEducacional1 = ConteudoEducacional("Data Class", 120)
    val conteudoEducacional2 = ConteudoEducacional("MutableList")
    
    val conteudos1 = listOf<ConteudoEducacional>(conteudoEducacional1)
    val conteudos2 = listOf<ConteudoEducacional>(conteudoEducacional2)
        
    val formacao1 = Formacao("Kotlin", conteudos1, Nivel.AVANCADO)
    val formacao2 = Formacao("Kotlin 2", conteudos2, Nivel.BASICO) 
             
    println(user1)
    println(formacao2)
    println("")
    println(user2)
    println(formacao1)
}
