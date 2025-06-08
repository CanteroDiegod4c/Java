package main;

import java.util.Scanner;
import utils.Utilidades;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
 * y muestre la traspuesta de la matriz. 
 * La matriz traspuesta de una matriz A se denota por B 
 * y se obtiene cambiando sus filas por columnas (o viceversa).

 * @author kroban_d4c
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int[][] matriz = Utilidades.crearMatriz(4, 4);
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Matriz normal: ");
        
        Utilidades.mostrarMatriz(matriz);
        
        System.out.println("------------------------------------------------------");
        System.out.println("Matriz transpuesta: ");
        
        Utilidades.mostrarTranspuesta(matriz);
        
        input.close();
        
    }
}
