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
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
 * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */

public class Ejercicio8 {
public static void main(String[] args){

Cuenta pepino = new Cuenta(520.25, "jorge");

System.out.println("Bienvenido " + pepino.getTitular() + ", su cuenta tiene " + pepino.getSaldo());
pepino.retirar_dinero();

}
}
