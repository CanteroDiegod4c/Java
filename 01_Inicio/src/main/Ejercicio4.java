/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).

 * @author kroban_d4c
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int centigrados;
        int fahren;
        
        System.out.println("Ingrese los grados centigrados:");
        centigrados = sc.nextInt();sc.nextLine();
        fahren = 32 + (9 * centigrados / 5);
        
        System.out.println("en fahrenheit serían " + fahren + " grados");
    }
}
