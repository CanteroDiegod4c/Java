/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

/**
 *Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 
10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 

Las ponderaciones de cada nota son:
- Primer trabajo práctico evaluativo 10%
- Segundo trabajo práctico evaluativo 15%
- Primer Integrador 25%
- Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

@author Kroban
 */

public class Alumno {
    
    private double nota1, nota2, nota3, nota4;
    private double promedio;
    
    public double pond1 = 0.10;
    public double pond2 = 0.15;
    public double pond3 = 0.25;
    public double pond4 = 0.50;

    public Alumno(){
        
    }
    public Alumno(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1 * pond1;
        this.nota2 = nota2 * pond2;
        this.nota3 = nota3 * pond3;
        this.nota4 = nota4 * pond4;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public double calcPromedio(double nota1, double nota2, double nota3, double nota4){
        promedio = Math.round((nota1 + nota2 + nota3 + nota4) / 4);
        return promedio;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1 * pond1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2 * pond2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3 * pond3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4 * pond4;
    }
    
    
}
