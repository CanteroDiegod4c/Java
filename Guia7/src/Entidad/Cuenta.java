/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;
import java.util.Scanner;

/**
 *
 * @author Kroban
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
 * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */
public class Cuenta {

Scanner input = new Scanner(System.in);

private double saldo;
private String titular;


public void setSaldo(double saldo){
    this.saldo = saldo;
}

public double getSaldo(){
    return saldo;
}

public String getTitular() {
    return titular;
}

public void setTitular(String titular) {
    this.titular = titular;
}

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }


public void retirar_dinero(){
    Scanner input = new Scanner(System.in);
    System.out.println("Cuanto dinero desea retirar? ");
    double ret = input.nextDouble();
    if((saldo - ret) < 0){
        System.out.println("No puede retirar dinero, sería saldo negativo");
        
    }else{
        saldo = saldo - ret;
        System.out.println("SALDO " + saldo);
        System.out.println("ha retirado " + ret + " de su cuenta");
    }
}

}
