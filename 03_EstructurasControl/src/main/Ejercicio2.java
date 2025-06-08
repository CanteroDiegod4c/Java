/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka”
 * el programa pondrá un mensaje de Correcto, 
 * sino mostrará un mensaje de Incorrecto. 
 * Nota: investigar la función equals() en Java.

 * @author kroban_d4c
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        String frase = pedirFrase(input);
        
        eureka(frase);
        
    }
    
    //Funcion para pedir frase y devolver un String.
    
    public static String pedirFrase(Scanner input){
        System.out.println("Ingrese una frase, si no es 'Eureka' saldra incorrecto: ");
        String frase = input.nextLine();
        return frase;
    }
    
    //Funcion para comparar la frase y ver si es exactamente "eureka".
    public static void eureka(String frase){
        System.out.println((frase.equalsIgnoreCase("eureka") ? "Correcto!" : "Incorrecto")); 
    }
}
