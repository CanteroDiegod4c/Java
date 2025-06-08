package main;

import java.util.Scanner;
import utils.Utilidades;

/**
 *Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
 * con los valores ingresados por el usuario.
 * @author kroban_d4c
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int[] array = Utilidades.crearVector(input);
        
        llenarVector(array, input);
        Utilidades.mostrarVector(array);
        
        sumarVector(array);
        
    }
    
    //Funcion simple para llenar arrays de forma modular
    public static void llenarVector(int[] vector, Scanner input){
        
        for(int i = 0; i < vector.length;){
            
            try{
                System.out.println("Ingrese numero");    
                vector[i] = input.nextInt();
                i++;
            }catch(java.util.InputMismatchException e){
                System.out.println("El valor ingresado NO es un numero");
                System.out.println("");
                input.nextLine();
            }
         }
    }
    
    //Funcion para sumar todo lo del array
    public static void sumarVector(int[] vector){
        int suma = 0;
        
        for(int num : vector){
            suma = suma + num;
        }
        
        System.out.println("La suma total del array es de  " + suma);
    }
}
