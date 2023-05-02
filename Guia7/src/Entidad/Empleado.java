/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import java.util.Scanner;

/**
 *
 * @author Kroban
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
public class Empleado {
    
Scanner input = new Scanner(System.in);

private String nombre;
private int edad;
private double salario;

    public Empleado(String nombre, int edad, double salario) {
        System.out.println("Ingrese nombre");
        this.nombre = input.nextLine();
        
        System.out.println("");
        System.out.println("Ingrese edad ");
        this.edad = input.nextInt();
        
        System.out.println("");
        System.out.println("Ingrese salario actual");
        this.salario = input.nextDouble();
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

public void calcularAumento(){
    double aumento, calc;
    
    if(getEdad() < 30){
        aumento = (getSalario() * 0.05);
        calc =  aumento + getSalario();
    
        System.out.println("el aumento es de " + aumento);
        System.out.println("El total sería de " + calc);
    }else if(getEdad() > 30){
        aumento = (getSalario() * 0.10);
        calc =  aumento + getSalario();
    
        System.out.println("el aumento es de " + aumento);
        System.out.println("El total sería de " + calc);
    }
    
}
}
