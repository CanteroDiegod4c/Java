/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *Diseñe una función que pida el nombre y la edad de N personas 
 * e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad.
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas
 * y frenar cuando el usuario ingrese la palabra “No”.

 * @author kroban_d4c
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        personas();
        
        
        
    }
    
    public static void pedirDatos(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        String nombre = input.nextLine();
        
        System.out.println("Ingrese la edad");
        int edad = input.nextInt();
        input.nextLine();
        
        checkEdad(nombre, edad);
        
    }
    
    public static void checkEdad(String nombre, int edad){
        if(edad >= 18){
            System.out.println(nombre + "  Es mayor de edad");
        }else{
            System.out.println(nombre + "  Es menor de edad");
        }
    }
    
    public static boolean seguir(){
  
        System.out.println("Desea continuar? 1 para Si/ 2 para No");
       Scanner input = new Scanner(System.in);
       int seg = input.nextInt();
       
       if(seg == 1){
           return true;
       }else{
           return false;
       }
    }
    
    public static void personas(){
        boolean check = true;
        
        while(check){
            pedirDatos();
            check = seguir();
        }
    }
}
