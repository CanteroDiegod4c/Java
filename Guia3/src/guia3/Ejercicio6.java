/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú
:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5.
Si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */

import java.util.Scanner;

public class Ejercicio6 {

public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Ingrese el primer número");
    int num1 = input.nextInt();
    
System.out.println("Ingrese el segundo número");
    int num2 = input.nextInt();
    
int puerta = 0;

while(puerta != 5){

System.out.println("---------------------------");
System.out.println("1.Sumar");
System.out.println("2.Restar");
System.out.println("3.Multiplicar");
System.out.println("4.Dividir");
System.out.println("5.Salir");
        
System.out.println("Ingrese un número según las siguientes opciones");
System.out.println("");
int opcion = input.nextInt();
input.nextLine();


switch(opcion){
    case 1:
       int suma = num1 + num2;
       System.out.println("La suma de los dos números da:  " + suma);
    break;
    case 2:
       int resta = num1 - num2;
       System.out.println("La resta de los dos números da:  " + resta);
    break;
    case 3:
       int mult = num1 * num2;
       System.out.println("La multiplicación de los dos números da:  " + mult);
    break;
    case 4:
       int div = num1 / num2;
       System.out.println("La división de los dos números da:  " + div);
    break;
    case 5:
       
       System.out.println("¿Está seguro que desea salir del programa (S/N)?");
       String salir = input.nextLine();
       
       if(salir.equalsIgnoreCase("S")){
           puerta =  5;
           System.out.println("Ha salido del programa");
           System.out.println(".....................................");
       }
    break;
}
}
}
}
