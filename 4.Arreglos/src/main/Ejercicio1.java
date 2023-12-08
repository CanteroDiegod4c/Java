package main;

/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por 
 * pantalla en orden descendente.
 * @author nico
 */
public class Ejercicio1 {
    
public static void main(String[] args) {

        int[] vector1 = new int[100];
        
        llenarVector(vector1);
        
        imprimirVector(vector1);
        
}


public static void imprimirVector(int[] vector){
     int tamaño = vector.length;
    
    for(int i = tamaño-1; i >= 0; i--){
        System.out.println(vector[i]);
    }
}

public static void llenarVector(int[] vector){
   
    int tamaño = vector.length;
    
    for(int i = 0; i < tamaño; i++){
        vector[i] = i + 1;
    }
    
}

}

