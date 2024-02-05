/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Random;
import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 * @author Kroban
 */
public class Ex_Ejercicio2 {
    public static void main(String[] args) {
        
        int[] array1 = crearArray();
        llenarArray (array1);
        mostrarArray(array1);
        
        int[] array2 = crearArray();
        llenarArray(array2);
        mostrarArray(array2);
        
        
        compararArray(array1, array2);
        
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
            int numeroAleatorio = randy.nextInt(2) + 1;
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
    
    public static void compararArray(int[] array1, int[] array2){
        boolean check = true;
        
        for (int i = 0; i < array1.length; i++) {
            
            if(array1[i] == array2[i]){
                check = true;
            }else{
                check = false;
                break;
            }
            
        }
        
        if(check == true){
                System.out.println(" Ambos arrays son iguales ");
            }else{
                System.out.println("Los arrays no son iguales ");
            }
        
        
    }
}
