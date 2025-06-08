/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;
import java.lang.Math;
/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 * @author kroban_d4c
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int raiz;
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        
        raiz = (int) Math.sqrt(num);
        
        System.out.println("El doble es : " + num * 2);
        System.out.println("El triple es " + num * 3);
        System.out.println("la raiz cuadrada es " + raiz);
        
        
    }
}
