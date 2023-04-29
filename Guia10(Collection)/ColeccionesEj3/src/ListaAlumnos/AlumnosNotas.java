/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo buleera en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ListaAlumnos;

import Entidades.Alumno;
import Service.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class AlumnosNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AlumnoService aServ = new AlumnoService();
        ArrayList<Alumno> alumnos = aServ.crearAlumno();
        for (Alumno elemento : alumnos) {
            System.out.println(elemento.getNombre());
            System.out.println(elemento.getNotas().toString());
        }
        boolean esta = false;
        System.out.println("Ingrese el nombre del alumno que "
                + "desea conocer su promedio");
        String nombre = leer.next();
        for (Alumno elemento : alumnos) {
            if (nombre.equalsIgnoreCase(elemento.getNombre())) {
                System.out.println(aServ.notaFinal(elemento));
                esta = true;
            }
        }
        if (!esta) {
            System.out.println("El alumno no esta en la lista");
        }
    }
    
}
