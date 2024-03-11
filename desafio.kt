enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, var email: String)

data class ConteudoEducacional(var nome: String, var duracao: Int, var nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>,) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun listarinscritos() {
        println("os incritos no curso de $nome são")
        for(i in inscritos)
        	println(i.nome)
        	
    }
}

fun main() {
    val user = Usuario("andré", "andre.mv.2@hotmail.com")
    val user2 = Usuario("bruno", "bruno@gmail.com")
    
    println("os usuarios $user e $user2 foram cadastrados")
    
    val kot = ConteudoEducacional(nome = "Poo com kotlin", duracao = 10, nivel = Nivel.BASICO)
    val kot2 = ConteudoEducacional(nome = "Poo com kotlin2", duracao = 15, nivel = Nivel.INTERMEDIARIO)
    val kot3 = ConteudoEducacional(nome = "Poo com kotlin3", duracao = 30, nivel = Nivel.DIFICIL)
    
    val python = ConteudoEducacional(nome = "Poo com python", duracao = 5, nivel = Nivel.DIFICIL)
    val python2 = ConteudoEducacional(nome = "Poo com python2", duracao = 30, nivel = Nivel.DIFICIL)
    val python3 = ConteudoEducacional(nome = "Poo com python3", duracao = 20, nivel = Nivel.DIFICIL)
  
    
    val cont = listOf<ConteudoEducacional>(kot, kot2, kot3)
    val cont2 = listOf<ConteudoEducacional>(python, python2, python3)
    
    val formation = Formacao("Kotlin POO", conteudos = cont)
    val formation2 = Formacao("Python POO", conteudos = cont2)
    
    formation.matricular(user)
    formation.matricular(user2)
    
    formation2.matricular(user)
    formation2.matricular(user2)
    
    println(formation)
    println(formation2)
    
    formation.listarinscritos()
    formation2.listarinscritos()
    
    
    
    
}