/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;





/**
 *
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
 * numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 * 
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
* 
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
* Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.



 * @author Kroban
 */
public class CuentaBancaria {
    
public int numeroCuenta = 0;
public long dniCliente = 0;
public double saldoActual = 0;
public String usuario = null;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
    
    public CuentaBancaria(String usuario, int numeroCuenta, long dniCliente){
        this.usuario = usuario;
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;

    }
    
    public CuentaBancaria(){
        
    }
    
}
