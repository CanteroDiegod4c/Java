/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

/**
 *
 * @author kroban_d4c
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        String pepe = "pepe";
        String jorge = "Jorgito";

        boolean test = pepe.isEmpty();
        System.out.println(test);
        
        boolean test2 = jorge.isEmpty();
        System.out.println(test2);
        
        String def = pepe.concat(jorge);
        
        System.out.println(def);
        
        boolean test3 = pepe.endsWith("e");
        System.out.println(test3);
    }
}
