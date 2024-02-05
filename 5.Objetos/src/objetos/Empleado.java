/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

import java.util.Scanner;

/**
 *Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial
 * de un empleado en función de su edad y salario actual.
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

 * @author d4c
 */

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public static Empleado crearEmp(){
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Ingrese su nombre ");
        String nombre = input.nextLine();
        
        System.out.println("Cual es su edad? ");
        int edad = input.nextInt();
        
        System.out.println("Cual es su salario actual ? ");
        double salario = input.nextDouble();
        
        
        return new Empleado (nombre, edad, salario);
    }
    
    public void calcular_aumento(){
        Double aumento, total;
        
        System.out.println("Hola " + nombre);
        System.out.println("El aumento programado es de 10% para mayores a 30 años y 5% para los que sean menor a 30");
        if(edad < 30){
            aumento = salario * 0.05;
        }else{
            aumento = salario * 0.10;
        }
        
        System.out.println("Por esto, su salario deberia aumentar " + aumento);
        total = aumento + salario;
        
        System.out.println ("En total seria " + total);
        
    }

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
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
    
    
}
