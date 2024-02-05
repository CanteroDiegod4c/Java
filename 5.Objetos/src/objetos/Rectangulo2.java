/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

import java.util.Scanner;

/*
 *Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2"
 * y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 * @author d4c
 */

public class Rectangulo2 {
    private int lado1, lado2;

    public static Rectangulo2 crearRectangulo(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un lado ");
        int lado1 = in.nextInt();
        
        System.out.println("Ingrese lado 2");
        int lado2 = in.nextInt();
        
        return new Rectangulo2 (lado1, lado2);
    }
    

    public int calcular_area(){
        return lado1 * lado2;
    }
    
    public Rectangulo2() {
    }

    public Rectangulo2(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    
    
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
    
    
}
