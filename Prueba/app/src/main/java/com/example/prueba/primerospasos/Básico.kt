import java.util.Scanner

object ContadorNumeros {
    // Constante para el límite máximo
    private const val LIMITE_MAXIMO = 100
    @JvmStatic
    fun main(args: Array<String>) {
        // Crear un objeto Scanner para leer la entrada del usuario
        val scanner = Scanner(System.`in`)

        // Solicitar al usuario que ingrese un número
        print("Ingresa un número: ")

        // Leer el número ingresado por el usuario
        val limite = scanner.nextInt()

        // Verificar si el número está dentro del límite máximo
        if (limite <= LIMITE_MAXIMO) {
            // Mostrar los números del 1 al número ingresado
            print("Números: ")
            for (i in 1..limite) {
                print("$i ")
            }
        } else {
            println("Por favor, ingresa un número menor o igual a " + LIMITE_MAXIMO)
        }

        // Cerrar el Scanner
        scanner.close()
    }
}