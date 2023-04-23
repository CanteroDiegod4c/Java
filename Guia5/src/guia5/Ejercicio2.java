/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */

import java.util.Scanner;
import java.util.Random;

public class Ejercicio2 {
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    int[] arreglo = new int[10];
    
    for(int i = 0; i < 10; i++){
        arreglo[i] = random.nextInt(10);
        System.out.println("arreglo [" + i + "]=  " + arreglo[i]);
    }
    
    System.out.println("------------------------------------");
    System.out.println("Ingrese el número a buscar: ");
    int tracker = input.nextInt();
    input.nextLine();
    
    System.out.println("------------------------------------------");
    int contador = 0;
    for(int i = 0; i < 10; i++){
        if(arreglo[i] == tracker){
            System.out.println("El número se encuentra en vector[" + i + "]");
            contador = contador + 1;
        }else{
            System.out.println("El número no se encuentra en vector[" + i + "]");
        }
    }
    
    System.out.println("------------------------------------------------------------");
    System.out.println("El número se encuentra " + contador + " veces");
    
    input.close();
}    
}
