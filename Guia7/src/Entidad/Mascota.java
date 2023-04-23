
package Entidad;

import java.util.Scanner;

public class Mascota{

Scanner input = new Scanner(System.in);

public String nombre;
public String animal;
public String color;
public String comida;

public boolean cola;

public int peso;
public int edad;

public Mascota(Scanner input){
    this.animal =input.nextLine();
}

}
