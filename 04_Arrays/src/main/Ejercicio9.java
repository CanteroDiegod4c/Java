package main;

import java.util.Scanner;
import utils.Utilidades;

/*
 * Crear una función rellene un vector con números aleatorios, 
 * pasándole un arreglo por parámetro. 
 * Después haremos otra función o procedimiento que imprima el vector.

 * @author kroban_d4c
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int[] vector = Utilidades.crearVector(input);
        
        Utilidades.llenarVectorRandom(vector);
        
        Utilidades.mostrarVector(vector);
        
    }
}
