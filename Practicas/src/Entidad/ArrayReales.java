/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import Interfaces.Estadisticas;

/**
 *
 * @author Kroban
 * 
 */
public class ArrayReales implements Estadisticas{

    int minimo, maximo;
    
    @Override
    public double minimo() {
       return 5;
    }

    
    @Override
    public double maximo() {
       return 10;
    }

    
    @Override
    public double sumatorio() {
        double sumatorio = minimo + maximo;
        return sumatorio;
    }

    public ArrayReales() {
    }

    
}
