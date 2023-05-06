/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia8;
import Entidad.Cafetera;
import Servicios.CafeteraServ;

/**
 *
 * @author Kroban
 */
public class Ejercicio2 {
public static void main(String[] args){

CafeteraServ cs = new CafeteraServ();
Cafetera nescafe = cs.crearCafetera();

cs.servirTaza(nescafe);

}
}
