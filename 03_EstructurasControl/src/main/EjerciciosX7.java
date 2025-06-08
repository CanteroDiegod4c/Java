package main;

import java.util.Scanner;

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”
 * @author kroban_d4c
 */
public class EjerciciosX7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int num = ingresarN(input);
        
        bucleWhile(input, num);
        
    }
    
    //Funcion para ingresar el numero para buclear el resto
    public static int ingresarN(Scanner input){
        
        int num = 0;
        
        while(true){
            
            try{
                System.out.println("Ingrese el numero");
                num = input.nextInt();
                break;
            }catch(java.util.InputMismatchException e){
                System.out.println("Por favor ingrese un numero");
                input.nextLine();
                
            }
            
        }
        return num;
    }
    
    //Funcion para calcular minimo, maximo y promedio en base a bucle while
    public static void bucleWhile(Scanner input, int num){
        int promedio =0, contador =0, numIngresado = 0;
        int minimo = Integer.MAX_VALUE; int maximo = Integer.MIN_VALUE;
        
        while(num > contador){
            
             try{
                System.out.println("Ingrese el numero");
                numIngresado = input.nextInt();
                
               if(maximo < numIngresado){
                   maximo = numIngresado;
                   
               }
               
               if(minimo > numIngresado){
                   minimo = numIngresado;
               }
               
               
               promedio += numIngresado; 
                contador++;
            }catch(java.util.InputMismatchException e){
                System.out.println("Por favor ingrese un numero");
                input.nextLine();
                
            }
        }
        
        System.out.println("El numero de menor valor es ->   " + minimo);
        System.out.println("El de mayor valor es ->  " + maximo );
        System.out.println("El promedio es ->  " + (promedio / num));
        
    }
    
}
