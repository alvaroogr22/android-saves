package com.example.prueba.primerospasos

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Dime dos números pulsando enter entre ellos y te dire el mayor")
    var numeroMayor: Int = sc.nextInt()
    var numeroMayor2: Int = sc.nextInt()
    if (numeroMayor > numeroMayor2) {
        println(numeroMayor)
    } else if (numeroMayor == numeroMayor2) {
        println("Son iguales")
    } else {
        println(numeroMayor2)
    }
}