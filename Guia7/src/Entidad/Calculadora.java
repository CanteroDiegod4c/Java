/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Scanner;

/**
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
public class Calculadora {

    public Calculadora(int num1, int num2, int resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }
    
    public Calculadora(){
        
    }
    
private int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

private int num2;
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

public int resultado;

public void sumar(){
    resultado = getNum1() + getNum2();
    System.out.println("La suma es: " + resultado);
    }

public void restar(){
    resultado = getNum1() - getNum2();
    System.out.println("La resta es " + resultado);
}

public void multiplicar(){
    if(getNum1() == 0 || getNum2() == 0){
        System.out.println("Uno de los números es 0, por lo que da 0");
    }else{
        resultado = getNum1() * getNum2();
        System.out.println("La multiplicación da " + resultado);
    }
}

public void division(){
     if(getNum1() == 0 || getNum2() == 0){
        System.out.println("Uno de los números es 0, por lo que da 0");
    }else{
        resultado = getNum1() / getNum2();
        int resto = getNum1() % getNum2();
        System.out.println("La division da " + resultado + " con un resto de " + resto);
    }
}
}

