package main;

import java.util.Scanner;
import utils.Utilidades;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * 
 * Crear un programa que permita introducir un cuadrado por teclado 
 * y determine si este cuadrado es mágico o no. 
 * El programa deberá comprobar que los números están entre el 1 y el 9.
 * @author kroban_d4c
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int[][] matriz = crearMatrizVacia(3, 3);
        
        matriz = llenarMatriz(matriz, input);
        Utilidades.mostrarMatriz(matriz);
        
        //Comprobacion de rango de numeros.
        if(comprobarNumeros(matriz)){
            System.out.println("Los numeros estan correctos");
        }else{
            System.out.println("Los numeros se salen del rango entre 1 y 9");
        }
        
        //Comprobacion de cuadrado magico
        if(comprobarMagico(matriz)){
            System.out.println("El cuadrado SI es magico");
        }else{
            System.out.println("El cuadrado NO es magico");
        }
        
    }
    
    
    //Funcion para crear matriz vacía.
    public static int[][] crearMatrizVacia(int filas, int columnas){
        
        int[][] matriz = new int[filas][columnas];
        
        return matriz;
    }
    
    //Funcion para llenar matriz y devolverla como valor.
    public static int[][] llenarMatriz(int[][] matriz, Scanner input){
        int filas = matriz.length;
        int cols = matriz[0].length;
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < cols; j++){
                
                while(true){
                    try{
                        System.out.println("Ingrese numero para la coordenada  [" + (i + 1) + "] , [" + (j + 1) + "]");
                        matriz[i][j] = input.nextInt();
                        input.nextLine();
                        break;
                   }catch(java.util.InputMismatchException e){
                        System.out.println("EL VALOR INGRESADO NO ES UN NUMERO");
                        System.out.println("");
                        input.nextLine();
                   }
                }
            }
            System.out.println("-----------------------------------------");
        }
        return matriz;
    }

        //Funcion para comprobar que los numeros esten entre el 1 y 9
        public static boolean comprobarNumeros(int[][]matriz){
            for(int[] fila : matriz){
                for(int elemento : fila){
                    if(elemento < 1 || elemento > 9){
                        return false;
                    }else{
                        
                    }
                }
            }
            
            return true;
        }
        
        //Funcion para comprobar que sean identicos
        public static boolean comprobarMagico(int[][] matriz){
            
            int num_magico = matriz[0][0] + matriz[0][1] + matriz[0][2];
            
            //calcula filas
            for(int i = 0; i < 3; i++){
                int suma_fila = 0;
                for(int j = 0; j < 3; j++){
                    suma_fila += matriz[i][j];
                }
                
                if (suma_fila != num_magico) return false;
            }
            
            //calcular columnas
            
            for(int j = 0; j < 3 ;j++){
                int suma_cols = 0;
                
                for(int i = 0; i < 3; i++){
                    suma_cols += matriz[i][j];
                }
                
                if(suma_cols != num_magico) return false;
                
            }
            
            //calcular diagonales
            int diag_derecha = matriz[0][0] + matriz[1][1] + matriz[2][2];
            
            if (diag_derecha != num_magico) return false;
            
            int diag_izquierda = matriz[0][2] + matriz[1][1] + matriz[2][0];
            
            if (diag_izquierda != num_magico) return false;
            
            return true;
           }
        
        
        
        
}
