/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

/**
 *Crear en el Main dos arreglos. 
 * El arreglo A de 50 números reales y el arreglo B de 20 números reales.
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
 * Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
 * Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
 * Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 * Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
 * Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 * En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 * @author Kroban
 */

public class Array {
    
    private int tamaño;
    public double[] vector;

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public Array() {
    }

    public Array(int tamaño) {
        this.tamaño = tamaño;
        vector = new double[tamaño];
    }

    

} 
