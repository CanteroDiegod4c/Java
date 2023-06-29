/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

import Entidades.Persona;
import java.util.Scanner;
import java.util.Date;


 /*
 * Implemente la clase Persona en el paquete entidades.X
 * Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. X
 * Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:X
 * Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
 * Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
 * Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
 * Método mostrarPersona que muestra la información de la persona deseada.
 * 
 * @author Kroban
 */

public class PersonaServo {

public Persona crearPersona(){
    Scanner input = new Scanner(System.in);
    Persona p1 = new Persona();
    
    System.out.println("Nombre:");
    p1.setNombre(input.nextLine());
    
    System.out.println("Dia");
    int dia = p1.setFechaNac()

}

public void parseFecha(String l1){
    
}
}
