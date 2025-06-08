package main;

import utils.Utilidades;

/**
 *Realice un programa que compruebe si una matriz dada es antisimétrica. 
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
 * pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
 * La matriz traspuesta de una matriz A se denota por AT 
 * y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author kroban_d4c
 */
public class Ejercicio5 {

    public static void main(String[] args) {
      
        int[][] matriz1 = {
            {0, -2,  4},
            {2,  0,  2},
            {-4, -2, 0}
        };
        
        int[][] matriz_trans = Utilidades.crear_transpuesta(matriz1);
        
        comparar_simetria(matriz1, matriz_trans);
    }
    
    //Funcion para comparar matrices y ver si son antisimetricas.
    public static void comparar_simetria(int[][] matriz, int[][] matriz_trans){
        
        boolean check = true; 
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                
                if(matriz[i][j] == -matriz_trans[i][j]){
                    
                }else{
                    check = false;
                }
            }
        }
        
        if(check){
            System.out.println("La matriz ES antisimetrica");
        }else{
              System.out.println("la matriz NO es antisimetrica");

        }
        
    }
    
}
