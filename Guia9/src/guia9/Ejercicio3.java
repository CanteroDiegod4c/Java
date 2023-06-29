/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9;

import Entidades.Array;
import Servicios.ArrayServo;

/**
 *Crear en el Main dos arreglos. 
 * El arreglo A de 50 números reales y el arreglo B de 20 números reales.
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
 * Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
 * Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
 * Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 * Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
 * Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 * En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 * 
 */
public class Ejercicio3 {
public static void main(String[] args){
    
    ArrayServo as = new ArrayServo( );
    Array a1 = as.crearArreglo(50);
    Array a2 = as.crearArreglo(20);
    
    as.llenarArreglo(a1);
    as.llenarArreglo(a2);
    
    System.out.println("ARRAY  1:");
    as.mostrarArreglo(a1);
    
    System.out.println("ARRAY  2:");
    as.mostrarArreglo(a2);
    
    as.sortArreglo(a1);
    as.mostrarArreglo(a1);
    
    as.sortArreglo(a2);
    as.mostrarArreglo(a2);
            
            
   as.inicializarB(a1, a2);
   
   as.mostrarArreglo(a1);
   as.mostrarArreglo(a2);
            
            
            
            
            
            
 

}
}
