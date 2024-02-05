/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import java.util.Scanner;
import objetos.Circunferencia;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
 * A continuación, se deben crear los siguientes métodos:
 * 
- Método constructor que inicialice el radio pasado como parámetro.
- Métodos get y set para el atributo radio de la clase Circunferencia.
- Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
- Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
- Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 * @author d4c
 */
public class Ejercicio2 {
public static void main(String[] args) {
    Circunferencia c1 = crearCircunferencia();
    
    System.out.println("El area es " + c1.calcArea());
    
    System.out.println("El perimetro es " + c1.calcPer());
    
    
}

    public static Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        c1.setRadio(input.nextDouble());
        return c1;
    }
}
