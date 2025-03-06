/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos,
 * el sistema debe calcular su equivalente: 1 día, 2 horas.

 * @author kroban_d4c
 */

public class EjerciciosX1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int min = pedirMinutos(input);
        
        calcularDias(min);
        
        
    }
    
    public static int pedirMinutos(Scanner input){
        
        System.out.println("Ingrese una cantidad de minutos ");
        int min = input.nextInt();
        
        return min;
    }
    
    public static void calcularDias(int min){
        int hor = (min / 60);
        int dia =  hor / 24;
        int hora = hor % 24;
        
        System.out.println("Esa cantidad de minutos equivale a ");
        System.out.println(dia + " dia/s y " + hora + " horas. ");
        
    }
}
