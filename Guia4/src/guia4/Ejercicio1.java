
package guia4;

/**
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
 * restar, multiplicar y dividir.
 * La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 

 */

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Ingrese el primer número: ");
    int num1 = input.nextInt();
    input.nextLine();
    
    System.out.println("Ingrese el segundo número: ");
    int num2 = input.nextInt();
    input.nextLine();
    
    System.out.println("----------------------------------------");
    
    System.out.println("Elija un número según las siguientes opciones: ");
    System.out.println("1.Sumar numeros");
    System.out.println("2.Restar números");
    System.out.println("3.Multiplicar números");
    System.out.println("4.Dividir números");
    int choice = input.nextInt();
    
    input.nextLine();
    
    switch(choice){
        
    case 1:
        System.out.println("La suma da =  " + sumarNum(num1, num2));
    break;
    
    case 2:
        System.out.println("La resta da =  " + restarNum(num1, num2));
    break;
    
    case 3:
        System.out.println("La multiplicación da =  " + multiplicarNum(num1, num2));
    break;
    
    case 4:
        System.out.println("La division da =  " + divNum(num1, num2));
}
    
    
}

public static int sumarNum(int num1, int num2){
    int suma;
    
    suma = num1 + num2;
    return suma;
}

public static int restarNum(int num1, int num2){
    int resta;
    resta = num1 - num2;
    return resta;
}

public static int multiplicarNum(int num1, int num2){
    int multiplicacion;
    multiplicacion = num1 * num2;
    return multiplicacion;
}

public static int divNum(int num1, int num2){
    int div;
    div = num1 / num2;
    return div;
}
}
