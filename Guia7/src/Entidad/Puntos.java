package Entidad;

import java.util.Scanner;

/*
 @author Kroban_d4c

Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos.
Sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:

 */
public class Puntos {

    public Puntos(int x1, int y1, int x2, int y2) {
        System.out.println("Ingrese el valor de x del primer punto");
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Puntos() {
    }

    //Valores con get y set
    
public int x1,y1,x2,y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }


//Método CrearPuntos

public void crearPuntos(){
    
Scanner input = new Scanner(System.in);
int aux;
System.out.println("Ingrese el valor del primer punto");
System.out.print("X = ");
aux = input.nextInt();
          input.nextLine();
setX1(aux);


System.out.print("Y = ");
aux = input.nextInt();
           input.nextLine();
setY1(aux);

System.out.println("");
System.out.println("Ingrese los valores del segundo punto");
System.out.print("X = ");
aux = input.nextInt();
          input.nextLine();
setX2(aux);

System.out.print("Y = ");
aux = input.nextInt();
          input.nextLine();
setY2(aux);

}

public double calcularResultado(){
double resultado = Math.sqrt( Math.pow( (getX2() - getX1() ), 2) + Math.pow( (getY2() - getY1() ), 2) );
    
System.out.print("La distancia entre los 2 puntos es de: " + resultado);
return resultado;
}

}



//
