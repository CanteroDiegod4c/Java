package main;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
muestre su equivalente en romano.
 * @author kroban_d4c
 */
public class EjerciciosX4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int num = ingresarNum(input);
        
        roman(num);

        
        
    }
    
    //Funcion para ingresar numero del 1 al 10
    public static int ingresarNum(Scanner input){
        
        int num;
        
        while(true){
        System.out.println("Ingrese un numero del 1 al 10");
        num = input.nextInt();
        if(num >= 1 && num <= 10){
            break;
        } else {
            System.out.println("Por favor, ingrese un número entre 1 y 10.");
        }
    }
        return num;
    }
    
    //Funcion para checar el numero y convertirlo a romano
    public static void roman(int num){
        switch(num){
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");
            
            
        }
    }
}
