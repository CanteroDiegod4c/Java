package utils;

import java.util.Scanner;

public final class Utilidades {
    
     //Funcion para crear arrays
    public static int[] crearVector(Scanner input){
        
        System.out.println("ingrese el tamaño del vector");
        
        while(true){
            
            try{
                
                int num= input.nextInt();

                 return new int[num];
            }catch(java.util.InputMismatchException e){
                System.out.println("ERROR, INGRESE UN NUMERO");
                input.nextLine();
                continue;
            }
        }
    }
    
    //Funcion para crear vector con tamaño ya definido.
    public static int[] crearVectorTamanoDefinido(int tamano){
        return new int[tamano];
    }
    
    //Funcion simple para llenar arrays
    public static void llenarVectorRandom(int[] vector){
        
       
        for(int i = 0; i < vector.length;i++){
            
          vector[i] = (int) (Math.random() * 10);
            }
         }
    
    //Funcion para mostrar vector
    public static void mostrarVector(int[] vector){
        for(int num : vector){
            System.out.print(num + "  ");
        }
        System.out.println(" ");
    }
    
    //Funcion para preguntarle al usuario por un numero
    public static int preguntarNum(Scanner input){
        while(true){
        	System.out.println("Ingrese un numero!");
            try{
                int num= input.nextInt();

                 return num;
            }catch(java.util.InputMismatchException e){
                System.out.println("ERROR, INGRESE UN NUMERO");
                input.nextLine();
            }
        }
        
    }
    
    //Funcion para ver si el array posee numeros repetidos y donde se encuentra.
    public static void revisarVector(int[] vector, int num){
        int contador = 0;
        
        for(int i = 0; i < vector.length; i++){
            if(vector[i] == num){
                contador += 1;
                System.out.println("El numero se encontro en el sector  " + i);
                System.out.println(" ");
            }
        }

        if(contador > 0){
            System.out.println("----------------------------------------------------------------");
            System.out.println("El numero se ha repetido un total de " + contador + " veces");
        }
    }
    
    //Funcion para pedir 2 valores de fila y columna.
    public static int[][] crearMatriz(int filas, int columnas){
        
        int[][] matriz = new int[filas][columnas];
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        
        return matriz;
    }
    
    //Crear matriz de String
    public static String[][] crearMatrizStrings(int filas, int columnas){
        
        String[][] matriz = new String[filas][columnas];
        
        return matriz;
    }
    
    //Funcion para mostrar cualquier tipo de matriz 2d
    public static void mostrarMatriz(int[][] matriz){
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println(" ");
        }
    }

    //Funcion para mostrar matriz transpuesta
    public static void mostrarTranspuesta(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[j][i] + " ");
            }
            
            System.out.println(" ");
        }
    }
    
    //Funcion para crear matriz transpuesta
    public static int[][] crear_transpuesta(int[][] matriz) {
        
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        int[][] matriz_trans = new int[columnas][filas];
        
        for(int i = 0; i < columnas; i++){
            for(int j = 0; j < filas; j++){
                
               matriz_trans[i][j] = matriz[j][i];
            }
        }
        
        return matriz_trans;
    }

    public static double[] crearVectorDouble(Scanner input) {
         
        System.out.println("ingrese el tamaño del vector");
        
        while(true){
            
            try{
                
                int num= input.nextInt();
                System.out.println("------------------------------------------");

                 return new double[num];
            }catch(java.util.InputMismatchException e){
                System.out.println("ERROR, INGRESE UN NUMERO");
                input.nextLine();
                continue;
            }
        }
        }

    public static double[] crearVectorDoubleDefinido(int tamano, Scanner input) {
        
        double[] vector = new double[tamano];
        
        for(int i = 0; i < vector.length; i++){
            
            switch(i){
               case 0 -> { 
                    System.out.println("Ingrese la nota del primer practico");
                    vector[i] = input.nextDouble();
                }
               case 1 -> {
                   System.out.println("Ingrese la nota del segundo practico");
                   vector[i] = input.nextDouble();
               }
               case 2 -> {
                   System.out.println("Ingrese la nota del primer integrador");
                   vector[i] = input.nextDouble();
               }
               case 3 -> {
                   System.out.println("Ingrese la nota del segundo integrador");
                   vector[i] = input.nextDouble();
            }
        }
            System.out.println("");
        }
        
        System.out.println("-------------------------------------------------");
        
        
        return vector;
        }

	public static void mostrarVectorString(String[] vectorPalabras) {
		for(String palabra : vectorPalabras) {
			System.out.print(palabra + ", ");
			System.out.println("");
		}
	}

	public static void mostrarMatrizString(String[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(" { ");
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(" (" + matriz[i][j] + ")");
			}
			System.out.println( );
        }
		
		System.out.print(" }");
		
		
	}
    
}
