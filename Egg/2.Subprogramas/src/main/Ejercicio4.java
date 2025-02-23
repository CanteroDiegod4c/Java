/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 - Crea una aplicación que nos pida un número por teclado
 - con una función se lo pasamos por parámetro para que nos indique si es o no un número primo,
 - debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
 * @author kroban_d4c
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        respuesta(calcularPrimo(pedirNum(input)));
        
    }
    
    public static int pedirNum(Scanner input){
        System.out.println("Ingrese el número para ver si es primo o no: ");
        int num = input.nextInt();
        
        
        return num;
    }

    private static boolean calcularPrimo(int num) {
        if(num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false; // Si es divisible por otro número, no es primo
        }
        return true;
        
    }
    
    public static void respuesta(boolean b){  
        System.out.println(b ? " El numero es primo " : " NO es primo ");
        
    }
}
