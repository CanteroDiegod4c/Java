package guia3;

/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.

 */

import java.util.Scanner;

public class Ejercicio4 {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Ingrese una palabra");
String palabraIn = input.nextLine();


String subpalabra = palabraIn.substring(0,1);

if(subpalabra.equalsIgnoreCase("A")){
    System.out.println("CORRECTO");
    
}else{
    System.out.println("INCORRECTO");
}
input.close();
}
}
