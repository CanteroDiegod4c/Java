/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia7;

import Entidad.Puntos;
import java.util.Scanner;
/**
 *
 * @author Kroban
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
 * Sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
 * Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. 
 * Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
 * Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:

 */
public class Ejercicio6 {
public static void main(String[] args){
    
Scanner input = new Scanner(System.in);
int aux;

Puntos p1 = new Puntos(0,0,0,0);

p1.crearPuntos();
p1.calcularResultado();
}

}
