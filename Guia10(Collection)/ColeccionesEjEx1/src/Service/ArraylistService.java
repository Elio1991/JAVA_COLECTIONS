/*
    Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
 y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
 introduzca el valor-99. Este valor no se guarda en el ArrayList. A continuación, el
 programa mostrará por pantalla el número de valores que se han leído, su suma y su
 media (promedio)
 */
package Service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class ArraylistService {

    Scanner leer = new Scanner(System.in);
    ArrayList<Integer> listaNumeros = new ArrayList();

    public void fabricaDeNumeros() {
        int num;
        do {
            System.out.println("Ingrese un numero entero (-99 para finalizar)");
            num = leer.nextInt();
            if (num == -99) break;
            
           listaNumeros.add(num);

        } while (true);

    }
    public void mostrarLista(){
        int suma = 0;
        for (Integer numero : listaNumeros) {
            System.out.print( "[" + numero + "]");
            suma += numero;
        }
        System.out.println("");
        System.out.println("La suma de los numero es: " + suma);
        System.out.println("El promedio es: " + ((double) suma / listaNumeros.size()));

}

}
