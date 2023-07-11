/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Cliente;
import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author nico
 */
public class Ej4Service {
    
    
    public Cliente crearCliente(){
        Cliente cliente = new Cliente();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Nombre de cliente:");
        cliente.setNombre(input.nextLine());
        
        System.out.println("Apellido");
        cliente.setApellido(input.nextLine());
        
        System.out.println("Documento");
        cliente.setDocumento(input.nextInt());
        
        System.out.println("Mail");
        cliente.setMail(input.nextLine());
        
        System.out.println("Domicilio");
        cliente.setDomicilio(input.nextLine());
        
        System.out.println("Telefono");
        cliente.setTelefono(input.nextInt());
        
        return cliente;
}
    
        
    
    public Vehiculo crearVehiculo(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Vehiculo ve = new Vehiculo();
        /*
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.chasis = chasis;
        this.año = año;
        this.numeroMotor = numeroMotor;
        */
        
        System.out.println("Año");
        ve.setAño(input.nextInt());
        
        System.out.println("Marca");
        ve.setMarca(input.nextLine());
        
        System.out.println("Modelo");
        ve.setModelo(input.nextLine());
        
        System.out.println("Color");
        ve.setColor(input.nextLine());
        
        System.out.println("Tipo");
        ve.setTipo(input.nextLine());
        
        System.out.println("Numero de motor");
        ve.setNumeroMotor(input.nextInt());
        
        System.out.println("Chasis");
        ve.setChasis(input.nextLine());
        
        return ve;
    }
}
