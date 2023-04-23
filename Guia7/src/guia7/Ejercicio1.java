
package guia7;
import java.util.Scanner;
import Entidad.Libro;

/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío.
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método
el número de ISBN, el título, el autor del libro y el número de páginas.
 */
public class Ejercicio1 {
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    Libro lib1 = new Libro();
    
    System.out.println("Ingrese el título del libro: ");
    lib1.titulo = input.nextLine();
    
    System.out.println("");
    System.out.println("Ingrese el número identificador del libro (ISBN) ");
    lib1.ISBN = input.nextLine();
   
    
    System.out.println("");
    System.out.println("Ingrese el autor o la autora de la obra: ");
    lib1.autor = input.nextLine();
    
    System.out.println("");
    System.out.println("Cantidad de páginas del libro: ");
    lib1.numPag = input.nextInt();
    input.nextLine();
    
    
    System.out.println("--------------------");
    lib1.subirInfo();
    
    
    
}
}
