/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
* Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
* Luego los pase por parámetro a un nuevo objeto Date.
* El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
* Método fechaActual que cree un objeto fecha con el día actual. 
* Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
* El método debe retornar el objeto Date.
* Método diferencia que reciba las dos fechas por parámetro
* y retorna la diferencia de años entre una y otra (edad del usuario).

 * @author Kroban
 */

public class FechaServo {
    
 
    
public Date fechaNacimiento(){
    Scanner input = new Scanner(System.in);
        int dia, mes, año;
        
        System.out.println("Ingrese el Día: ");
        dia = input.nextInt();
        System.out.println("");
        System.out.println("Ingrese el Mes: ");
        mes = input.nextInt();
        System.out.println("");
        System.out.println("Ingrese el Año: ");
        año = input.nextInt();
        input.nextLine();
        
        Date fechaNac = new Date(dia, mes, año);
        
        return fechaNac;
}

}
    
