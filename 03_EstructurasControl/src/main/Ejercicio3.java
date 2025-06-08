package main;

import java.util.Scanner;

/**
 *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
 * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Length() en Java.
 * @author kroban_d4c
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        pedirFrase(input);
        
        
        input.close();
    }
    
    //Funcion que pide frase
    public static void pedirFrase(Scanner input){
        boolean check = true;
        while(check){
            System.out.println("Ingrese una frase, si no tiene 8 caracteres de longitud estara incorrecto");
            String frase = input.nextLine();
            int longitud = frase.length();
            
            if(longitud != 8) {
                System.out.println("INCORRECTO");
                
            }else{
                System.out.println("CORRECTO");
                check = false;
            }
            
        }
    }
}
