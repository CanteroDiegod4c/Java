/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


/*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío.
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método
el número de ISBN, el título, el autor del libro y el número de páginas.
*/

public class Libro {
 
    public String ISBN; //Numero identificador de libro
    public String titulo;
    public int numPag;
    public String autor;

    
    //MÉTODO para cargar libro
    public void cargarLibro(String ISBN, String titulo, int numPag, String autor){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        
    }
    
    //MÉTODO para subir libro
    public void subirInfo(){
        System.out.println("----------------------");
        System.out.println("LIBRO " + titulo);
        System.out.println("Escrito por " + autor);
        System.out.println(numPag + " páginas");
        System.out.println("ISBN: " + ISBN);
    }
    
    public Libro(){
        
    }
    
}
