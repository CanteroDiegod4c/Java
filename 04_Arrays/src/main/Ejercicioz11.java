package main;

import java.util.Scanner;
import utils.Utilidades;

/**
 *Realizar un programa que llene una matriz de tamaño NxM
 *con valores aleatorios y muestre la suma de sus elementos.


 * @author kroban_d4c
 */
public class Ejercicioz11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int filas, columnas, suma = 0;
        
        System.out.println("Ingrese la cantidad de filas para la matriz:");
        filas = input.nextInt();
        
        System.out.println("Iingrese la cantidad de columnas ");
        columnas = input.nextInt();
        
        int[][] matriz1 = Utilidades.crearMatriz(filas, columnas);
        
        Utilidades.mostrarMatriz(matriz1);
        
        for(int[] fila : matriz1){
            for(int num : fila){
                suma += num;
            }
        }
        
        System.out.println("La suma de toda la matriz es " + suma);
        
        input.close();
    }
}
