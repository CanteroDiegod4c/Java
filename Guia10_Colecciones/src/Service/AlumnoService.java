/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class AlumnoService {
    
    Scanner input = new Scanner(System.in).useDelimiter( "\n" );
    
    public ArrayList<Alumno> cargarAlumno(){
        ArrayList<Alumno> alumnos = new ArrayList();
        
        for(int i = 0; i < 3; i++){
        Alumno alumno = new Alumno();
        ArrayList<Integer> notas = new ArrayList();

        System.out.println("Ingrese nombre de alumno");
        alumno.setNombre(input.nextLine());
        
        System.out.println("Ingresar notas del alumno");
        System.out.println("Nota 1");
        notas.add(input.nextInt());
        System.out.println("Nota 2");
        notas.add(input.nextInt());
        System.out.println("Nota 3");
        notas.add(input.nextInt());
        input.nextLine();
        
        alumno.setNotas(notas);
        alumnos.add(alumno);
                
    }
        return alumnos;
}
 
    public void notaFinal(ArrayList<Alumno> alumnos){

        System.out.println("Ingrese el nombre del alumno a buscar");
        String nombre = input.nextLine();
        
        for(Alumno alumno : alumnos){
            if(nombre.equalsIgnoreCase(alumno.getNombre())){
                Integer sum = 0;
                for(Integer notas : alumno.getNotas()){
                    sum = notas + sum;
                }
                sum = sum / 3;
                
                System.out.println("el promedio del alumno " + alumno.getNombre() + " Es de " + sum);
            }
        }

    }
}