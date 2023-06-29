/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Service.ProductoService;
import java.util.HashMap;
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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        ProductoService ps = new ProductoService();
        HashMap<String, Double> tienda = new HashMap();

        
        boolean conf = true;
        while(conf){
            if(conf){
                System.out.println("HASHMAP DE PRODUCTOS " + "\n ________________________");
                System.out.println("1. Agregar Productos");
                System.out.println("2. Modificar Precio ");
                System.out.println("3. Eliminar Producto");
                System.out.println("4. Mostrar Productos");
                System.out.println("5. Salir");
                Integer opt = input.nextInt();
                
                switch(opt){
                        case 1:
                            ps.agregarProducto(tienda);
                        break;
                        
                        case 2:
                            ps.modificarPrecio(tienda);
                        break;
                        
                        case 3:
                            ps.eliminarProducto(tienda);
                        break;
                        
                        case 4:
                            ps.mostrarProductos(tienda);
                        break;
                        
                        case 5:
                            conf = false;
                        break;
                }
                
            }else{
                
                break;
            }
        }
    }
}
