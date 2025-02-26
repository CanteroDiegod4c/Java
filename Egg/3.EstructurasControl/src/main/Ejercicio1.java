package main;

import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar.
 * @author kroban_d4c
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        parImpar(pedirNum(input));
        
    }
    
    public static int pedirNum(Scanner sc){
        System.out.println("Ingrese un número para ver si es par o impar");
        int num = sc.nextInt();
        
        return num;
        
    }
    
    public static void parImpar(int num){
        if (num % 2 == 1){
            System.out.println("Este numero es impar");
        }else{
            System.out.println("Este numero es par");
        }
    }
}
