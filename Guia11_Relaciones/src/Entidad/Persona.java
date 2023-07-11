/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;
import Entidad.Perro;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre, apellido;
    private Integer documento, edad;
    private Perro perro;

    public Persona(String pepe, String pesca, int par, int par1, Perro p1) {
    }

    public Persona(String nombre, String apellido, Integer documento, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "1. PERSONA"
                + "\n"  + "nombre = " + nombre
                + "\n" + "Apellido = " + apellido
                + "\n" + "Documento = " + documento
                + "\n" + "Edad = " + edad
                
                + "-------------------"
                + "\n" + "2. PERRO" 
                + "\n" + "Nombre = " + perro.getNombre()
                + "\n" + "Raza = " +  perro.getRaza()
                + "\n" + "Edad = " + perro.getEdad()
                + "\n" + "Tamaño = " + perro.getTamaño();
    }
    
    
}
