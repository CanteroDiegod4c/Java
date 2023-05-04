/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;
import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        
        CuentaBancaria usuario = cbs.crearCuenta();
        
        
        System.out.println(usuario.usuario + usuario.dniCliente + usuario.numeroCuenta);
    }
    
   
    
}
