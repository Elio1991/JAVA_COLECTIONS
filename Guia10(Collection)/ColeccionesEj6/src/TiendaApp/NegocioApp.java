/*
* Se necesita una aplicación para una tienda en la cual queremos almacenar los
* distintos  productos que venderemos y el precio que tendrán. Además, se 
* necesita que la  aplicación cuente con las funciones básicas.  
    Estas las realizaremos en el servicio. Como, introducir un elemento,
* modificar su precio,  eliminar un producto y mostrar los productos que
* tenemos con su precio (Utilizar  Hashmap). El HashMap tendrá de llave el
* nombre del producto y de valor el precio.  Realizar un menú para lograr
* todas las acciones previamente mencionadas.
 */
package TiendaApp;

import Service.NegocioService;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class NegocioApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Double> producto = new HashMap();
        NegocioService servicio = new NegocioService();
        int opciones = 0;
        
        producto.put("Arroz", 300.0);
        producto.put("Fideo", 250.0);
        
        
        do {
            System.out.println("MENU");
            
            
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            opciones = leer.nextInt();
            
            
            switch (opciones) {
                case 1:
                    servicio.agregarProducto(producto);
                    break;
                case 2:
                    servicio.modificarPrecio(producto);
                    break;
                case 3:
                    servicio.eliminarProducto(producto);
                    break;
                case 4:
                    servicio.mostrarProductos(producto);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
            
        } while (opciones != 5);
    }
    
}
