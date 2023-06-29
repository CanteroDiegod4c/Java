/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servo;

import Entidad.Producto;
import java.util.ArrayList;
import java.util.Scanner;
/**
 Crea un programa de gestión de productos en un inventario.
Utiliza un ArrayList para almacenar objetos de la clase "Producto". 
Cada producto debe tener los siguientes atributos: nombre, precio y cantidad en stock.
El programa debe tener las siguientes funcionalidades:
Agregar producto: Permite al usuario ingresar el nombre, precio y cantidad en stock de un producto y lo agrega al inventario.
Vender producto: Muestra la lista de productos enumerados y le pide al usuario que ingrese el número del producto que desea vender.
Luego, disminuye la cantidad en stock de ese producto en 1.
Mostrar inventario: Muestra todos los productos en el inventario, enumerados con su nombre, precio y cantidad en stock.
Calcular valor total del inventario: Calcula y muestra el valor total del inventario, que es la suma del precio por la cantidad en stock de todos los productos.
Salir del programa: Finaliza la ejecución del programa.
 * @author Kroban
 */


public class ProdService {
Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto agregarProducto(){
        System.out.println("NOMBRE DE PRODUCTO ");
        String nombre = leer.nextLine();
        System.out.println("PRECIO");
        double precio = leer.nextDouble();
        System.out.println("CANTIDAD");
        int cantidad = leer.nextInt();
     
        Producto producto = new Producto(nombre, precio, cantidad);
        return producto;
    }
    
public void venderProducto(ArrayList<Producto > gest){
    System.out.println("Elija el producto que desea vender:  ");

    int contador = 1;
    
    for(Producto producto : gest){
        System.out.println("PRODUCTO " + contador);
        System.out.println(producto.getNombre());
        System.out.println("CANTIDAD" + producto.getCantidad());
        
        contador++;
    }
    
    int checker = leer.nextInt() - 1;

    
}
}
