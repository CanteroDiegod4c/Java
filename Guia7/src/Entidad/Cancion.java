/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores:
-uno vacío que inicializa el título y el autor a cadenas vacías
-otro que reciba como parámetros el título y el autor de la canción.
Se deberán además definir los métodos getters y setters correspondientes.

 */
public class Cancion {

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
     public Cancion(){
         titulo = "";
         autor = "";
     }
    
private String titulo;
private String autor;

//setters

public void setTitulo(String titulo){
    this.titulo = titulo;
}

public void setAutor(String autor){
    this.autor= autor;
}

//getters

public String getAutor(){
    return autor;
}

public String getTitulo(){
    return titulo;
}

//métodos


}
