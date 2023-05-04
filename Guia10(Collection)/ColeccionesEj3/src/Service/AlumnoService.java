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
package Service;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumno() {
        ArrayList<Alumno> alum = new ArrayList<>();

        String opcion;

        do {
            ArrayList<Integer> not = new ArrayList<>();
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            System.out.println("Ingrese las tres notas");
            not.add(leer.nextInt());
            not.add(leer.nextInt());
            not.add(leer.nextInt());

            Alumno alumno = new Alumno(nombre, not);
            alum.add(alumno);

            System.out.println("Quiere continuar? s/n");
            opcion = leer.next();

        } while (!opcion.equalsIgnoreCase("n"));
        return alum;
    }
    public void MostrarAlumno(){
    for (Alumno elemento : crearAlumno()) {
            System.out.println(elemento.getNombre());
            System.out.println(elemento.getNotas().toString());
        }
    
    
    }
    /*Método notaFinal(): El usuario ingresa el nombre del alumno que 
    quiere calcular su nota final y se lo buleera en la lista de Alumnos.
    Si está en la lista, se llama al método. Dentro del método se usará
    la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/
    public double notaFinal(Alumno alumno) {
        // ArrayList<Integer> not = alumno.getNotas();
        double notTotal = 0;
        for (Integer elemento : alumno.getNotas()) {
            notTotal += elemento;
        }
        return notTotal / 3;
    }
}
