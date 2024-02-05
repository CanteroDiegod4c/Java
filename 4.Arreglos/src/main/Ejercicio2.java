/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Random;
import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 * @author nico
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        
        
        int[] array1 = crearArray();
        
        llenarArray(array1);
        mostrarArray(array1);
        buscarNumero(array1);

    }

    
    
    
    
    
    
    
    
    
    
    public static void buscarNumero(int[] array){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese numero a buscar");
        int tracker = in.nextInt();
        int tamaño = array.length;
        boolean check = false;
        int founded = 0;
        
        for(int i = 0; i < tamaño; i++){
            if (tracker == array[i]){
                check = true;
                founded = i;
            }else{}
            
         
        }
        
        if(check){
            System.out.println("El numero se encuentra en la posicion " + (founded+1));
        }else{
            System.out.println("El numero no se ha encontrado en la lista");
        }
        
        String resultado;
        
  
    }
    
    public static void mostrarArray(int[] array){
        int tamaño = array.length;
        for(int i = 0; i < tamaño; i++){
            System.out.println(array[i]);
        }
    }
    
    
    public static void llenarArray(int[] array){
        int tamaño = array.length;
        Random random = new Random();
        
        for(int i = 0; i < tamaño; i++){
            int numeroAleatorio = random.nextInt(20) + 1;
            array[i] = numeroAleatorio;
        }
 
    }
    
    public static int[] crearArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño para el vector");
        int tamaño = input.nextInt();
        
        return new int[tamaño];
    }
}
