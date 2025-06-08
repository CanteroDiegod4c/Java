/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;
import java.util.Scanner;

/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
 * El programa deberá después mostrar el resultado de la suma
 * @author krobby
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2 = 0;
        int resultado;
        
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        
        System.out.println("Ahora ingrese el segundo numero");
        num2 = sc.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("El resultado de la suma es " + resultado);
        
        
    }
}
