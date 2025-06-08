package main;

import java.util.Scanner;

/**
 *Una obra social tiene tres clases de socios:
    ○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50%
de descuento en todos los tipos de tratamientos.
    ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
de descuento para los mismos tratamientos que los socios del tipo
A.
    ○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
    ○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.

 * @author kroban_d4c
 */
public class EjerciciosX5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        double costo = ingresarCosto(input);
        String tipo = tipoSocio(input);
        
        descuento(tipo,costo);
        
        

        
    }
    
    //Funcion para ingresar el costo del tratamiento
    public static double ingresarCosto(Scanner input){
        
        System.out.println("Ingrese el costo del tratamiento");
        double costo = input.nextDouble();
        
        return costo;
        
    }

    //Funcion para  ingresar el tipo de socio
    public static String tipoSocio(Scanner input){
        System.out.println("Ingrese el tipo del socio");
        System.out.println("A. Cuota mayor, pero 50% de descuento");
        System.out.println("B. Cuota moderada, 35% de descuento");
        System.out.println("C. Cuota menor, sin descuento");
        
        String tipo = input.next();
        
        return tipo;
    }
    
    
    
    private static void descuento(String tipo, double costo) {
        

        if(tipo.equalsIgnoreCase("A")){
            System.out.println("El descuento seria de" + (costo * 0.50));
        }else if(tipo.equalsIgnoreCase("B")){
            System.out.println("El descuento seria de " + (costo * 0.35));
        }else if(tipo.equalsIgnoreCase("C")){
            System.out.println("No tiene descuento, por lo que seria " + costo);
        }else{
            System.out.println("El tipo de socio ingresado no existe");
    }
        
    }
}
