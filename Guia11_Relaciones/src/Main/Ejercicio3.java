/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entidad.Perro;
import Entidad.Persona;
import Service.PerroService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
* 
* Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
     * @param args the command line arguments
     */

public class Ejercicio3 {
    public static void main(String[] args) {
        
        ArrayList<Persona> personL = new ArrayList();
        ArrayList<Perro> pL = new ArrayList();
        Iterator it = personL.iterator();
        Scanner input = new Scanner(System.in);
        PerroService ps = new PerroService();
        
        ps.crearPerro(pL);
        ps.crearPerro(pL);
        ps.crearPerro(pL);
        ps.crearPerro(pL);
        ps.crearPerro(pL);
        
        
        
        for(Persona persona : personL){
            System.out.println(persona.getNombre() + " Cual perro desea adoptar? ");
            
                for(Perro perro : pL){
                    System.out.println("Perro " + perro.getNombre() + " ? ");
                    String perroAdoptar = input.nextLine();
                        if(perroAdoptar != null){
                            
                        }
                }

        }
        
    }
}
