/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import objetos.Cuenta;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
 * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 * 
 * @author d4c
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta(15000, "Jorge Carlos");
        
        c1.retirar_dinero();
    }
}
