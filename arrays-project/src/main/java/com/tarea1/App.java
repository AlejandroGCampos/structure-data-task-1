package com.tarea1;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class App  {
    public static void main(String[] args) {
    	
    	// a) "Hola mundo!"
        System.out.println("Hola Mundirijillo desde Java");
        
        // b) Multiplicación de dos números 
        int num1 = 5;
        int num2 = 9;
        int resultado = num1 * num2;
        System.out.println("Rusultado:" + resultado);
        
        // c) Investigación sobre Arrays
        
        // 4.1 ¿Comó se debe declarar un arreglo en java?
        int[] numeros = new int [7];
        int[] valores = {1, 3, 6, 7, 5, 9};
        
        // 4.2 Metodos y utilidades principales para arreglos
        // c.1) ejemplo 1
        Arrays.sort(valores); //ordena e imprime los números en el array
        
        // c.2) ejemplo 2
        System.out.println(Arrays.toString(valores)); //Convierte el arreglo en un texto legible; sin Arrays.toString me daria la dirección en memoria
        
        // c.3) ejemplo 3
        int posicion = Arrays.binarySearch(valores, 5); //Sirve para poder ubicar una cifra en el arreglo
        if (posicion >= 0) {
        	System.out.println("El numero esta en la posicion: " + posicion);
        }else {
        	System.out.println("El numero no esta en el arreglo");
        }
        
        // c.4) ejemplo 4
        int[] Original = {1, 11, 111, 1111};
        int[] Copia = Arrays.copyOf(Original, Original.length); //sirve para copiar un arreglo (o parte de) a otro nuevo
        System.out.println(Arrays.toString(Copia));
        
        // c.5) ejemplo 5
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b)); //Sirve para comparar si dos arreglos son exactamente iguales
        
        // 4.3 ¿Comó se recorren los arreglos en java?
        //For tradicional (con indices)
        int[] valoresFT = {10, 20, 30, 40};
        for (int i = 0; i < valoresFT.length; i++) { //permite recorrer los valores hacia delante o atras, usando el contador i
        	System.out.println(valores[i]); // i=0 empieza en la primera posicion y con i<valoresFT.length recorre hasta el ultimo
        }
        
        //For-each
        int[] valoresFE = {10, 20, 30, 40};

        for (int numero : valoresFE) { //forma mas sencilla y limpia de recorrer los valores
            System.out.println(numero);
        }
        
        //Streams
        int[] valoresSt = {10, 20, 30, 40};
        Arrays.stream(valoresSt).forEach(valor -> { //forma mas moderna y usada al combinar operaciones como filtrar o mapear
            System.out.println(valor); //Arrays.stream(valoresSt) convierte el arreglo en un stream, con forEach recorre c/elemento
        });
        
        // 4.4 Diferencias entre arreglos y ArrayList en Java
        //Dif. con ejemplos
        //Tamanio fijo vs Dinamico
        // a) Arreglos/Arrays
        int[] numerosArrays = new int[5]; //El arreglo siempre tendra 5 espacios, si se quiere mas se debe crear uno nuevo
        
        // b) ArrayList
        ArrayList<Integer> numerosArrayList = new ArrayList<>();
        numerosArrayList.add(10);
        numerosArrayList.add(20);
        
        //Tipos primitivos vs clases envolventes
        int[] num = {1, 2, 3}; //Arreglos usan Primitivos (int, double, char, boolean)
        double[] valors = {2.5, 3.8, 10.1};
        
        ArrayList<Integer> numList = new ArrayList<>(); //ArrayList usa clase envolvente (Integer, Double, Character, Boolean)
        
        //Metodos disponibles
        //Array no posee muchos
        //Arrays.sort(arreglo22);
        //Arrays.equals(a, b);
        //arreglo22.length; //es atributo, no metodo
        
        //ArrayList tiene muchos metodos utiles
        //numeros.add(10);      <--  // agregar
        //numeros.remove(0);    <--  // eliminar por índice
        //numeros.get(0);       <--  // obtener elemento
        //numeros.set(0, 50);   <--  // modificar
        //numeros.size();        <-- // tamaño
        //numeros.contains(10);  <-- // buscar
        
        //Rendimiento
        //Arreglos son mas rapidos, menos consumo de memoria, acceso directo muy eficiente al ser estructuras mas simples
        //ArrayList un poco mas lento, consume mas memoria ya qu einternamente usa un arreglo que se redimensiona
        
        // Cuando usar cada uno?
        //Arreglos: -El tamaño no cambiara. -Necesita maximo rendimiento. -Trabajas con muchos datos primitivos. -Programacion mas basicos
        //ArrayList: -El tamaño cambiara. -Necesitar agregar o eliminar elementos. -quieres usar metodos practicos. -trabjas con colecciones dinamicas.
        
    }
}
