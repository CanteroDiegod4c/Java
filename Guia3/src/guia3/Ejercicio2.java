/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: usar función equals.
 */
public class Ejercicio2 {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Ingrese la frase, si no es Eureka, dará falso");
    String fraseCheck = input.nextLine();
    
    String minus = fraseCheck.toLowerCase(); 
    
    if(minus.equals("eureka")){
        System.out.println("Verdadero");
    }else{
        System.out.println("falso");
    }
}    
}
