/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 Pedile al usuario cuántos números aleatorios quiere generar (entre 1 y 1000).

Generá ese array de números aleatorios.

Mostrá todos los números generados.

Mostrá cuántos de ellos son números primos.

Al final, mostrale al usuario el mayor número primo encontrado (si hay).
* 
 * @author kroban_d4c
 */
public class EjercicioGPT2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int[] array = generarArray(preguntar(input));
        
        System.out.println(array[array.length]);
        mostrarArray(array);
        
        contarPrimos(array);
        
        System.out.printf("%03d", 7);
        
    }
    
    //Funcion para preguntarle al usuario cuanto tamano quiere en el array futuro.
    public static int preguntar(Scanner input){
        
        while(true){
            
            try{
                System.out.println("Ingrese un numero para determinar el tamaño del array");
                int num= input.nextInt();
                
                System.out.println("------------------------------------------");
                 return num;
            }catch(java.util.InputMismatchException e){
                System.out.println("ERROR, INGRESE UN NUMERO");
                input.nextLine();
                continue;
            }
        }
    }
    
    //Generar array en base al tamaño que quiera el usuario.
    public static int[] generarArray(int tamano){
        
        int[] array = new int[tamano];
        
        for(int i = 0; i < tamano; i++){
            
            array[i] = (int) (Math.random() * 100);
        }
        
        return array;    
    }
    
    
    //Funcion pa mostrar arrays por referencia.
    public static void mostrarArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
    
    //Funcion para determinar si es primo o no
    public static boolean esPrimo(int num){
        
        if(num <= 1){
            return false; //Falso porque 1 es primo
        }
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false; //Falso porque habria otro divisor
            }
        }
        
         return true; //Verdadero porque no hhay otro divisor
    }
   
    public static void contarPrimos(int[] array){
        
        int mayorPrimo = 0;
        
        for(int num : array){
            if(esPrimo(num)){
                
                if(num > mayorPrimo){
                mayorPrimo = num;
                    
            }
            }
        }
        
        if(mayorPrimo == 0){
            System.out.println("-------------------------------------------------------------");
            System.out.println("No se encontro un numero primo dentro del array");
        }else{
            System.out.println("El mayor numero primo encontrado es  " + mayorPrimo);
        }
    }
}
