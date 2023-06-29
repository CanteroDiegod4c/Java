/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;
import Entidades.ParDeNumeros;

/**
 *
 * @author Kroban
 */
public class ParDeNumerosService {
    
    public ParDeNumeros crearObjeto(){
        ParDeNumeros p1 = new ParDeNumeros();
        return p1;
    }
    
    public void mostrarValores(ParDeNumeros p1){
            System.out.println(p1.getNum1());
            System.out.println(p1.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros p1){
        double mayor;
        
        if(p1.getNum1() > p1.getNum2()){
            mayor = p1.getNum1();
        }else{
            mayor = p1.getNum2();
        }
        
        return mayor;
    }
    
    public double calcularPotencia(ParDeNumeros p1){
        // Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
        // Previamente se deben redondear ambos valores.
        
      double num1, num2, resultado;
       num1 = Math.round(p1.getNum1());
       num2 = Math.round(p1.getNum2());
       
        System.out.println(num1);
        System.out.println(num2);
        
       if(num1 > num2){
           resultado = Math.pow(num1, num2);
            
       }else{
           resultado = Math.pow(num2, num1);
        
       }

        return resultado;
       
    }
    
    public double calcularRaiz(ParDeNumeros p1){
        double num1,num2,resultado;
        
        num1 = Math.round(p1.getNum1());
        num2 = Math.round(p1.getNum2());
       
        
       if(num1 > num2){
           resultado = Math.sqrt(num2);
       }else{
           resultado = Math.sqrt(num1);
       }
            return resultado;
        
        }
    }
