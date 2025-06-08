/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;
import java.util.Scanner;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 * @author kroban_d4c
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String frase;
        String upper, lower;
        System.out.println("Ingrese una frase, se mostrara toda en min y mayusculas:");
        frase = sc.nextLine();
        
        upper = frase.toUpperCase();
        lower = frase.toLowerCase();
        
        System.out.println("La frase en minusculas es : " + lower);
        System.out.println("");
        System.out.println("La frase en mayusculas es : " + upper);
        
    }
}
