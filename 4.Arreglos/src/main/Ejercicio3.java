package main;

import java.util.Random;
import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 * @author Krob     
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        int[] array = crearArray();
        
        llenarArray(array);
        
        checkTamaño(array);
        
        System.out.println("--------------------------------------------");
        
        mostrarArray(array);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    public static int[] crearArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño para el vector");
        int tamaño = input.nextInt();
        
        return new int[tamaño];
    }
    
    public static void mostrarArray(int[] array){
        int tamaño = array.length;
        for(int i = 0; i < tamaño; i++){
            System.out.println(array[i]);
        }
    }
    
public static void checkTamaño(int[] array){
    int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;
    int tamaño = array.length;

    for(int i = 0; i < tamaño; i++){
        int num = array[i];
        String numS = String.valueOf(num);
        int digitos = numS.length();

        switch(digitos){

            case 1:
                contador1 = contador1 + 1;
                break;

            case 2:
                contador2 = contador2 +1;
                break;

            case 3:
                contador3 = contador3 +1;
                break;

            case 4:
                contador4 = contador4 +1;
                break;

            case 5:
                contador5 = contador5 +1;
                break;
        }
        }
    
        System.out.println("CANTIDADES");
        System.out.println("1 DIGITO = " + contador1);
        System.out.println("2 DIGITOS = " + contador2);
        System.out.println("3 DIGITOS = " + contador3);
        System.out.println("4 DIGITOS = " + contador4);
        System.out.println("5 DIGITOS = " + contador5);
    }
    
    public static void llenarArray(int[] array){
        int tamaño = array.length;
        Random random = new Random();
        
        for(int i = 0; i < tamaño; i++){
            int numeroAleatorio = random.nextInt(200) + 1;
            array[i] = numeroAleatorio;
        }
    }
    
     public static void buscarNumero(int[] array){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese numero a buscar");
        int tracker = in.nextInt();
        int tamaño = array.length;
        boolean check = false;
        int founded = 0;
        
        for(int i = 0; i < tamaño; i++){
            if (tracker == array[i]){
                check = true;
                founded = i;
            }else{}
            
         
        }
        
        if(check){
            System.out.println("El numero se encuentra en la posicion " + (founded+1));
        }else{
            System.out.println("El numero no se ha encontrado en la lista");
        }
        
        String resultado;
        
     }
}

