/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;
import Entidades.Cadena;
import java.util.Scanner;

/**
 *Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud.
 * Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters.
 * El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
 * Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
 * 







Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 * @author Kroban
 */

public class CadenaServicio {

Scanner input = new Scanner(System.in);

String fraserev = "";
        
public Cadena crearCadena(){

    Cadena c1 = new Cadena();
    
    return c1;
    
}

public void crearFrase(Cadena c1){
    
    System.out.println("Ingrese la frase");
    c1.setFrase(input.nextLine());
    
}
//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
public void mostrarVocales(Cadena c1){
    String frase = c1.getFrase().toLowerCase();

    for(int i = 0; i < c1.getLongo() ; i++){


        char vocal = frase.charAt(i);

        if(vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u'){
            System.out.println("si es vocal");
        }else{
            System.out.println("No");
        }
}

    //asda

}

//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
public void invertirFrase(Cadena c1){

    for (int i = c1.getLongo() - 1; i >=0 ; i--){
        String frase = c1.getFrase();
        char rev = frase.charAt(i);
        fraserev = fraserev + rev;
    }

    System.out.println(fraserev);
}

    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //pedir el letra en el main al ser opcion
public void contarLetra(Cadena c1, String letra){
    int contador = 0;
    for(int i = 0; i < c1.getLongo(); i++){
           String esc = c1.getFrase().substring(i , i+1);
           if(esc.equalsIgnoreCase(letra)){
               contador++;

           }else{

           }

    }
    System.out.println("La letra se encontró " + contador + " veces");
}
    
//Método compararLongitud(String frase), deberá comparar la longitud de
// la frase que compone la clase con otra nueva frase ingresada por el usuario.
 public void compararFrases(Cadena c1, Cadena c2){

     if(c1.getLongo() == c2.getLongo()){
         System.out.println("Las dos cadena son iguales ");
     }else if(c1.getLongo() > c2.getLongo()){
         System.out.println("La primer cadena es mas larga ");
     }else if(c1.getLongo() < c2.getLongo()){
         System.out.println("La segunda cadena es mas larga ");
     }
 }

 //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
// con una nueva frase ingresada por el usuario y mostrar la frase resultante.
 
 public void unirFrases(String frase, Cadena c1){
     c1.setFrase(c1.getFrase() + frase);  
             
     System.out.println(c1.getFrase());
 }
 
 //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
 // por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
 public void reemplazar(Cadena c1, String letra){

     char[] fraseChar = c1.getFrase().toCharArray();
     
    for(int i = 0; i < c1.getLongo(); i++){
            String esc = String.valueOf(fraseChar[i]);
            
           if(esc.equalsIgnoreCase("a")){
               fraseChar[i] = letra.charAt(0);
           }else{}     
    }
    
    System.out.println(fraseChar);
    
    
}
 
 public boolean contiene(Cadena c1, String letra){
     
     char[] fraseChar = c1.getFrase().toCharArray();
     
     for(int i = 0; i < c1.getLongo(); i++){
         
         String esc = String.valueOf(fraseChar[i]);
         
         if(esc.equalsIgnoreCase(letra)){
             System.out.println("La letra se encuentra en la cadena");
            return true;
             
        } 
     }
        System.out.println("La letra no se encuentra en la cadena");
         return false;
 }
 
}
