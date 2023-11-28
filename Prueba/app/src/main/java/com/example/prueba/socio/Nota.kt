package com.example.prueba.socio

fun main() {
    var nota: Nota
    nota = Nota()
    nota.inicializar("Álvaro", "Lengua", 5.0f)
    nota.imprimir()

}

class Nota {
    var nombre: String = ""
    var asignatura: String = ""
    var puntos: Float = .0f

    fun inicializar(nombre: String, asignatura: String, puntos: Float) {

        this.nombre = nombre
        this.asignatura = asignatura
        this.puntos = puntos
    }

    fun imprimir() {
        var resultado: String = when (puntos) {
            5.0f -> "Suficiente"
            6.0f -> "Bien"
            7.0f, 8.0f -> "Notable"
            9.0f, 10.0f -> "Sobresaliente"
            else -> "suspenso"
        }
        println("el alumno $nombre ha sacado $resultado en $asignatura")
    }
}