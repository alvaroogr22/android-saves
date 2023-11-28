package com.example.prueba.socio

class Persona {
    var nombre: String = ""
    var edad: Int = 0
    var apellidos: String = ""
    var ciudad: String = ""
    var poblacion: String = ""
    var cp: Int = 0

    fun inicializar(
        nombre: String, apellidos: String, edad: Int, ciudad: String, poblacion: String, cp: Int
    ) {
        this.nombre = nombre
        this.apellidos = apellidos
        this.edad = edad
        this.ciudad = ciudad
        this.poblacion = poblacion
        this.cp = cp
    }

    fun imprimir() {
        println("Nombre: $nombre $apellidos tiene $edad años vive en $ciudad, $poblacion, $cp")
    }

    fun esMayorEdad() {
        if (this.edad > 18) {
            println("Es mayor de edad")
        } else println("Es menor de edad")
    }
}

fun main() {
    val persona1: Persona
    persona1 = Persona()
    persona1.inicializar("Juan", "Albarracín", 12, "Malaga", "Alhaurín el Grande", 29120)
    persona1.imprimir()
    persona1.esMayorEdad()
}