package main;

import java.util.Scanner;
import utils.Utilidades;
/*
  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
  cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 @author kroban_d4c
 */

public class Ejercicio3 {
 public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in).useDelimiter("\n");
      
      int[] array = Utilidades.crearVector(input);
        
      Utilidades.mostrarVector(array);
      
      System.out.println("-------------------------");
      
     contabilizarDigitos(array);
      
      
        
 }

 public static void contabilizarDigitos(int[] array){
     
     int contador1 = 0;
     int contador2 = 0;
     int contador3 = 0;
     int contador4 = 0;
     int contador5 = 0;
     
     for(int i = 0; i < array.length; i++){
         
         if (array[i] >= 0 && array[i] <= 9) {
                contador1++;
            } else if (array[i] >= 10 && array[i] <= 99) {
                contador2++;
            } else if (array[i] >= 100 && array[i] <= 999) {
                contador3++;
            } else if (array[i] >= 1000 && array[i] <= 9999) {
                contador4++;
            } else if (array[i] >= 10000 && array[i] <= 99999) {
                contador5++;
        }
     }
     
     System.out.println("");
     System.out.println("Numeros de 1 digito: " + contador1);
     System.out.println("Numeros de 2 digito: " + contador2);
     System.out.println("Numeros de 3 digito: " + contador3);
     System.out.println("Numeros de 4 digito: " + contador4);
     System.out.println("Numeros de 5 digito: " + contador5);
 }
 
}
