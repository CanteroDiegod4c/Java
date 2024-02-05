/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

import java.util.Scanner;

/**
 *Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 * @author d4c
 */

import java.util.Scanner;

public class Puntos {
    public double x1, x2, y1, y2;

    public double calcularDistancia() {
        double distancia;
        double p1 = x2 - x1;
        double p2 = y2 - y1;
        distancia = Math.sqrt(Math.pow(p1, 2) + Math.pow(p2, 2));

        return distancia;
    }

    public static Puntos crearPuntos() {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese x1");
        double x1 = in.nextDouble();

        System.out.println("Ingrese y1");
        double y1 = in.nextDouble();

        System.out.println("SEGUNDO PUNTO");
        System.out.println("Ingrese x2");
        double x2 = in.nextDouble();

        System.out.println("Ingrese y2");
        double y2 = in.nextDouble();

        return new Puntos(x1, x2, y1, y2);
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Puntos() {
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}