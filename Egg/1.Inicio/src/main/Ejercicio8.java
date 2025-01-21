/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *Crea un programa que solicite una frase al usuario y reemplace todas las ocurrencias de 
 * la palabra "Java" por "Python". Luego, muestra la frase modificada.
 * @author kroban_d4c
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        String reemplazo = frase.replace("Java", "Python");
        
        System.out.println(reemplazo);
    }
}
