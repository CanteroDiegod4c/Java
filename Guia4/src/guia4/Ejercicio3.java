/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;
import java.util.Scanner;

/**
 Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
public class Ejercicio3 {
    
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Ingrese la cantidad de euros a convertir:  ");
    int euros = input.nextInt();
    input.nextLine();
    
    System.out.println("A que moneda desea convertir? Elija un numero");
    System.out.println("1. Euros a libras ");
    System.out.println("2. Euros a dólares ");
    System.out.println("3. Euros a yenes  ");
    System.out.println("_________________");
    int choice = input.nextInt();
    input.nextLine();
    
    conversor(euros,choice);
}

public static void conversor(int euros, int choice){
    switch(choice){
        case 1:
            double libra = euros * 0.86;
            String libraa = Double.toString(libra);
            System.out.println(euros + "  Euros serían " + libraa + "  libras");
         break;
            
        case 2:
            double dolares = euros * 1.28611;
            String dolarin = Double.toString(dolares);
            System.out.println(euros + "  Euros serían " + dolarin + " dólares");
         break;
         
        case 3:
            double yenes = euros * 129.852;
            String yen = Double.toString(yenes);
            System.out.println(euros + "  Euros serían " + yen + " yenes");
         break;
    }
}
}
