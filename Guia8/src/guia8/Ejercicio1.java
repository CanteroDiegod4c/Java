/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;
import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
CuentaBancariaServicio cbs = new CuentaBancariaServicio();
System.out.println("Comencemos creando su cuenta ");
CuentaBancaria usuario = cbs.crearCuenta();



int option = 0;
while(option != 7){

    System.out.println("----------------------------------------------------------");
    System.out.println("Ingrese un numero segun las siguientes opciones ");
    System.out.println("");
    System.out.println("1. Ingresar Dinero");
    System.out.println("2. Retirar Dinero");
    System.out.println("3. Extraccion Rapida (20%)");
    System.out.println("4. Consultar Saldo");
    System.out.println("5. Consultar Datos");
    System.out.println("6. Salir");
    System.out.println("");

    option = input.nextInt();
    switch(option){
        case 1:
            cbs.ingresarDinero(usuario);
        break;
        case 2:
            cbs.retirarDinero(usuario);
        break;
        case 3:
            cbs.extraccionRapida(usuario);
        break;
        case 4:
            cbs.consultarSaldo(usuario);
        break;
        case 5:
            System.out.println("Usuario: " + usuario.getUsuario());
            System.out.println("DNI: " + usuario.dniCliente);
            System.out.println("Numero de Cuenta: " + usuario.numeroCuenta);
        break;
        case 6:
            option = 7;
        break;
    }
    
    System.out.println("---------------------------------------");
    
}
}
}
