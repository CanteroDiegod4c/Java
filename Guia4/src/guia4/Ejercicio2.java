/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;
/**
 Diseñe una función que pida el nombre y la edad de N personas
 * e imprima los datos de las personas ingresadas por teclado
 * e indique si son mayores o menores de edad. 
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas 
 * y frenar cuando el usuario ingrese la palabra “No”.

 */
public class Ejercicio2 {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Cuantas personas desea registrar?:");
int cantidad = input.nextInt();
input.nextLine();

personas(input, cantidad);

}



public static void personas(Scanner input, int cantidad){
    
    boolean confirm = false;
    while(confirm != true){
        for(int i = 0; i < cantidad; i++){
        String nombre = nombre(input);
        int edad = edad(input);
        String check;
        
        if(edad > 18){
            check = "mayor";
        }else{
            check = "menor";
        }
            
        System.out.println("Nombre registrado:  " + nombre);
        System.out.println("Edad :  " + edad);
        System.out.println("Esta persona es " + check + " de edad");
        
        System.out.println("Desea seguir mostrando el resto de personas? S o N");    
        String seguir = input.nextLine();
        
        if(seguir.equalsIgnoreCase("S")){
            confirm = false;
        }else{
            confirm = true;
        }
        }
    }
    
}



public static String nombre(Scanner input){
    
    System.out.println("Ingrese su nombre: ");
    String nombre = input.nextLine();
    return nombre;
}

public static int edad(Scanner input){
    System.out.println(" Ingrese su edad: ");
    int edad = input.nextInt();
    input.nextLine();
    
    return edad;
}
}
