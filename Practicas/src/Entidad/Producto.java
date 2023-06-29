/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/*
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
public class Producto {
    
private String nombre;
private double precio;
private int cantidad;

public Producto() {
}

public Producto(String nombre, double precio, int cantidad) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public int getCantidad() {
    return cantidad;
}

public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}

    
}
