/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;
import java.util.Scanner;


/**
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 * @author kroban_d4c
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        System.out.println("Cual es tu nombre????");
        nombre = sc.nextLine();
        
        System.out.println("Hola " + nombre + "!!!!");
    }
}
