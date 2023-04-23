package guia5;

/*
Recorrer un vector de N enteros contabilizando
cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    int[] arreglo = new int[10];
    
    for(int i = 0; i < 10; i++){
        arreglo[i] = random.nextInt(1000 - 2 + 1) + 2;
        System.out.println("arreglo [" + i + "]=  " + arreglo[i]);
    }
    
    int checker;
    int longo;
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    
    System.out.println("................................................................");
    for(int i = 0; i < 10; i++){
        checker = arreglo[i];
        String string = Integer.toString(checker);
        longo = string.length();
        System.out.println("La longitud del número dentro de [" + i + "] es de " + longo);
        
        if(longo == 1){
            contador1++;
        }else{
         if(longo == 2){
             contador2++;
         }else{
         if(longo == 3){
             contador3++;
         }
         }
         }
        
        
    }
    
        System.out.println("");
        System.out.println("CONTADOR DE DIGITOS");
        System.out.println("-------------------------------");
        System.out.println("1 dígito = " + contador1);
        System.out.println("2 dígitos = " + contador2);
        System.out.println("3 dígitos = " + contador3);
    
    input.close();
    
 
}
}