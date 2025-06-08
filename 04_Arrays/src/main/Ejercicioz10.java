/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import utils.Utilidades;

/**
     Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas
   por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
   Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
   Las ponderaciones de cada nota son:
   Primer trabajo práctico evaluativo 10%
   Segundo trabajo práctico evaluativo 15%
   Primer Integrador 25%
   Segundo integrador 50%
   Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
   Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
   teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 * @author kroban_d4c
 */
public class Ejercicioz10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        //Vector de promedio de alumnos
        int[] promedios = Utilidades.crearVectorTamanoDefinido(10);
        
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1));
            double[] notasAlumno = Utilidades.crearVectorDoubleDefinido(4, input);
            ponderarNotas(notasAlumno, promedios);
         }
        
        
        AprobadoOno(promedios);
        
    }

    private static void ponderarNotas(double[] vector, int[] promedio){
        
        double suma = 0;
        
        for(int i = 0; i < vector.length; i++){
            switch(i){
                //Trabajo practico 10%
                case 0 -> {
                    vector[i] =  (vector[i] * 0.10);
                    suma += vector[i];
                }
               //Trabajo practico 2 15%
               case 1 -> {
                    vector[i] =  (vector[i] * 0.15);
                    suma += vector[i];
                }
               //Primer integrador 25%
               case 2 -> {
                    vector[i] =  (vector[i] * 0.25);
                    suma += vector[i];
                }
               //Segundo integrador 50%
               case 3 -> {
                    vector[i] =  (vector[i] * 0.50);
                    suma += vector[i];
                }
            }
        }
        
        //Bucle para añadir e
        for(int j = 0; j < promedio.length; j++){
            if(promedio[j] == 0){
                promedio[j] = (int) Math.round(suma);
                break;

            }
    }
        
    }
    
    private static void AprobadoOno(int[] promedio){
        int aprobados = 0;
        int reprobados = 0;
        
        for(int i = 0; i < promedio.length; i++){
            if(promedio[i] >= 7){
                System.out.println("El alumno " + (i + 1) + " aprobo con " + promedio[i]);
                
                aprobados ++;
            }else{
                System.out.println("El alumno " + (i + 1) +  " NO aprobo con " + promedio[i]);
                reprobados ++;
            }
        }
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
    }
}
