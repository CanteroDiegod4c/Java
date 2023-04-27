/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia7;

import Entidad.Cuenta;

/**
 *
 * @author Kroban
 */
public class Ejercicio8 {
public static void main(String[] args){

Cuenta pepino = new Cuenta(520.25, "jorge");

System.out.println("Bienvenido " + pepino.getTitular() + ", su cuenta tiene " + pepino.getSaldo());
pepino.retirar_dinero();

}
}
