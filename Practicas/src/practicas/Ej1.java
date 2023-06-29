/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicas;
import java.util.Scanner;
import Entidad.Producto;
import Servo.ProdService;
import java.util.ArrayList;

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
public class Ej1 {
public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Producto> Gestionador = new ArrayList();
        ProdService ps = new ProdService();
    
boolean check = true;
while(check){
System.out.println("GESTIONADOR DE PRODUCTOS");
System.out.println("----------------------");
System.out.println("Ingrese un número en base a estas opciones: ");
System.out.println("1. AGREGAR PRODUCTO ");
System.out.println("2. VENDER PRODUCTO ");
System.out.println("3. MOSTRAR INVENTARIO");
System.out.println("4. CALCULAR VALOR TOTAL DE INVENTARIO");
System.out.println("5. SALIR");
int counter = leer.nextInt();
    
switch(counter){
            case 1:
                Gestionador.add(ps.agregarProducto());
                break;

            case 2:


                break;

            case 3:

                break;

            case 4:
                break;

            case 5:
                 check = false;
                break;
    }
    
   
}
}
}
