import Clases.Car
import Clases.Mario
import Clases.Person
import Clases.Phone

fun main() {
    // TELEFONO
    var myPhone = Phone()
    myPhone.getTurn()
    myPhone.turnON()
    myPhone.getTurn()

    println("---")

    // VEHICULO
    var myCar = Car("Gris", "Hyundai", "Tucson", "MAX-0123")

    println("---")

    println("El vehículo está encendido? ${myCar.v_state}")
    myCar.turnVON()
    println("El vehículo está encendido? ${myCar.v_state}")

    println("---")

    println("Cuánta gasolina tiene el vehículo: ${myCar.gasolina}")
    myCar.recharge(20.07f)
    println("Cuánta gasolina tiene el vehículo: ${myCar.gasolina}")

    println("---")

    var vochoNegro = Car("VolksWagen", "Vocho")
    println("El color del Vocho es: ${vochoNegro.color}")

    println("---")

    var pointer = Car (
        color = "Azul",
        marca = "Volkswagen",
        modelo = "Pointer"
    )
    println("El color del Pointer es: ${pointer.color}")

    println("---")

    // PERSONA
    val people1 = Person (
        "Max",
        "Monroy",
        "Masculino",
        1.75f
    )

    println("---")

    // MARIO
    var player1 = Mario()
    player1.collision("Pipe")
    println("Vidas: ${player1.vidas}")
    player1.collision("Goomba")
    println("Vidas: ${player1.vidas}")
}