/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Scanner;
/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
public class Rectangulo {
    
    
    
    
    
private int base;
private int altura;
public int perimetro;
public int superficie;

public Rectangulo(){
    
}

public Rectangulo(int base, int altura, int perimetro, int superficie){
    this.base= base;
    this.altura = altura;
    this.perimetro = perimetro;
    this.superficie = superficie;
}

public void setBase(int base){
    this.base = base;
}

public int getBase(){
    return base;
}

public void setAltura(int altura){
    this.altura = altura;
}
public int getAltura(){
    return altura;
}

public int calcularSuperficie(){
    //Superficie = base * altura
    
    superficie = getBase() * getAltura();
    return superficie;
}

public int calcularPerimetro(){
    //Perímetro = (base + altura) * 2
    
    perimetro = (getBase() + getAltura()) * 2;
    return perimetro;
}

public void dibujarRectangulo(){
    int val2 = getBase();
    int val1 = getAltura();
            
        String[][] matriz = new String[val1][val2];
      
      for(int i = 0; i < val1; i++){
          for(int j = 0; j < val2; j++){
              
                  matriz[i][j] = "   ";    

     
          }
          
      }
      
      for(int i = 0; i < val1 ; i++){
          for(int j = 0; j < val2; j++){
               if( i == 0 || i == val1-1 || j == 0 || j == val2-1){
                  matriz[i][j] = "-- ";

              }
          }
      }
      
      for(int i = 0; i < val1 ; i++){
          for(int j = 0; j < val2; j++){
                  System.out.print(matriz[i][j]);
              }
               System.out.println("");
          }


}
}
