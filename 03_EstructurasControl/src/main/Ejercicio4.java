/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
 * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”. 
 * 
 * Nota: investigar la función Substring y equals() de Java.

 * @author kroban_d4c
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        pedirFrase(input);
    }
    
    //Funcion para pedir la frase/palabra.
    public static void pedirFrase(Scanner input){
        String letra;
        
        
         do{
             
             System.out.println("Ingrese una frase o palabra");
             String frase = input.nextLine();
             letra = frase.substring(0,1);
             
             if(letra.equalsIgnoreCase("a")){
                 System.out.println("CORRECTO, LA FRASE EMPIEZA CON A");
                 
                 break;
             }else{
                 System.out.println("INCORRECTO, INGRESE OTRA FRASE O PALABRA");
                 
                 
             }
         }while(!letra.equalsIgnoreCase("a"));
        
        
        
    }
    }
