/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicas;

import java.util.Iterator;
import Entidad.Libro;
import Servo.LibroServo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 
X Crea un programa de gestión de libros en una biblioteca. 
X Utiliza un ArrayList para almacenar objetos de la clase "Libro".
X Cada libro debe tener los siguientes atributos: título, autor y año de publicación.
X El programa debe tener las siguientes funcionalidades:
X Agregar libro: Permite al usuario ingresar el título, autor y año de publicación de un libro y lo agrega a la lista de libros.
X Eliminar libro: Muestra la lista de libros numerados y le pide al usuario que ingrese el número del libro que desea eliminar.
* Luego, elimina ese libro de la lista.
X lista de libros: Muestra todos los libros en la lista, enumerados con su título, autor y año de publicación.
X Salir del programa: Finaliza la ejecución del programa.

 * @author Kroban
 */
public class Ej2 {
public static void main(String[] args){
    
Scanner input = new Scanner(System.in);
ArrayList<Libro> Biblio = new ArrayList();
LibroServo ls = new LibroServo();


 boolean check = true;
    while(check){
    System.out.println("MENU");
    System.out.println("----------------------");
    System.out.println("Ingrese un número en base a estas opciones: ");
    System.out.println("1. Agregar Libro ");
    System.out.println("2. Eliminar Libro ");
    System.out.println("3. Lista de libros");
    System.out.println("4. Salir del programa");
    int counter = input.nextInt();
    
    switch(counter){
        case 1:
            Biblio.add(ls.crearLibro());
            break;
            
        case 2:
            ls.mostrarEncuadernado(Biblio);
            break;
            
        case 3:
            Iterator iterator = Biblio.iterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next() + " ");
            }
            
            //ls.mostrarLibros(Biblio);
            break;
            
        case 4:
             check = false;
            break;
    }
}
    
}
}
