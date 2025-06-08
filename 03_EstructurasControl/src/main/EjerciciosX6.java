package main;

import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.

 * @author kroban_d4c
 */
public class EjerciciosX6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int cantidad = ingresarCantidadPersonas(input);
        alturasPersonas(cantidad, input);
        
    }
    
    //Funcion para ingresar cantidad de personas
    public static int ingresarCantidadPersonas(Scanner input){
        
        int num;
        while(true){
            System.out.println("Ingrese el numero de personas a contar");
            
            
            try{
                
                num = input.nextInt();
                
                if(num > 0 ){
                break;
                }else{
                    System.out.println("Por favor ingrese un numero positivo");
                    System.out.println("------------------------------------------------------");
                }
            }catch(java.util.InputMismatchException e){
                System.out.println("ERROR, DEBE INGRESAR UN NUMERO");
                System.out.println("----------------------------------------------------");
                input.nextLine();
                continue;
            }
            
        }
        return num;
    }
    
    //Funcion para ir ingresando la altura de las personas
    public static void alturasPersonas(int num, Scanner input){
        
        int contador = 0;
        double promedio = 0;
        
        for(int i = 0; i < num; i++){
            
            while(true){
                System.out.println("Ingrese la altura de la persona en centimetros (ej, 190cm)");
                
                try{
                        int altura = input.nextInt();
                        
                        if(altura > 250 || altura < 100){
                            System.out.println("Altura invalida, ingrese una altura correcta");
                            continue;
                        }else if(altura <= 160){
                            contador+= 1;
                            promedio += altura;
                        }else{
                            promedio+= altura;
                        }

                        break;
                    
                }catch(java.util.InputMismatchException e){
                    System.out.println("ERROR, INGRESE UN NUMERO");
                    input.nextLine();
                }}
            }
        
        double promedioAlturas = promedio / num;
        promedioAlturas = Math.round(promedioAlturas * 100.0) / 100.0;
        
        System.out.println("El numero de personas por debajo de 1.60m fue " + contador);
        System.out.println("El promedio de alturas es " + promedioAlturas);
            
    }
}
