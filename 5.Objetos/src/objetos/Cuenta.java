/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

import java.util.Scanner;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
 * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 * 
 * @author d4c
 */

public class Cuenta {
    private double saldo;
    private String titular;
    
    public void retirar_dinero(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hola " + titular + ", su saldo actual es de " + saldo);
        System.out.println("Cuanto desea retirar?");
        double efect = input.nextDouble();
        
        if(saldo < efect){
            System.out.println("No puede retirar esa cantidad de dinero porque la suma es mayor al saldo que posee ");
        }else{
            saldo = saldo - efect;
            System.out.println("Ha retirado " + efect);
            System.out.println("Ahora posee " + saldo);
            
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    
}
