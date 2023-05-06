/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 ** Programa Nespresso. Desarrolle una clase Cafetera en el paquete EntidadesX
 *  con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera)X
 *  y cantidadActual (la cantidad actual de café que hay en la cafetera). X
 * Agregar constructor vacío y con parámetros así como setters y getters.X
 * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:X
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. X
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
* Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
* El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 * @author Kroban
 */

public class Cafetera {
    private double capacidadMax, cantidadAct, cantidadServ;

    public Cafetera() {
    }

    public Cafetera(double capacidadMax, double cantidadAct, double cantidadServ) {
        this.capacidadMax = capacidadMax;
        this.cantidadAct = cantidadAct;
        this.cantidadServ = cantidadServ;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getCantidadAct() {
        return cantidadAct;
    }

    public void setCantidadAct(double cantidadAct) {
        this.cantidadAct = cantidadAct;
    }

    public double getCantidadServ() {
        return cantidadServ;
    }

    public void setCantidadServ(double cantidadServ) {
        this.cantidadServ = cantidadServ;
    }
   
    

    
    
    


    
    
    
    
    
    
    
    
    
    
}
