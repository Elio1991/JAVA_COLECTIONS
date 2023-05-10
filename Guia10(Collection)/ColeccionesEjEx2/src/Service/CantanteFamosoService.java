/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
 tendrá como atributos el nombre y discoConMasVentas.
 Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
 objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
 cada cantante y su disco con más ventas por pantalla.
 Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
 agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
 usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
 cambios.
 */
package Service;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class CantanteFamosoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCantantes(ArrayList<CantanteFamoso> listaCantantes) {
        int cont = 0;
        do {
            CantanteFamoso artista = new CantanteFamoso();
            System.out.println("Ingrese el nombre del artista");
            artista.setNombre(leer.next().toUpperCase());
            System.out.println("Ingrese el disco con mas ventas");
            artista.setDiscoConMasVentas(leer.next().toUpperCase());
            listaCantantes.add(artista);
            cont++;

        } while (cont < 5);

    }

    public void mostrarArtistas(ArrayList<CantanteFamoso> listaCantantes) {
        for (CantanteFamoso artista : listaCantantes) {
            System.out.println(artista);
        }

    }

    public void agregarArtista(ArrayList<CantanteFamoso> listaCantantes) {
        CantanteFamoso artista = new CantanteFamoso();
        System.out.println("Ingrese el nombre del nuevo artista");
        artista.setNombre(leer.next().toUpperCase());
        System.out.println("Ingrese el disco con mas ventas");
        artista.setDiscoConMasVentas(leer.next().toUpperCase());
        listaCantantes.add(artista);
    }

    public void eliminarArtista(ArrayList<CantanteFamoso> listaCantantes) {
        Iterator<CantanteFamoso> it = listaCantantes.iterator();
        String eliminar;
        boolean band = false;
        System.out.println("Ingrese el Artista que desea eliminar");
        eliminar = leer.next();

        while (it.hasNext()) {
            CantanteFamoso artista = it.next();
            if (artista.getNombre().equalsIgnoreCase(eliminar)) {
                it.remove();
                band = true;
            }
        }
        if(band){
            System.out.println("El artista se eliminó de la lista");
        }else {
            System.out.println("No hay ningún artista con ese nombre en la lista");
        }
    }

}
