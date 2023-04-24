/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;
import Entidad.Rectangulo;
import java.util.Scanner;
/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */

public class Ejercicio4 {
public static void main(String[] args){
   
Scanner input = new Scanner(System.in);
Rectangulo r1 = new Rectangulo();

    System.out.println("Ingrese el número de la base del rectángulo ");
    int base1 = input.nextInt();
    input.nextLine();
    r1.setBase(base1);
    System.out.println("La base es de " + r1.getBase());
    
    System.out.println("Ingrese la altura del rectángulo ");
    int alt = input.nextInt();
    input.nextLine();
    r1.setAltura(alt);
    System.out.println("La altura es" + r1.getAltura());
    
    System.out.println("--------------------");
    System.out.println("");
    System.out.println("SUPERFICIE: " + r1.calcularSuperficie());
    
    System.out.println("PERIMETRO: " + r1.calcularPerimetro());
    
    r1.dibujarRectangulo();
}
}
