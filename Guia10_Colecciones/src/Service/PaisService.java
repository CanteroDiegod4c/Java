/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

/**
 *Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 * @author USUARIO
 */
public class PaisService {
    
    Scanner input = new Scanner(System.in);
    
public void añadirPais(HashSet<String> paises){
    
    Scanner input = new Scanner(System.in);
    String conf = "S";
    
while(conf.equalsIgnoreCase("S")){

    System.out.println("Añada un pais");
    paises.add(input.nextLine());
    System.out.println("Desea añadir otro? S/N");
    conf = input.nextLine();
}
    mostrarPaises(paises);

}

public void mostrarPaises(HashSet<String> paises){
    System.out.println("Paises agregados: ");
    for(String pais : paises){
        
    System.out.println(pais);
}
    System.out.println("----------------------------------");
}

public void ordenarPaisesMeMa(HashSet<String> paises){
    ArrayList<String> paisesList = new ArrayList(paises);
    Collections.sort(paisesList);
    
    for(String pais : paisesList){
        System.out.println(pais); 
    }
    System.out.println("");
}
    
public void eliminarPaises(HashSet<String> paises){
    Iterator it = paises.iterator();
    System.out.println("Elija el pais a borrar");
    String borrar = input.nextLine();
    boolean check = false;
    
    while(it.hasNext()){
        if(it.next().equals(borrar)){
            it.remove();
            check = true;
        }
    }  
    
    if(check == true){
        System.out.println("Se ha borrado el pais " + borrar);
    }else{
        System.out.println("No se borró el país " + borrar );
    }
    
    ordenarPaisesMeMa(paises);
    
}


    
    }

