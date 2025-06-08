package main;

import java.util.Scanner;

/*
 Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

@author kroban_d4c
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int num1, num2;
        
        num1 = pedirNumero(input);
        num2 = pedirNumero(input);
        
        menu(input, num1, num2);
        
    }
    
    //Funcion para pedir numero y que devuelva un int
    public static int pedirNumero(Scanner input){
        System.out.println("Ingrese un numero");
        
        while(true){
             int num = input.nextInt();
            if(num < 0){
                System.out.println("ERROR, el numero debe ser positivo ");
                
            }else{
                System.out.println("Numero asignado");
                return num;
            }   
        }
    }
    
    //Funcion menu
    public static void menu(Scanner input, int num1, int num2){
        boolean check = true;
        
        while(check){
                System.out.println("MENU");
                System.out.println("1.Sumar");
                System.out.println("2.Restar");
                System.out.println("3.Multiplicar");
                System.out.println("4.Dividir");
                System.out.println("5.Salir");
                System.out.println("Elija opcion: ");
                int opcion = input.nextInt();
                
                        switch(opcion){
                            case 1 -> System.out.println("La suma da " + (num1 + num2));
                            case 2 -> System.out.println("La resta da " + (num1 - num2));
                            case 3 -> System.out.println("La multiplicacion da " + (num1 * num2));
                            case 4 -> System.out.println("La division da " + (num1 / num2));
                            case 5 -> {
                                System.out.println("¿Está seguro que desea salir del programa?\n" +
                                        "(S/N)?");
                                
                                String salir = input.next();
                                if(salir.equalsIgnoreCase("S")){
                                    System.out.println("Ha finalizado el programa");
                                    check = false;
                                }else{
                                    continue;
                                }
                }
        }
                        
        }
    }


}
