package main;

import java.util.Scanner;

/**
 *Escriba un programa en el cual se ingrese un valor límite positivo,
 * y a continuación solicite números al usuario hasta que la suma
 * de los números introducidos supere el límite inicial.
 * @author kroban_d4c
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int num = pedirNumero(input);
        sumarNumeros(input, num);
        
    }
    
    //Funcion que pide numero positivo (quizas hacer un while que funcione mientras sea mayor a 0)
    
    public static int pedirNumero(Scanner input){
        int numPedido;
        
        while(true){
            System.out.println("Ingrese un numero, debe ser positivo: ");
            numPedido = input.nextInt();
            
            if (numPedido < 0 ){
                System.out.println("ERROR, ingrese numero positivo");
            }else{
                return numPedido;
            }
        }
}
    
    //Funcion que pida numeros hasta superar el pedirNumero()
    
    public static void sumarNumeros(Scanner input, int num){
        
        int num1;
        int suma = 0;
        
        System.out.println("Ingrese un numero hasta superar el actual " + "( " + num + " )." );
        
        while(true){    
            num1 = input.nextInt();
            suma += num1;
            
            if(suma <= num){
                System.out.println("El total actual es " + suma + " debe seguir agregando numeros"); 
            }else{
                System.out.println("Ha superado el numero! el actual es  " + suma);
               break;
            }
        }
        
        
        
        
    }
    
    
}
