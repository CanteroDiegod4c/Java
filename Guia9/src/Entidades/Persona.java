/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.util.Date;

/*
 * Implemente la clase Persona en el paquete entidades.
 * Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
 * Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
 * Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
 * Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
 * Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
 * Método mostrarPersona que muestra la información de la persona deseada.
 * 
 * @author Kroban
 */

public class Persona {
    
    private String nombre;
    private Date fechaNac;

    public Persona() {
        this.fechaNac = new Date();
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
}
