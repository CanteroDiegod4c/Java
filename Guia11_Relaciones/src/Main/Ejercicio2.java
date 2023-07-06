/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entidad.Baraja;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Ejercicio2 {
    public static void main(String[] args) {
            Baraja baraja = new Baraja();
    }
    
    public void barajar(Baraja cartas){
        Collections.shuffle((List<?>) cartas);
    }
}
