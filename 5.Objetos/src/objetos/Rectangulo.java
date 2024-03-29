/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

import java.util.Scanner;

/**
 Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura.

  La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario.

 También incluirá un método para calcular la superficie del rectángulo
y un método para calcular el perímetro del rectángulo.
 
- Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author d4c
 */

public class Rectangulo {

    private int base, altura;
    
    public void crearRectangulo(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese base ");
        base = input.nextInt();
        
        System.out.println("Ingrese altura ");
        altura = input.nextInt();
        
    }

    public int calcularSuperficie(){
        return (base * altura);
    }
    
    public int calcularPerimetro(){
        return (base + altura) * 2;
    }
    
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
}
