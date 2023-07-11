/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nico
 */
public class PerroService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPerro(ArrayList perroLista){
        Perro perro = new Perro();
        System.out.println("NOMBRE");
        perro.setNombre(input.nextLine());
        
        System.out.println("RAZA");
        perro.setRaza(input.nextLine());
        
        System.out.println("EDAD");
        perro.setEdad(input.nextInt());
        input.nextLine();
        
        System.out.println("TAMAÑO");
        perro.setTamaño(input.nextDouble());
        input.nextLine();
        
        perroLista.add(perro);
        
    }
    
    public void crearPersona(ArrayList personaLista){
        Perro p1 = null;
        Persona persona = new Persona("pepe", "pesca", 52525, 25, p1);
        System.out.println("NOMBRE");
        persona.setNombre(input.nextLine());
        
        System.out.println("APELLIDO");
        persona.setApellido(input.nextLine());
        
        System.out.println("DOCUMENTO");
        persona.setDocumento(input.nextInt());
        input.nextLine();
        
        System.out.println("EDAD");
        persona.setEdad(input.nextInt());
        input.nextLine();
        
        personaLista.add(persona);
        
    }
}
