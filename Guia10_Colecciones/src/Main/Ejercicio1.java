/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

/**
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
* 
* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
public class Ejercicio1 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> perros = new ArrayList();
        
        
        while(true){
            System.out.println("raza de perro a guardar");
            perros.add(input.nextLine());
            
            System.out.println("Desea ingresar otro perro? S/N" );
            String continuar = input.nextLine();
            
            if(continuar.equalsIgnoreCase("S")){
                
            }else{
                Iterator<String> it = perros.iterator();
                
                while(it.hasNext()){
                    System.out.println(it.next());
                }
                
                System.out.println("");
                System.out.println("Cual perro desea buscar?");
                String busqueda = input.nextLine();
                
                while(it.hasNext()){
                    
                    String perrito = it.next();
                    
                    if(perrito.equals(busqueda)){
                        System.out.println("Se ha eliminado" + it.next());
                        it.remove();
                        }else{
                            System.out.println("El perro no se encuentra");
                    }
                    
                    Collections.sort(perros);
                             for(String cadena : perros){
                            System.out.println(cadena);
                        }
                }
                
                break;
            }
            
        }
    }
    
}
