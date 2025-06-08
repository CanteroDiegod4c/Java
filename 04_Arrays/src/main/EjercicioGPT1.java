
package main;

import java.util.Scanner;

/**
 *Realizar un programa que genere un array de N números aleatorios entre 1 y 100000,
 * y luego muestre cuántos de esos números tienen una cantidad par de dígitos 
 * (por ejemplo: 44 tiene 2 dígitos → válido, 103 tiene 3 dígitos → no válido).
 * 
 * @author kroban_d4c
 */
public class EjercicioGPT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int[] array = generarArray(preguntar(input));
        
        mostrarArray(array);
        
        System.out.println("--------------------");
        
        contarArray(array);
    }
    
    //Funcion para preguntarle al usuario cuanto tamano quiere en el array futuro.
    public static int preguntar(Scanner input){
        
        while(true){
            
            try{
                System.out.println("Ingrese un numero ");
                int num= input.nextInt();
                 return num;
            }catch(java.util.InputMismatchException e){
                System.out.println("ERROR, INGRESE UN NUMERO");
                input.nextLine();
                continue;
            }
        }
    }
    
    //Generar array en base al tamaño que quiera el usuario.
    public static int[] generarArray(int tamano){
        
        int[] array = new int[tamano];
        
        for(int i = 0; i < tamano; i++){
            
            array[i] = (int) (Math.random() * 100000);
        }
        
        return array;    
    }
    
    
    //Funcion pa mostrar arrays por referencia.
    public static void mostrarArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
    
    //Funcion para contar digitos pares
    public static void contarArray(int[] array){
        
        int contadorPar = 0;
        int contadorInpar = 0;
        
        for(int num : array){
            
            int digito = String.valueOf(num).length();
            
            if(digito % 2 == 0){
                contadorPar++;
            }else{
                contadorInpar++;
            }
        }
        
        System.out.println("En total se detectaron ");
        System.out.println(contadorPar + "    Numeros pares ");
        System.out.println(contadorInpar + "   Numeros inpares");
       
    }
}
