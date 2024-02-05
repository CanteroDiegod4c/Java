/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;
import objetos.Alumno;

/**
 *Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 
10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 

Las ponderaciones de cada nota son:
- Primer trabajo práctico evaluativo 10%
- Segundo trabajo práctico evaluativo 15%
- Primer Integrador 25%
- Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

@author Kroban
 */
public class Ex_Ejercicio4 {
    public static void main(String[] args) {
        
        
       int[] notas = new int[4];
       
       ingAlumnos(notas);
  
    }
    
    public static void ingAlumnos(int[] notas){
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1));
            System.out.println("Nota de primer trabajo práctico");
            double nota1 = (in.nextInt() * 0.10);
            
            System.out.println("Segundo trabajo práctico ");
            double nota2 = (in.nextInt() * 0.15);
            
            System.out.println("1er Integrador");
            double nota3 = (in.nextInt() * 0.25);
            
            System.out.println("2do Integrador ");
            double nota4 = (in.nextInt() * 0.50);
            
            double promedio =(nota1 + nota2 + nota3 + nota4 ) / 4;
             
            System.out.println("El promedio es de " + promedio);
            
            
            
            
            
            System.out.println(" ");
            
            
        }
    }
}
