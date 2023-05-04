/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;
import Entidad.CuentaBancaria;
import java.util.Scanner;
/**
 *
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
    
}
