/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9;

import Entidades.Fecha;
import Servicios.FechaServo;
import java.util.Date;

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

public class Ejercicio4 {
public static void main(String[] args){

FechaServo fs = new FechaServo();
Date fecha = fs.fechaNacimiento();


    System.out.println(fecha.toString());
}
}
