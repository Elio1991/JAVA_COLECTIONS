/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Service;
import Entidades.Pelicula;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class PeliculaService {


    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Pelicula> peliculas = new ArrayList<>();

    public void crearPelicula() {
        String respuesta;
        do {
            System.out.println("ingrese el titulo de la pelicula");
            String titulo = leer.next();
            System.out.println("ingrese el director de la pelicula");
            String director = leer.next();
            System.out.println("ingrese la duracion de la pelicula");
            Double duracion = leer.nextDouble();

            peliculas.add(new Pelicula(titulo, director, duracion));

            System.out.println("Desea crear otra pelicula? s/n");

            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void mostrarPeliculas() {
        //  for (Pelicula pelicula : peliculas) {
        //     System.out.println(pelicula);
        peliculas.forEach(System.out::println);
        //   }
    }
    public void mostrarMayorunaHora(){
        System.out.println("Peliculas de mas de una hora");
        for (Pelicula pelis: peliculas) {
            if (pelis.getDuracion() > 1) {
                System.out.println(pelis.toString());
            }
        }
        
    }
    public void MayoraMenor(){
        Comparator<Pelicula> pelisComparator = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                if(p1.getDuracion() > p2.getDuracion()){
                    return -1;
                } else if (p1.getDuracion() < p2.getDuracion() ){
                    return 1;

                }else return 0;
            }
        } ;
        peliculas.sort(pelisComparator);
        System.out.println("ordenado por duracion Mayor a menor");
        mostrarPeliculas();
    }

    public void MenorAMayor(){
        Comparator<Pelicula> pelisComparator = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                if(p1.getDuracion() < p2.getDuracion()){
                    return -1;
                } else if (p1.getDuracion() > p2.getDuracion() ){
                    return 1;

                }else return 0;
            }
        } ;
        /* public int compare(Pelicula p1, Pelicula p2) {
        return Double.compare(p2.getDuracionPelicula(), p1.getDuracionPelicula());*/
        peliculas.sort(pelisComparator);
        System.out.println("ordenado por duracion menor a mayor");
        mostrarPeliculas();
    }
    
    public void ordenarXTitulo(){
       /* Comparator<Pelicula> pelisComparator = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().toLowerCase().compareTo(p2.getTitulo().toLowerCase());
            }
        } ;
        
        peliculas.sort(pelisComparator);
        peliculas.sort((p1,p2)->(p1.getTitulo().toLowerCase().compareTo(p2.getTitulo().toLowerCase())*-1));
        multiplicado por (-1) invierto el orden!
        */
        peliculas.sort((p1,p2)->p1.getTitulo().toLowerCase().compareTo(p2.getTitulo().toLowerCase()));
        System.out.println("ordenado alfabeticamente por titulo");
        mostrarPeliculas();
    }
    public void ordenarXDirector(){
        Comparator<Pelicula> pelisComparator = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().toLowerCase().compareTo(p2.getDirector().toLowerCase());
            }
        } ;
       // Collections.sort(peliculas, pelisComparator);
        peliculas.sort(pelisComparator);
        System.out.println("ordenado alfabeticamente por director");
        mostrarPeliculas();
    }


}

