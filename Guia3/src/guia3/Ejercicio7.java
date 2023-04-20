/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: 
-tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X .
-el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE)
, y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar Substring(), Length(), equals().


tienen que ser string
para salir &&&&&
 */
import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args){

Scanner input = new Scanner(System.in);    

String cadena = "";
int contadorW = 0;
int contadorL = 0;

while(!cadena.equals("&&&&&")){
    
    System.out.println("Ingrese cadena");
    cadena = input.nextLine();
    
    String primer = cadena.substring(0,1);
    int length = cadena.length();
    String ultimo = cadena.substring(length - 1);
    
    if(!cadena.equals("&&&&&")){
        
        if(length == 5){
         if(primer.equalsIgnoreCase("a")){
             if(ultimo.equals("o")){
             contadorW = contadorW + 1;
             System.out.println("W =  " +  contadorW);
             }else{
               contadorL = contadorL + 1;
               System.out.println("la cadena no termina con O");
               System.out.println("L = " + contadorL);
             }
         }else{
        contadorL = contadorL + 1;
        System.out.println("L = " + contadorL);
        System.out.println("la cadena no empieza con la letra A");
        }
    }else{
        contadorL = contadorL + 1;
        System.out.println("L = " + contadorL);
        System.out.println("la cadena no tiene 5 caracteres");
    }
    }else{
        System.out.println("CANTIDAD DE Ls   =   " + contadorL);
        System.out.println("CANTIDAD DE Ws   =  " + contadorW);
    }
    
 
    }
}
}
