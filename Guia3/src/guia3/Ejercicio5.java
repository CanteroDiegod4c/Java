/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario 
hasta que la suma de los números introducidos supere el límite inicial.
 */
public class Ejercicio5 {

public static void main(String[] args){
    
Scanner input = new Scanner(System.in);

System.out.println("Ingrese el límite de la suma");
int limit = input.nextInt();


for(int acum = 0; acum <= limit;){
    System.out.println("Ingrese numero a sumar");
    int num = input.nextInt();
    acum = acum + num;
    
    System.out.println(acum);
    System.out.println("___________________________");
}

input.close();
}
}
