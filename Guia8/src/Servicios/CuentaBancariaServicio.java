/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;
import Entidad.CuentaBancaria;
import java.util.Scanner;
/**
 *Método para crear cuenta pidiéndole los datos al usuario. X
    Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual. X
    Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. X
    * Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0. X
    Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    * Validar que el usuario no saque más del 20%.
    Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 * @author Kroban
 */
public class CuentaBancariaServicio {
    
    Scanner input = new Scanner(System.in);

    public CuentaBancaria crearCuenta(){
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("Ingrese nombre de usuario");
        cuenta.setUsuario(input.nextLine());
        
        System.out.println("Numero de Cuenta ");
        cuenta.setNumeroCuenta(input.nextInt());
                
        System.out.println("Ingrese DNI");
        cuenta.setDniCliente(input.nextLong());

        return cuenta;
        
    }
    
     public void ingresarDinero(CuentaBancaria cuenta){
         
         System.out.println("Ingrese dinero");
         cuenta.setSaldoActual(input.nextDouble() + cuenta.getSaldoActual());
         
         System.out.println("Saldo Actual:  " + cuenta.getSaldoActual());
     }
     
     //Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
     //* Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
     
     public void retirarDinero(CuentaBancaria cuenta){
         System.out.println("Cuanto desea retirar? ");
         double retirar = input.nextDouble();
         
         if(cuenta.getSaldoActual() > retirar){
             cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar);
             
             System.out.println("Ha retirado " + retirar + ", a su cuenta le queda "  + cuenta.getSaldoActual());
         }else{
             
             cuenta.setSaldoActual(cuenta.getSaldoActual() - cuenta.getSaldoActual());
             
             System.out.println("Ha retirado el máximo disponible, su cuenta ha quedado en 0");
         }
     }
     
     public void extraccionRapida(CuentaBancaria cuenta){
         System.out.println("Ha elegido el metodo de extraccion rapida, se retira un 20% del saldo actual que posee:");
         
         double perzent = (cuenta.getSaldoActual() * 20) / 100;
         System.out.println("El 20% de  " + cuenta.getSaldoActual() + " es " + perzent);
         cuenta.setSaldoActual(cuenta.getSaldoActual() - perzent);
         System.out.println("Le quedan " + cuenta.getSaldoActual());
     }
     
     public void consultarSaldo(CuentaBancaria cuenta){
         System.out.println("Saldo Actual: " + cuenta.getSaldoActual());
         
     }
    
}
