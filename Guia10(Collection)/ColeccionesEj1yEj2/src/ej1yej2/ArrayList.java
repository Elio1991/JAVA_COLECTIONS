/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ej1yej2;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
        java.util.ArrayList<String> razaPerro = new java.util.ArrayList<>();
        String opcion;
        do {
            System.out.println("Ingrese la raza del perro");
            razaPerro.add(leer.next());
            System.out.println("Quiere guardar otra raza?");
            System.out.println("Ingrese N para salir");
            opcion = leer.next();

        } while (!opcion.equalsIgnoreCase("n"));
        
        //for (int i = 0; i < razaPerro.size(); i++) {
            //System.out.println(razaPerro.get(i));
            
        //}
        
       /* for (String elemento : razaPerro) {
            elemento = elemento +"A";
            System.out.println(elemento);
        }*/
        
        System.out.println(razaPerro.toString());
        
        /* 2.Continuando el ejercicio anterior, después de mostrar los perros, al
        usuario se le pedirá un perro y se recorrerá la lista con un Iterator, 
        se buscará el perro en la lista. Si el perro está en la lista, se 
        eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
        y se mostrará la lista ordenada.*/
        
        Iterator <String> it = razaPerro.iterator();
        
        System.out.println("Ingrese la raza a buscar");
        String razaBus = leer.next();
        boolean esta = false;
        
        while (it.hasNext()) {
            
            //String aux = it.next(); / hacemos el siguiente para no definir aux
            
           // if (aux.equalsIgnoreCase(razaBus)) {
               // esta = true;
             //   it.remove();
                
            //}
            
            if (it.next().equalsIgnoreCase(razaBus)) {
                esta = true;
                it.remove();
            }
        }
        
        if (esta) {
            System.out.println("El perro se elimino");
            
        }else{
            System.out.println("El perro no existe");
        }
        System.out.println(razaPerro.toString());

    }

    
}
