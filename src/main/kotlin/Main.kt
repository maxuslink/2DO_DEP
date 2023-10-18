import Clases.*

fun main() {
    // TELEFONO
    val myPhone = Phone()
    myPhone.getTurn()
    myPhone.turnON()
    myPhone.getTurn()

    println("---")

    // VEHICULO
    val myCar = Car("Gris", "Hyundai", "Tucson", "MAX-0123")

    println("---")

    println("El vehículo está encendido? ${myCar.v_state}")
    myCar.turnVON()
    println("El vehículo está encendido? ${myCar.v_state}")

    println("---")

    println("Cuánta gasolina tiene el vehículo: ${myCar.gasolina}")
    myCar.recharge(20.07f)
    println("Cuánta gasolina tiene el vehículo: ${myCar.gasolina}")

    println("---")

    val vochoNegro = Car("VolksWagen", "Vocho")
    println("El color del Vocho es: ${vochoNegro.color}")

    println("---")

    val pointer = Car (
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

    println("---")

    // CLASE 17-10
    val player2 = Mario() // MAIN
    for (i in 1..5){
        if (player2.isAlive){
            player2.collision("Goomba")
            println("Te quedan ${player2.getLives()}")
        }

    }

    println("---")

    val player3 = Mario()
    if (player3.isAlive){
        player3.collision("Goomba")
        println("Te quedan ${player3.getLives()}")
    }

    println("---")

    val player4 = Mario()
    player4.collision("Star")

    val newKoopa = Koopa() // MAIN
    newKoopa.collision("Weapon")
}