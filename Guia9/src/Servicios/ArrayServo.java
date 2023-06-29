/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

import Entidades.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

import java.util.Random;


/**
 *
 * @author Kroban
 */
public class ArrayServo {

    Random randy = new Random();
    
    
    public Array crearArreglo(int tamaño){
        Array a1 = new Array(tamaño);
        return a1;
    }
        
    public void llenarArreglo(Array a1){

        for(int i = 0 ; i < a1.getTamaño(); i++){
            int min = 1;
            int max = 10;
            a1.vector[i] = randy.nextInt(1 + max - min );
    }
    }

    
    public void sortArreglo(Array a1){
        Arrays.sort(a1.vector);
        
        int i = 0;
       int  j = a1.vector.length -1;
        while(i < j){
            a1.vector[i] = a1.vector[j];
            a1.vector[j] = a1.vector[i];
            i++;
            j--;
        }
    }
    
    public void mostrarArreglo(Array a1){
        
                for(int i=0; i < a1.getTamaño();i++){
                    if(i == 10 || i == 20 || i == 30 || i == 40 || i == 50){
                        System.out.println("");
                    }

                    System.out.print(a1.vector[i] + "  ");
                }
        System.out.println(" ");
        System.out.println(" ");
        
    }
    
    /*
    * Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
    * Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    * En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
    */
    
    public void inicializarB(Array a1, Array a2){
        for(int i = 0; i < 10; i++){
            a2.vector[i] = a1.vector[i];
            
        }
        for(int i = a2.vector.length ; i > 40; i--){
            a2.vector[i] = 0.5;
        }
    }
}
