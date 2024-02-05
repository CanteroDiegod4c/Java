/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Random;
import java.util.Scanner;

/**
 *Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.

 * @author nico
 */
public class Ex_Ejercicio3 {
    public static void main(String[] args) {
        
        int[] ar1 = crearArray();
        
        llenarArray(ar1);
        
        mostrarArray(ar1);
    }
    
    public static int[] crearArray(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del array ");
        int tam = in.nextInt();
        System.out.println(" -------------------------------------------------- ");
        return new int[tam];
        
    }
    
    public static void llenarArray(int[] array){
        Random randy = new Random();
        
        for(int i = 0; i < array.length ; i++){
            int numeroAleatorio = randy.nextInt(10) + 1;
            array[i] = numeroAleatorio;
        }
    }
    
    public static void mostrarArray(int[] array){
        int tamaño = array.length;
        for(int i = 0; i < tamaño; i++){
            System.out.println(array[i]);
        }
        System.out.println(" ");
    }
}
