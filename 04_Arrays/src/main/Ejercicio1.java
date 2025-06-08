/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;
import utils.Utilidades;

/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 * y los muestre por pantalla en orden descendente.

 * @author kroban_d4c
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int[] arrayNum = Utilidades.crearVector(input);
        
        llenarVector(arrayNum, arrayNum.length);
        
        
    }
    
    public static void llenarVector(int[] array, int cantidad){
        
        for(int i = 0; i < cantidad; i++){
            array[i] = cantidad - i;
            
            System.out.println(array[i]);
        }
    }
    
}
