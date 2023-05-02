/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/*
 *
 * @author Kroban
 * 
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2"
 * y un método "calcular_area" que calcule y devuelva el área del rectángulo.
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */

public class Rectang {

private int lado1, lado2;
private double area;

//Constructores

public Rectang() {
}

public Rectang(int lado1, int lado2, double area) {
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.area = area;
}

//Getters y setters

public int getLado1() {
    return lado1;
}

public void setLado1(int lado1) {
    this.lado1 = lado1;
}

public int getLado2() {
    return lado2;
}

public void setLado2(int lado2) {
    this.lado2 = lado2;
}

public double getArea() {
    return area;
}

public void setArea(double area) {
    this.area = area;
}





}
