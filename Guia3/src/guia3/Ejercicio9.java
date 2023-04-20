/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;
import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Ejercicio9 {
public static void main(String[] args){
    
Scanner input = new Scanner(System.in);



System.out.println("Ingrese la cantidad de minutos");
int minutos = input.nextInt();
input.nextLine();

int horas = minutos / 60;
int dias = horas / 24;
horas = horas % 24;

    System.out.println("Estos minutos equivalen a = " + dias + " días, y " + horas + " horas");
  
}
}
