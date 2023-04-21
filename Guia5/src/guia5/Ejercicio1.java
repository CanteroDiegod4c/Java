/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 */
public class Ejercicio1 {

public static void main(String[] args){
    
    int[] vector = new int[100];
    
    int cont = 100;
    
    for(int i = 0; i < 100; i++){
       
        vector[ i ] = cont;
        
        cont = cont - 1;
        
        System.out.print(vector[i] + ",  ");
        
    }
    
    System.out.println("");
}    
}
