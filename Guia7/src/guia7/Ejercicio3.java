
package guia7;

import java.util.Scanner;
import Entidad.Calculadora;

public class Ejercicio3 {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Calculadora c1 = new Calculadora();

int num1, num2;
boolean salir = false;
int checkSalir = 0;

    System.out.println("Ingrese el primer número");
    num1 = input.nextInt();
    input.nextLine();
    c1.setNum1(num1) ;
    
    System.out.println("---------------");
    
    System.out.println("Ingrese el segundo número ");
    num2 = input.nextInt();
    input.nextLine();
    c1.setNum2(num2);
    
    System.out.println("---------------");
    
    
    //------------------------------------------------------------


    System.out.println("Ingrese el valor según lo que desea hacer con estos números");
    System.out.println("1.Mostrar números ");
    System.out.println("2.Sumar números");
    System.out.println("3.Restar números");
    System.out.println("4.Multiplicar números");
    System.out.println("5.Dividir");
    int check = input.nextInt();
    input.nextLine();
    
        switch(check){
        case 1:
            
                System.out.println(" El primer número es " + c1.getNum1());
                System.out.println("El segundo número es " + c1.getNum2());
         
         break;
         
        case 2: 
            c1.sumar();
        break;
           
        case 3: 
           c1.restar();
        break;
           
        case 4: 
            c1.multiplicar();
        break;
                 
        case 5: 
            c1.division();
        break;
        
    }
        
}
}