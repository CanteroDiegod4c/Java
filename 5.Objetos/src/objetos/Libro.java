/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

import java.util.Scanner;

/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro
y un constructor vacío.
Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 * @author Kroban
 */

public class Libro {

   private int numPag;
   private String autor, titulo, ISBN;

    public Libro() {
    }

    public Libro(String ISBN, int numPag, String autor, String titulo) {
        this.ISBN = ISBN;
        this.numPag = numPag;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   
   public void cargarLibro(){
       Scanner in = new Scanner(System.in);
       
       System.out.println("Ingrese el título ");
       titulo = in.nextLine();
       
       System.out.println("Ingrese el ISBN ");
       ISBN = in.nextLine();
       
       System.out.println("Ingrese el autor ");
       autor = in.nextLine();
       
       System.out.println("Ingrese numero de paginas ");
       numPag = in.nextInt();
   }

    @Override
    public String toString() {
        return 
                "Numero de páginas =" + numPag +
                "Autor =" + autor +
                "Titulo =" + titulo +
                "ISBN =" + ISBN +
                " ";
    }
   
   
    
   
}
