/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servo;

import Entidad.Libro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Kroban
 */
public class LibroServo {
Scanner input = new Scanner(System.in);


public Libro crearLibro(){


    System.out.println("Ingrese Titulo");
    String title = input.nextLine();
    System.out.println("Ingrese autor");
    String aut = input.nextLine();
    System.out.println("Ingrese año de publicación");
    int añoPub = input.nextInt();
    input.nextLine();
    Libro libro = new Libro(title, aut, añoPub);

    return libro;
}
    

public void mostrarEncuadernado(ArrayList<Libro> biblio){

int contador = 1;
for(Libro libro : biblio){
    
    System.out.println("Libro " + contador);
    System.out.println(libro.getTitulo());
    System.out.println("");

    contador++;
}

System.out.println("Cual libro desea borrar? ");
int borrador = input.nextInt() - 1;
input.nextLine();
    
biblio.remove(borrador);
}

public void mostrarLibros(ArrayList<Libro> biblio){
    
int contador = 1;
for(Libro libro : biblio){
    
    System.out.println("LIBRO " + contador);
    System.out.println("TITULO  " + libro.getTitulo());
    System.out.println("AUTOR " + libro.getAutor());
    System.out.println("AÑO DE PUBLICACION " + libro.getAñoPublicacion());
    System.out.println("---------------------------------");
    System.out.println("");
    contador++;
}

}

}

