/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Random;

/**
 *
 * @author krob
 */
public class Ejercicio4 {
public static void main(String[] args) {

    int[][] matriz1 = new int[3][3];
    
    int fil = matriz1.length;
    int col= matriz1[0].length;
    int[][] revertida = new int[fil][col];
    
    
    llenarMatriz(matriz1);
    mostrarMatriz(matriz1);
    invMatriz(matriz1, revertida);
    System.out.println("------------");
    mostrarMatriz(revertida);
}

public static void llenarMatriz(int[][] matriz){
    Random random = new Random();
    
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            int numRan = random.nextInt(9) + 1;
            matriz[i][j] = numRan;
            
        }
        
    }
}

public static void mostrarMatriz(int[][] matriz){
    int tam = matriz.length;
    for(int i = 0; i < tam; i++){
        for(int j = 0; j < tam; j++){
            System.out.print(matriz[i][j]);
            System.out.print(" ");
            
        }
        System.out.println(" ");
    }
}

public static void invMatriz(int[][] matriz, int[][] revertida){
    
    int fil = matriz.length;
    int cols = matriz[0].length;
    
    for(int i = 0; i < fil; i++){
        for(int j = 0; j < cols; j++){
            revertida[i][j] = matriz[j][i];
        }
    }
}


}
