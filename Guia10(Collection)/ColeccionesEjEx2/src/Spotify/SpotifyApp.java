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
package Spotify;

import Entidades.CantanteFamoso;
import Service.CantanteFamosoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class SpotifyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();
        CantanteFamosoService listServ = new CantanteFamosoService();
        int opcion = 0;
        listServ.crearCantantes(listaCantantes);
        do {

            System.out.println("MENU");
            System.out.println("#####################");
            System.out.println("1. Agregar un cantante mas ");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    listServ.agregarArtista(listaCantantes);
                    break;
                case 2:
                    listServ.mostrarArtistas(listaCantantes);
                    break;
                case 3:
                    listServ.eliminarArtista(listaCantantes);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                        ;
            }

        } while (opcion != 4);

        listServ.mostrarArtistas(listaCantantes);

    }

}
