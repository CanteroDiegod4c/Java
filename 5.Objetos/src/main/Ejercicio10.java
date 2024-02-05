/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import objetos.Rectangulo2;

/**
 *Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2"
 * y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 * @author d4c
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        
        Rectangulo2 rectangulo1 = Rectangulo2.crearRectangulo();
        
        System.out.println("El area del rectangulo es de " + rectangulo1.calcular_area());
    }
}
