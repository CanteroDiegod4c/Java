package main;

import java.util.Scanner;
import utils.Utilidades;
/**
 *Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 * 
 * @author kroban_d4c
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Vector 1: ");
        int[] vector1 = Utilidades.crearVector(input);
        llenarVector(vector1, input);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Vector 2: ");
        int[] vector2 = Utilidades.crearVector(input);
        llenarVector(vector2, input);
        
        System.out.println("-----------------------------------------");
        
        if(compararVector(vector1, vector2)){
            System.out.println("Los arrays son iguales");
        }else{
            System.out.println("Los arrays son diferentes");
        }
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

    //Funcion para comparar 2 vectores
    public static boolean compararVector(int[] vector1, int[] vector2) {
        
        if(vector1.length != vector2.length){
            System.out.println("Los vectores poseen diferente tamano");
            return false;
        }
        
        for(int i = 0; i < vector1.length; i++){
            try{
                if(vector1[i] != vector2[i]){
                    //Los arrays poseen diferentes valores.
                    return false;
                }
            }catch(IndexOutOfBoundsException e){
                //Los arrays son distintos por tener distinto tamaño.
                return false;
            }
            
        }
        //Los vectores son iguales.
        return true;
    }

}

