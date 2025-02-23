/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
 * por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
 * La función tendrá como parámetros, la cantidad de euros y la moneda a convertir
 * que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
 * (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 * @author kroban_d4c

-una funcion menu para que el usuario elija la moneda (comparar cadenas)
-una funcion que le pida al usuario ingresar la moneda.
-una funcion que use los mencionados anteriormente como parámetros, y haga el cambio de divisa.
,
**/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
       cambioDivisa(ingresarCantidad(input), menuMoneda(input));
        
    }
    
    
    
    //Una función de menú donde el usuario elige el tipo de moneda para hacer la conversión.
    public static String menuMoneda(Scanner input){
       
        
        System.out.println("Elija un número según la moneda que desea convertir: ");
        System.out.println("1.Libra");
        System.out.println("2.Dólar");
        System.out.println("3.Yenes");
        int cap = input.nextInt();
        
        String moneda = "";
        
        
        switch(cap){
            case 1:
                moneda = "Libra";
                break;
                
            case 2:
                moneda = "Dolar";
                break;
                
            case 3:
                moneda = "Yen";
                break;
 
        }
        
        return moneda;

    }
    
    //Una función donde el usuario ingresa la cantidad de euros.
    public static double ingresarCantidad(Scanner input){
        
        System.out.println("Ingrese la cantidad de euros: ");
        double euros = input.nextDouble();
        
        return euros;
    }
    
    //Una funcion que realiza el cambio de divisa.
    public static void cambioDivisa(double euros, String moneda){

        double divisa = 0;
        
        switch (moneda){
            
            case "Libra" -> {
                
                // 0.86 libras es un 1 €
                divisa = euros * 0.86;
            }
                
            case "Dolar" -> {
                //1.28611 $ es un 1 €
                divisa = euros * 1.28611;
            }
                
            case "Yen" -> {
                // 129.852 yenes es un 1 €
                divisa = euros * 129.852;
            }
            
                
        }
        
        divisa = Math.round(divisa * 100.0) / 100.0;
        System.out.println((euros) + " euros serían " + divisa + " " + moneda);
    }
}
