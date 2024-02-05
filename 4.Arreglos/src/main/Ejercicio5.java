/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Random;

/**
 *
 * @author Kroban
 */

public class Ejercicio5 {
public static void main(String[] args) {

    int[][] matriz1 = {
            {0, 1, -2},
            {-1, 5, 3},
            {2, -3, 0}
        };
    
    int fil = matriz1.length;
    int col= matriz1[0].length;
    int[][] revertida = new int[fil][col];
    

    mostrarMatriz(matriz1);
    invMatriz(matriz1, revertida);
    System.out.println("------------");
    mostrarMatriz(revertida);
    
    System.out.println("--------------");
    checkAnti(matriz1, revertida);
}

public static void llenarMatriz(int[][] matriz){
    Random random = new Random();
    
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            int numRan = random.nextInt(2) - 1;
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

public static void checkAnti(int[][] matriz, int[][] revertida){
    
    int fil = matriz.length;
    int cols = matriz[0].length;
    boolean check = false;
    
    for(int i = 0; i < fil; i++){
        for(int j = 0; j < cols; j++){
            if(revertida[i][j] == -matriz[i][j]){
                check = true;
            }else{
                check = false;
            }
                
        }
    }
    
    if(check == false){
        System.out.println(" Las matrices no son antisimetricas ");
    }else{
        System.out.println(" Las matrices son antisimetricas ");
    }
    
}


}