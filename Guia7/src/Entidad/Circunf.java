/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
A continuación, se deben crear los siguientes métodos:

-Método constructor que inicialice el radio pasado como parámetro.
-Métodos get y set para el atributo radio de la clase Circunferencia.
-Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
-Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
-Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

*/
import java.util.Scanner;

public class Circunf {
    
    
    private double radio;
    public double area;
    public double perimetro;
    
    public void setRadio(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        double radio2;
        radio2 = input.nextInt();
        this.radio = radio2;
        input.close();
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void crearCircunferencia(){
       setRadio();
       
       System.out.println("el radio es " + getRadio());
    }
    
    public void area(){
        area = Math.PI*(Math.pow(getRadio(), 2));
        System.out.println("El área de la circunferencia es: " + area );
    }
    
    public void perimetro(){
        perimetro = Math.PI * radio * 2;
        System.out.println("El perímetro es: " + perimetro);
    }
}
