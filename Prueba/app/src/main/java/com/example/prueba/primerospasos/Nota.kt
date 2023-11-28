package com.example.prueba.primerospasos

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    println("Dime tu nota")
    val nota:Int=sc.nextInt()
    when(nota){
        5-> println("Un suficiente")
        6-> println("Un bien")
        7-> println("Un notable")
        8-> println("Un notable")
        9-> println("Un sobresaliente")
        10-> println("Un sobresaliente")
        else->{
            println("Un suspenso")
        }
    }
}