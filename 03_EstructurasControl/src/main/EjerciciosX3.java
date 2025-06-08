package main;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
la función equals() de la clase String.
 * @author kroban_d4c
 */
public class EjerciciosX3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        String vocal = ingresarLetra(input);
        
        checkearVocal(vocal);
        
    }
    
    public static String ingresarLetra(Scanner input){
        System.out.println("Ingrese una letra para ver si es vocal");
        String vocal = input.next();
        
     return vocal;   
    }
    
    public static void checkearVocal(String i){
        if(i.equalsIgnoreCase("A") || i.equalsIgnoreCase("E")||i.equalsIgnoreCase("I")||i.equalsIgnoreCase("o")||i.equalsIgnoreCase("u")  ){
            System.out.println("La letra ingresada es una vocal!");
            
        }else{
            System.out.println("La letra ingresada NO es una vocal");
        }
    }
}
