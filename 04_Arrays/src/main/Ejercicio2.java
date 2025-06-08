package main;

import java.util.Scanner;
import utils.Utilidades;
/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 * @author kroban_d4c
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        //pide numero para el tamano del array.
        int[] array = Utilidades.crearVector(input);

        //Genera el array con num aleatorios.
        Utilidades.llenarVectorRandom(array);
        
        //
        System.out.println("Ahora ingrese el numero a buscar ");
        int numBusqueda = Utilidades.preguntarNum(input);
        
        System.out.println(" ------------------------------- ");
        Utilidades.revisarVector(array, numBusqueda);
        
        Utilidades.mostrarVector(array);
        
    }
    
}
