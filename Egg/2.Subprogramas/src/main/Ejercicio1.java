/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *Crea una aplicación que le pida dos números al usuario 
 * y este pueda elegir entre sumar, restar, multiplicar y dividir.
 * La aplicación debe tener una función para cada operación matemática 
 * y deben devolver sus resultados para imprimirlos en el main.
 * @author nico
 */
public class Ejercicio1 {

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        int num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo");
        int num2 = input.nextInt();
        input.nextLine();
        
        elegir(num1, num2);
        
        
    }
   
    
    
    //Un método que muestra el menú y deja al usuario elegir entre 4 opciones
    public static void elegir(int num1, int num2){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el número según lo que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        int elec = input.nextInt();
        
        switch(elec){
            case 1:
                
                System.out.println("El resultado es " + sumar(num1, num2));
                
                break;
                
            case 2:
                System.out.println("El resultado es " + restar(num1, num2));
                break;
                
            case 3:
                System.out.println("El resultado es " + multiplicar(num1, num2));
                break;
                
            case 4:
                System.out.println("El resultado es " + division(num1, num2));
                break;
        }
        

        }
    
    //Método que ejecuta una suma y devuelve un int
    public static int sumar(int num1, int num2){
            int resultado = num1 + num2;
            return resultado;
}
    
        //Método que ejecuta una resta y devuelve un int
    public static int restar(int num1, int num2){
        int resultado = num1 - num2;
            return resultado;
    }
    
        //Método que ejecuta una multiplicacion y devuelve un int
    public static int multiplicar(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
    
        //Método que ejecuta una divisiony devuelve un int
    public static int division(int num1, int num2){
        int resultado = num1 / num2;
        return resultado;
    }
}

