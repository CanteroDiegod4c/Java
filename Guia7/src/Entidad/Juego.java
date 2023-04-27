/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;
import java.util.Scanner;
/**
 *
 * @author Kroban
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo.
 * El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
 * El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
 * Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
public class Juego {

Scanner input = new Scanner(System.in);

private int numAd;
private int intentos;
private int numInput;
public int contador = 0;
public int contadorW1, contadorW2 = 0;
public int partidas;



//GET Y SET

    public int getNumInput() {
        return numInput;
    }

    public void setNumInput(int numInput) {
        this.numInput = numInput;
    }

public int getNumAd() {
        return numAd;
    }

public void setNumAd(int numAd) {
    this.numAd = numAd;
}

public int getIntentos() {
    return intentos;
}

public void setIntentos(int intentos) {
    this.intentos = intentos;
}

//CONSTRUCTORES

public Juego(int numAd, int intentos) {
    this.numAd = numAd;
    this.intentos = intentos;
}


public Juego() {
}

//METODOS

public int crearNumero(){
    
System.out.println("JUGADOR 1 debe elegir numero");
    int aux = input.nextInt();
                   input.nextLine();
    setNumAd(aux);
    return getNumAd();
}


public void adivinarNum(int intentos){


do {
    if(intentos == contador){
        System.out.println("Se acabaron los intentos ");
        contadorW1 ++;
        partidas++;
        reiniciar();
    }else{
        
        System.out.println("Ingrese numero");
        int aux = input.nextInt();
        setNumInput(aux);
        
        if (numInput == numAd){
        System.out.println("ADIVINASTE EL NUMERO! ");
        System.out.println("Le tomó al jugador 2 " + intentos + "  intentos");
        contadorW2 ++;
        partidas++;
        reiniciar();
        } else if (numInput > numAd){
        System.out.println("más abajo");
        contador ++;
    } else if (numInput < numAd){
        System.out.println("más arriba");
        contador ++;
    }
    }
}while (contador < intentos+1);
       

}

public void intento(){
    System.out.println("Cuantos intentos tiene este juego?");
    int aux = input.nextInt();
    setIntentos(aux);
    System.out.println("JUGADOR 2 debe adivinar el número, tiene  " + getIntentos() + " intentos" );
}


public void reiniciar(){
    
System.out.println("desea reiniciar el juego? S para Si, N para No");
String rein = input.nextLine();

switch(rein){
case "S" :
         contador = 0;
         crearNumero();
         intento();

         adivinarNum(intentos);

break;

case "N":
        System.out.println("RESULTADOS");
        System.out.println("cantidad de partidas jugadas: " + partidas);
        System.out.println("");
        System.out.println("Jugador 1: " + contadorW1 +  "  Victorias");
        System.out.println("");
        System.out.println("Jugador 2: " + contadorW2 +  "  Victorias");
break;
}
}

    

//metodo iniciar_juego
//=> 2 jugadores, dividir if para jugador 1 y jugador 2
//numero limitado intentos
//pista de +alto o +bajo dependiendo de numero
//termina cuando no + intentos o se adivina numero
//print numero de int necesarios y num de W.-

    

}
