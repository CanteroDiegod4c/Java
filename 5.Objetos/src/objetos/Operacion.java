/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

import java.util.Scanner;

/**
 *Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 * @author Krob
 */
public class Operacion {

    private int num1, num2;

    public void crearOperacion(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero ");
        num1 = in.nextInt();
        
        System.out.println("Ingrese el segundo numero ");
        num2 = in.nextInt();
        
    }
    
    public void sumar(){
        int result = num1 + num2;
        
        System.out.println("  El resultado es " + result);
    }
    
    public void restar(){
        int rest = num1 - num2;
        
        System.out.println(" La resta da " + rest);
    }
    
    public int multiplicar(){
        if ( num1 == 0 || num2 == 0){
            System.out.println("Se ha multiplicado por 0 ");
            return 0;
        }else{
            return num1 * num2;
        }
    }
    
    public int division(){
        if ( num1 == 0 || num2 == 0){
            System.out.println("Se ha dividido por 0 ");
            return 0;
        }else{
            return num1 / num2;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //CONSTRUCTORES
    
    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    //GET Y SET
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //TO STRING 
    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
