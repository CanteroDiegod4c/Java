/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

import java.util.Scanner;

/**
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
 A continuación, se deben crear los siguientes métodos:
 
-Método constructor que inicialice el radio pasado como parámetro.
-Métodos get y set para el atributo radio de la clase Circunferencia.
-Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
-Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
-Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

@author d4c
 */
public class Circunferencia {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
public double calcArea(){
    double area = Math.PI * Math.pow(radio, 2);
    
    return area;
}

public double calcPer(){
    double per = 2 * Math.PI * radio;
    return per;
}
}
