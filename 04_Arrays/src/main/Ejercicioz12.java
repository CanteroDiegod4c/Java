package main;

import java.util.Scanner;
import utils.Utilidades;

public class Ejercicioz12 {

	/*
	 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
	 * a medida que el usuario las va ingresando, construya una “sopa de letras para
	 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
	 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
	 * vez concluida la ubicación de las palabras, rellene los espacios no
	 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
	 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
	 * investigar cómo se utilizan las siguientes funciones de Java substring(),
	 * Length() y Math.random().
	 */
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in).useDelimiter("\n");
		
		//5 Strings entre 3 y 5 caracteres.
		//"sopa de letras", tamaño 20x20
		//palabras en horizontal, fila aleatoria
		//Rellenar huecos vacios con numero aleatorio de 0 a 9
		//Mostrar matriz
		
		String[][] matriz = Utilidades.crearMatrizStrings(20, 20);
		String[] vectorPalabras = new String[5];
		

		//Ingresar palabras al vector de Strings
		vectorPalabras = ingresarPalabras(vectorPalabras, input);

		//Mostrar vector de palabras
		Utilidades.mostrarVectorString(vectorPalabras);
		
		matriz = insertarPalabras(matriz, vectorPalabras);
		
		rellenarMatriz(matriz);
		
		Utilidades.mostrarMatrizString(matriz);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Cerrar Scanner
		input.close();
	}
	
	//Funcion para ingresar palabras dentro de un vector, validando que sean entre 3 y 5 caracteres.
	public static String[] ingresarPalabras(String[] vectorPalabras, Scanner input) {
		int i = 0;
		
		
		while(true) {
				System.out.println("Ingrese una palabra, debe ser minimo 3 y maximo 5 caracteres");
				String palabra = input.nextLine();
				
				if(palabra.length() <= 5 && palabra.length() >= 3) {
					vectorPalabras[i] = palabra;
					i++;
				}else {
					System.out.println("Error, lo ingresado es incorrecto");
					
					continue;
				}
				
				if(i == vectorPalabras.length) {
					return vectorPalabras;
				}else {
				}
			
		}
	}
	
	//Insertar palabras en la matriz y rellenar espacios luego
	public static String[][] insertarPalabras(String[][] matriz, String[] palabras){
		
		int cont = 0;
		for(int i = 0; i < palabras.length ; i++) {
			int filaRandom = (int) (Math.random() * 19);
			int columnaRandom = (int) (Math.random() * 16);
			String palabra = palabras[i];
			
			for(int j = 0; j < palabra.length(); j++) {
				
				matriz[filaRandom][columnaRandom + 1] = palabras[cont].substring(j, (j+1));
				columnaRandom++;
			}
			cont++;
		}
		
		return matriz;
	}

	//Rellenar matriz con 0 
	public static void rellenarMatriz(String[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == null) {
					int numRando = (int) (Math.random() * 9) + 1;
					matriz[i][j] = String.valueOf(numRando);
				}
			}
		}
	}
}
