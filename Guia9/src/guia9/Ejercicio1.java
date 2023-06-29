/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9;
import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud.
 * Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters.
 * El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
 * Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
 * 
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 * @author Kroban
 */
public class Ejercicio1 {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    CadenaServicio sc = new CadenaServicio();
    boolean check = false;
    
    Cadena c1 = sc.crearCadena();
    Cadena c2 = sc.crearCadena();

while( check != true){
System.out.println("Ingrese una opcion segun lo que desea hacer ");
System.out.println("1.Crear Frase");
System.out.println("2.Mostrar Vocales");
System.out.println("3.Invertir Frase");
System.out.println("4.Contar letra");
System.out.println("5.Comparar frases (creando una nueva");
System.out.println("6.Unir frases");
System.out.println("7.Reemplazar");
System.out.println("8.Contiene");
System.out.println("9.Salir");

int option = input.nextInt();
input.nextLine();
switch(option){
         case 1:
           sc.crearFrase(c1);
        break;
       
         case 2:
            sc.mostrarVocales(c1);
        break;    
            
         case 3:
            sc.invertirFrase(c1);
        break;    
            
         case 4:
            System.out.println("Ingrese la letra a escanear");
            String inputs = input.nextLine();
            sc.contarLetra(c1, inputs);
        break;   
            
         case 5:
             sc.crearFrase(c2);
             sc.compararFrases(c1, c2);
        break;   
            
         case 6:
             sc.crearFrase(c2);
             sc.unirFrases(c2.getFrase(), c1);
        break;   
        
         case 7:
             System.out.println("Ingrese letra a reemplazar");
             inputs = input.nextLine();
             
             sc.reemplazar(c1, inputs);
        break;   
        
         case 8:
                System.out.println("Ingrese letra a buscar");
                inputs = input.nextLine();
             
                sc.contiene(c1, inputs);
        break;
            
         case 9:
            check = true;
        break;   
        
}}}}
