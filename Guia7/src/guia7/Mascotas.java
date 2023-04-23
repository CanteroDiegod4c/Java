
package guia7;

import Entidad.Mascota;
import java.util.Scanner;

public class Mascotas {
    
public static void main(String[] args){
        
    
Scanner input = new Scanner(System.in);


System.out.println("Cual es el animal que tiene de mascota? ");
Mascota m1 = new Mascota(input);

//Nombre de animal
System.out.println("nombre de su " + m1.animal);
m1.nombre = input.nextLine();

//Edad de animal
System.out.println("");
System.out.println("Que edad tiene? ");
m1.edad = input.nextInt();
input.nextLine();

System.out.println("");
System.out.println("Su animal tiene cola?");
String checkCola = input.nextLine();
if(checkCola.equalsIgnoreCase("Si")){
    m1.cola = true;
}

System.out.println("");
System.out.println("Que color tiene su animal? ");
m1.color = input.nextLine();

System.out.println("");
System.out.println("Cual es el alimento preferido de su mascota? ");
m1.comida = input.nextLine();

System.out.println("----------------------------------------");
System.out.println("Su " + m1.animal + " se llama " + m1.nombre + ", tiene " + m1.edad + " años de edad, y su alimento preferido es " + m1.comida );





 }

}
