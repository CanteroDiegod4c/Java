/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


/**
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).X
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:X
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.X
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.X
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.X
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.X
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * @author USUARIO
 */
public class PeliculaService {
    Scanner input = new Scanner(System.in);
    
    public Pelicula crearPelicula(){
        Pelicula peli = new Pelicula();
        
        System.out.println("TITULO");
        peli.setTitulo(input.nextLine());
        
        System.out.println("DIRECTOR");
        peli.setDirector(input.nextLine());
        
        System.out.println("DURACION EN HORAS");
        peli.setDuracion(input.nextDouble());
        input.nextLine();
        
        return peli;
    }
    
    public void agregarPelicula(ArrayList<Pelicula> peLista){
        boolean stop = true;
        
        peLista.add(crearPelicula());
        System.out.println("Desea agregar otra pelicula a la lista? S/N");
        String check = input.nextLine();
        
        while(stop){
            if(check.equalsIgnoreCase("S")){
            peLista.add(crearPelicula());
            System.out.println("Desea agregar otra pelicula a la lista? S/N");
            check = input.nextLine();
        }else{
                break;
            }
        }    
    }
    
    public void mostrarPelicula(ArrayList<Pelicula> peLista){
        
        for(Pelicula pelis : peLista){
            System.out.println(pelis);
            System.out.println();
        }
        }
    
    
    public void mayorDuracion(ArrayList<Pelicula> peLista){
        System.out.println("Peliculas con duracion mayor a 60 minutos");
        
        for(Pelicula pelis : peLista){
            if(pelis.getDuracion() > 60.0){
                System.out.println(pelis);
            }
    }
    }
        
    
    
    public void ordenarPeliculaMeMa(ArrayList<Pelicula> peLista){
        peLista.sort(Pelicula.compararDuracion);
        
        System.out.println("Peliculas de menor a mayor:");
        mostrarPelicula(peLista);
    }
    
    public void ordenarPeliculaMaMe(ArrayList<Pelicula> peLista){
        peLista.sort(Pelicula.compararNegaDuracion);
        System.out.println("Peliculas de mayor a menor:");
        mostrarPelicula(peLista);
    }
    
    public void ordenarTitulo(ArrayList<Pelicula> peLista){
        peLista.sort(Pelicula.compararTitulo);
        System.out.println("Peliculas ordenadas por título");
        mostrarPelicula(peLista);
        
    }
    
        public void ordenarDirector(ArrayList<Pelicula> peLista){
        peLista.sort(Pelicula.compararDirector);
        System.out.println("Peliculas ordenadas por director");
        mostrarPelicula(peLista);
        
    }
}
