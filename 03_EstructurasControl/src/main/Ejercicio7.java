package main;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. 
 * Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
 * el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
* la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
* y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
* Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 * @author kroban_d4c
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        pedirSecuencia(input);
        

    }
    
    public static void pedirSecuencia(Scanner input){
        
        
        int contadorTrue = 0;
        int contadorFalse = 0;
        
        while(true){
                System.out.println("Ingrese una secuencia, debe ser de maximo 5 caracteres, el primer caracter una X y el ultimo una O");
                String secuencia = input.next();
                int longitud = secuencia.length();
                String primero = secuencia.substring(0, 1);
                String ultimo = secuencia.substring(longitud - 1);
                
                
                if(primero.equalsIgnoreCase("X") && ultimo.equalsIgnoreCase("O") && longitud <= 5){
                    System.out.println("CORRECTO");
                    contadorTrue += 1;
                    
                }else if(secuencia.equals("&&&&&")){
                    System.out.println("Final de envio");
                    System.out.println("En total fueron ");
                    System.out.println(contadorTrue + " cadenas correctas");
                    System.out.println(contadorFalse + " cadenas incorrectas");
                    break;
                }else{
                    System.out.println("INCORRECTO");
                    contadorFalse += 1;
                }
        }
       
    }
}
