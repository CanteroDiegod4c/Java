package main;

import java.util.Random;
import java.util.Scanner;

/**
 *Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
 * @author Kroban
 */
public class Ex_Ejercicio1 {

    public static void main(String[] args) {
        int[] array = crearArray();
        
        System.out.println("Ha elegido el tamaño " + array.length );
        
        llenarArray(array);
        mostrarArray(array);
        sumar(array);
        
        }
    
    public static int[] crearArray(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del array ");
        int tam = in.nextInt();
        
        return new int[tam];
        
    }
    
    public static void llenarArray(int[] array){
        Random randy = new Random();
        
        for(int i = 0; i < array.length ; i++){
            int numeroAleatorio = randy.nextInt(20) + 1;
            array[i] = numeroAleatorio;
        }
    }
    
    public static void mostrarArray(int[] array){
        int tamaño = array.length;
        for(int i = 0; i < tamaño; i++){
            System.out.println(array[i]);
        }
    }
    
    public static void sumar(int[] array){
        int resultado = 0;
        
        for(int i = 0; i < array.length; i++){
            resultado = resultado + array[i];
        }
        
        System.out.println("El resultado es " + resultado);
        
        
    }
}
