/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Entidad.Cancion;
import java.util.Scanner;

/*

Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores:
uno vacío que inicializa el título y el autor a cadenas vacías y 
otro que reciba como parámetros el título y el autor de la canción.
Se deberán además definir los métodos getters y setters correspondientes.

 */
public class Ejercicio5 {
public static void main(String[] args){
    
Scanner input = new Scanner(System.in);
Cancion song = new Cancion();

    System.out.println("Ingrese el título de la canción ");
    String s = input.nextLine();
    song.setTitulo(s);
    
    System.out.println("");
    System.out.println("Ingrese el autor");
    String g = input.nextLine();
    song.setAutor(g);
    
    System.out.println("Titulo: " + song.getTitulo());
    System.out.println("Autor: " + song.getAutor());
}
}
