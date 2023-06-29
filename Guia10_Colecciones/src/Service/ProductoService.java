/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 * @author USUARIO
 */

public class ProductoService {
    
Scanner input = new Scanner(System.in);

public void agregarProducto(HashMap<String, Double> tienda){

        System.out.println("Ingrese el nombre del producto");
        String name = input.nextLine();

        System.out.println("Precio del producto");
        Double precio = input.nextDouble(); 
                                   input.nextLine();

         tienda.put(name, precio);


}
    
    
public void modificarPrecio(HashMap<String, Double> tienda){
    
    System.out.println("Cual producto desea modificar? ");
    String buscador = input.nextLine();
    
    if(tienda.containsKey(buscador)){
        System.out.println("Ingrese el nuevo precio");
        Double precioActualizado = input.nextDouble();
                                       input.nextLine();
        tienda.put(buscador, precioActualizado);
        System.out.println("Se ha modificado el precio del producto " + buscador + " a $ " + precioActualizado);
    }

}

public void eliminarProducto(HashMap<String, Double> tienda){
    
    System.out.println("Cual producto desea remover? ");
    String remo = input.nextLine();
    
    Iterator<Map.Entry<String, Double>> it =tienda.entrySet().iterator();
    
    while(it.hasNext()){
        Map.Entry<String, Double> entry = it.next();
        String producto = entry.getKey();
        
        if(producto.equalsIgnoreCase(remo)){
            it.remove();
            System.out.println("El producto " + remo + " se ha eliminado con exito");
        }
    }
}

 public void mostrarProductos(HashMap<String, Double> tienda){
        for(Map.Entry<String, Double> entry : tienda.entrySet()){
                         
                            String prod = entry.getKey();
                            Double precio = entry.getValue();
                            
                            System.out.println(" \n PRODUCTO: " + prod + "\n PRECIO: $ " + precio);
                         }
        
    }
        
}
