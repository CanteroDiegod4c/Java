/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Kroban
 */
public class nUMEROS {
public static void main(String[] args){

    ArrayList<Integer> xd = new ArrayList();
    
    añadir(xd);
    Collections.sort(xd);
    Iterator it = xd.iterator();
    
    while(it.hasNext()){
        System.out.println(it.next() + " ");
    }


}

public static void ordenar(ArrayList<Integer> xd){
    
}

public static void añadir(ArrayList<Integer> xd){
    int check = 0;
    
    Scanner leer = new Scanner(System.in);
    while(check != 1){
         xd.add(leer.nextInt());
         System.out.println("Ingrese check");
         check = leer.nextInt();
         leer.nextLine();
    }
}
    
   
}


