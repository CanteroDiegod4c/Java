/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

/**
 *Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
* 
 * @author d4c
 */

import java.util.Random;
import java.util.Scanner;

public class Juego {
    private int numeroAdivinar;
    private int intentosMaximos;
    private int intentosJugador2;
    private int partidasGanadasJugador1;
    private int partidasGanadasJugador2;

    public Juego(int rangoNumeros, int intentosMaximos) {
        Random random = new Random();
        this.numeroAdivinar = random.nextInt(rangoNumeros) + 1;
        this.intentosMaximos = intentosMaximos;
    }

    public void iniciar_juego() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de adivinanza!");

        for (int i = 1; i <= 2; i++) {
            int numeroJugador;
            int intentos = 0;

            System.out.println("Jugador " + i + ", elige un número entre 1 y 100:");

            do {
                System.out.print("Intento #" + (intentos + 1) + ": ");
                numeroJugador = scanner.nextInt();

                if (numeroJugador < numeroAdivinar) {
                    System.out.println("Más alto. Intenta de nuevo.");
                } else if (numeroJugador > numeroAdivinar) {
                    System.out.println("Más bajo. Intenta de nuevo.");
                }

                intentos++;
            } while (numeroJugador != numeroAdivinar && intentos < intentosMaximos);

            if (numeroJugador == numeroAdivinar) {
                System.out.println("¡Jugador " + i + " ha adivinado el número en " + intentos + " intentos!");
                if (i == 1) {
                    partidasGanadasJugador1++;
                } else {
                    partidasGanadasJugador2++;
                }
            } else {
                System.out.println("Jugador " + i + " se quedó sin intentos. El número era: " + numeroAdivinar);
            }

            // Reiniciar para la siguiente ronda
            numeroAdivinar = new Random().nextInt(100) + 1;
        }

        System.out.println("Resumen de partidas:");
        System.out.println("Jugador 1 - Partidas ganadas: " + partidasGanadasJugador1);
        System.out.println("Jugador 2 - Partidas ganadas: " + partidasGanadasJugador2);
    }
}
