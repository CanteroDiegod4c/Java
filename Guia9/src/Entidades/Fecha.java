/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

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

public class Fecha {
    
    private int dia, mes, año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
