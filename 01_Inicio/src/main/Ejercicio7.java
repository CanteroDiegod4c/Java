/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *Escribe un programa que solicite al usuario ingresar su nombre y muestre cuántos caracteres tiene
 * (sin contar los espacios iniciales o finales).
 * @author kroban_d4c
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre completo");
        String nombre = sc.nextLine();
        
        String cortao = nombre.trim();
        int longitud = cortao.length();
        
        System.out.println("Su nombre completo posee " + longitud + " caracteres");
    }
}
