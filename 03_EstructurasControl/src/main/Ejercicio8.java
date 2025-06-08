package main;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*      *
*      *
* * * *

 * @author kroban_d4c
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int num = pedirNum(input);
        dibujar(num);
        

    }
    //2 bucles for que hagan asteriscos en base a 0 y N?
    public static void dibujar(int n){
                for(int i = 1; i <= n ; i++){
                        for(int j = 1; j <= n ; j++){
                            if(i == 1 || i == n || j == 1 || j == n){
                                    System.out.print("*");
                            }else{
                                    System.out.print(" ");
                }
                        }
                        
                    System.out.println("");
        }
    }
    
    public static int pedirNum(Scanner input){
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        
        return num;
    }
}
