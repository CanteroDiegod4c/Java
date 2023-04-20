
package guia3;


import java.util.Scanner;
/*
Crear un programa que dado un número determine si es par o impar.
 */
public class Guia3 {

  
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("ingrese el número, a continuación se verá si es par o impar: ");
int numCheck = input.nextInt();
    
if ((numCheck % 2) == 0){
    
    System.out.println("Este número es par");
}else{
    System.out.println("Este número es impar");
}

input.close();
}
}
