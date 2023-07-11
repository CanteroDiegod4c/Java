/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nico
 */
public class Simulador {
    Scanner input = new Scanner(System.in);
    
    
    public ArrayList crearNombres( ){
        
        ArrayList<String> nombres = new ArrayList();
        
        nombres.add("Pepe Pesca");
        nombres.add("Jose Jose");
        nombres.add("Maria Mara");
        nombres.add("Joao Martine");
        nombres.add("Victoria Bearger");
        nombres.add("Martuse Mongolin");
        nombres.add("Willow Wawa");
        nombres.add("Diego Deimen");
        nombres.add("Leonardo Lionel");
        nombres.add("Keke Lumar");
        nombres.add("Maurice Mamon");
        
        return nombres;
    }
    
    public ArrayList crearDni( ){
        ArrayList<Character> dnis = new ArrayList();
        ArrayList<Integer> dniCompleto= new ArrayList();
        
        dnis.add('1');
        dnis.add('2');
        dnis.add('3');
        dnis.add('4');
        dnis.add('5');
        dnis.add('6');
        dnis.add('7');
        dnis.add('8');
        dnis.add('9');
        dnis.add('0');
        
        
        return dniCompleto;
    }
    
    
    


}
