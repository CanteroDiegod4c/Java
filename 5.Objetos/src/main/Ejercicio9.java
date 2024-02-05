/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import objetos.Empleado;

/**
 *Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial
 * de un empleado en función de su edad y salario actual.
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

 * @author d4c
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Empleado e1 = Empleado.crearEmp();
        
        e1.calcular_aumento();
    }
}
