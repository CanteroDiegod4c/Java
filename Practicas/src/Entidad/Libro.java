/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 
Crea un programa de gestión de libros en una biblioteca. 
Utiliza un ArrayList para almacenar objetos de la clase "Libro".
Cada libro debe tener los siguientes atributos: título, autor y año de publicación.
El programa debe tener las siguientes funcionalidades:
Agregar libro: Permite al usuario ingresar el título, autor y año de publicación de un libro y lo agrega a la lista de libros.
Eliminar libro: Muestra la lista de libros numerados y le pide al usuario que ingrese el número del libro que desea eliminar. Luego, elimina ese libro de la lista.
Mostrar lista de libros: Muestra todos los libros en la lista, enumerados con su título, autor y año de publicación.
Salir del programa: Finaliza la ejecución del programa.

 * @author Kroban
 */

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    
}
