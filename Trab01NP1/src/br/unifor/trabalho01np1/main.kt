package br.unifor.trabalho01np1
import java.util.Random

val random = Random()
fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)

fun main(args: Array<String>) {

    questaoUm()
    //questaoDois()
    //questaoTres()
    //questaoQuatro()
    //questaoCinco()
    //questaoSeis()
    
}

fun questaoUm(): Unit{

    val numeros:String

    println("Digite 3 números. Ex: 1,2,3: ")
    numeros = readLine() ?: ""

    val listaNumerosTexto:List<String> = numeros.split(',')
    var listaNumerosInteiros:MutableList<Int> = mutableListOf<Int>()

    listaNumerosTexto.forEach {listaNumerosInteiros.add(it.toInt())}

    listaNumerosInteiros.sort()

    println("A soma dos dois maiores numeros é: ${listaNumerosInteiros[2] + listaNumerosInteiros[1]}")

}

fun questaoUmProf(): Unit{
    val n = arrayOf(0,0,0)

    for (i in 0..2){
        print("Digite um numero: ")
        n[i] = readLine()?.toInt() ?: 0
    }

    n.sort()
    println("A soma dos dois maiores numeros é: ${n[2] + n[1]}")
}

fun questaoDois(): Unit{

    var nTimeA:Int = 0
    var nTimeB:Int = 0

    for(i in 1..3){
        println("TimeA - Cestas de ${i+1} pontos: ")
        nTimeA+= (readLine()?.toInt() ?: 0) * i
    }

    for(i in 1..3){
        println("TimeB - Cestas de ${i+1} pontos: ")
        nTimeB+= (readLine()?.toInt() ?: 0) * i
    }

    if(nTimeA == nTimeB){
        println("Empate!")
    }else{
        if(nTimeA > nTimeB){
            println("Time A venceu! Placar - ${nTimeA} x ${nTimeB}")
        }else{
            println("Time B venceu! Placar - ${nTimeA} x ${nTimeB}")
        }
    }
}

fun questaoTres(): Unit{
    val nome:String

    val diaria:Float = 60.0f
    var taxa:Float = 5.50f

    val dias:Int

    println("Digite nome do cliente: ")
    nome = readLine() ?: ""

    println("Digite as diarias: ")
    dias = readLine()?.toInt() ?: 0

    when{
        (dias == 10) -> taxa = 6.0f
        (dias < 10) -> taxa = 8.0f
    }

    println("Cliente: ${nome} | Saldo: ${diaria + (taxa*dias)}")

}

fun questaoQuatro(): Unit{
    val qtdPeixes: Int
    val comprimento: Int
    val largura: Int
    val altura: Int

    println("Digite a quantidade de peixes: ")
    qtdPeixes = readLine()?.toInt() ?: 0

    val aguaEsperada: Int = qtdPeixes * 20

    println("Digite o comprimento:  ")
    comprimento = readLine()?.toInt() ?: 0

    println("Digite a largura: ")
    largura = readLine()?.toInt() ?: 0

    println("Digite a altura: ")
    altura = readLine()?.toInt() ?: 0

    when{
        comprimento < 60 -> println("Aquário inválido - Comprimento menor que 60cm")
        (comprimento * largura * altura) >= aguaEsperada -> println("Aquário VÁLIDO!")
        else -> println("Aquário inválido")
    }


}

fun questaoCinco(): Unit{
    val frequencia: Int
    val notaNP1: Int
    val notaNP2: Int
    val notaFinal: Int
    val media: Double

    println("Digite a frequencia: ")
    frequencia = readLine()?.toInt() ?: 0

    println("Digite a nota NP1: ")
    notaNP1 = readLine()?.toInt() ?: 0

    println("Digite a nota NP2: ")
    notaNP2 = readLine()?.toInt() ?: 0

    media = (notaNP1 + notaNP2)/2.0

    when{
        frequencia < 75 -> println("Reprovado por Frequência")
        media >= 8 -> println("Aprovado por Média")
        media < 4 -> println("Reprovado por Média")
        media >= 4 -> {
            println("Digite a nota da final: ")
            notaFinal = readLine()?.toInt() ?: 0

            if((notaFinal + media)/2.0 >= 5){
                println("Aprovado por Média Final")
            }else{
                println("Reprovado por Média Final")
            }
        }
    }
}

fun questaoSeis(): Unit{
    val matriAlunos = arrayOf(1600,1601,1602,1603,1604,1605,1606,1607,1608,1609)
    val alunos = Array(10, {DoubleArray(4)})

    //Insere valores aleatórios de 0 a 10 nas notas dos alunos
    for (i in 0..9){
        for(j in 0..3){
            if(j == 0){
                alunos[i][j] = matriAlunos[i].toDouble()
            }else{
                alunos[i][j] = rand(0, 10)
            }
        }
    }

    //Item a
//    println("ITEM A --- ")
//    println("Aluno    Nota 1 Nota 2 Nota 3")
//    for (i in 0..9){
//        for(j in 0..3){
//            print("${alunos[i][j].format(1)}    ")
//        }
//        println()
//    }

    //item b
//    println("ITEM B --- ")
//    val media = Array(10,  {i -> (alunos[i][1] + alunos[i][2] + alunos[i][3])/3.0 })
//    println("Media dos Alunos: ")
//    media.forEach { println(it.format(1)) }

    //item c
//    println("ITEM C --- ")
//    println("Insira 9 valores: ")
//    val matrizItemC = Array(3, {i -> Array(3, {i -> readLine()?.toDouble() ?: 0.0} ) })
//
//    println()
//    println("i)")
//    for(i in matrizItemC){
//        for(j in i){
//            print("$j ")
//        }
//        println()
//    }
//
//    println()
//    println("ii)")
//    for(i in 0..2){
//        for(j in 0..2){
//            if(i==j)
//                println(matrizItemC[i][j])
//        }
//    }
//
//    println()
//    println("iii)")
//    for(i in 0..2){
//        for(j in 0..2){
//            if(i < j)
//                println(matrizItemC[i][j])
//        }
//    }
//
//    println()
//    println("iv)")
//    for(i in 0..2){
//        for(j in 0..2){
//            if(i > j)
//                println(matrizItemC[i][j])
//        }
//    }
//
//    println()
//    println("v)")
//    for(i in 0..2){
//        for(j in 0..2){
//            if(i != j)
//                println(matrizItemC[i][j])
//        }
//    }

    //item d
//    val aprovReprov = Array(10,  { i -> DoubleArray(2, {j ->
//        if(j == 0){
//            matriAlunos[i].toDouble()
//        }else{
//            (alunos[i][1] + alunos[i][2] + alunos[i][3])/3.0
//        }
//    }
//    )})
//
//    println("Aluno    Média")
//    for (i in 0..9){
//        for(j in 0..1){
//            print("${aprovReprov[i][j].format(1)}    ")
//        }
//        println()
//    }

}

fun rand(from: Int, to: Int): Double {
    return from + (to - from) * random.nextDouble();
}