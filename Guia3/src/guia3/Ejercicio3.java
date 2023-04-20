package guia3;

/*Realizar un programa que solo permita introducir frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo 
se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

 */

import java.util.Scanner;

public class Ejercicio3 {
    
public static void main(String[] args){
    
Scanner input = new Scanner(System.in);

System.out.println("Ingrese una palabra de 8 caracteres");
String palabraCheck = input.nextLine();

int checkLength = palabraCheck.length();


if(checkLength == 8){
boolean check = true;
   System.out.println(check);
}else{
boolean check = false;
   System.out.println(check);
}



input.close();
}    
}
