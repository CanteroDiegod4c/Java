/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

import java.util.Scanner;
import Entidad.Cafetera;

/**
 *
 * @author Kroban
 */
public class CafeteraServ {

public Cafetera crearCafetera(){
    Cafetera nescafe = new Cafetera();
    return nescafe;
}

public void llenarCafe(Cafetera nescafe){
    nescafe.setCantidadAct(nescafe.getCapacidadMax());
}

/*
 * Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
 * Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
 * El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
 */

public void servirTaza(Cafetera nescafe){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el tamaño que tiene la taza a servir: ");
    System.out.println("");
    
    nescafe.setCapacidadMax(input.nextDouble());
    System.out.println("El tamaño de la taza es de " + nescafe.getCapacidadMax() + " ml");
    
    System.out.println("");
    System.out.println("Ahora se llenara la taza(Capacidad de llenado de 650 ml a 10 llenados de 65 ml");
    

    for(int i = 0; i < 10; i++){
        nescafe.setCantidadAct(nescafe.getCantidadAct()+ 65);
        System.out.println("Cantidad actual: " + nescafe.getCantidadAct());
        
    }
    
    if(nescafe.getCantidadAct() > nescafe.getCapacidadMax()){
       double desborde = nescafe.getCantidadAct() - nescafe.getCapacidadMax(); 
        System.out.println("La taza se desbordó por unos " + desborde + " ml ");
    }else if(nescafe.getCantidadAct() == nescafe.getCapacidadMax()){
        llenarCafe(nescafe);
        System.out.println("La taza se lleno por completo");
    }else{
        double sobrante = nescafe.getCapacidadMax() - nescafe.getCantidadAct();
        System.out.println("Faltó llenarse por completo la taza, le faltan unos " + sobrante + " ml");
    }
}
}
