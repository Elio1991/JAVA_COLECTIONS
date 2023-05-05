/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class NegocioService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarProducto(HashMap<String, Double> producto){
        System.out.println("¿Que producto desea agregar?");
        String prod = leer.next().toUpperCase();
        System.out.println("¿Que precio tiene?");
        Double valor = leer.nextDouble();
        
        producto.put(prod, valor);
        System.out.println("Producto agregado");
        System.out.println("###############################");
    }
    
    public void mostrarProductos(HashMap<String, Double> producto){
        
        System.out.println("Se mostraran todos los productos.");
        
        for (Map.Entry<String, Double> lista : producto.entrySet()) {
            String llave = lista.getKey();
            Double valor = lista.getValue();
            System.out.println("Producto: "+llave+", Valor: $"+valor);
        }
        System.out.println("###############################");
    }
    
    public void modificarPrecio(HashMap<String, Double> producto){
       
        System.out.println("¿Que producto desea actualizar?");
        String prod = leer.next().toUpperCase();
       
        
        if (producto.containsKey(prod)) {
             System.out.println("Ingrese el nuevo valor");
             Double valor = leer.nextDouble();
            producto.put(prod, valor);
            System.out.println("Producto modificado.");
            System.out.println("###############################");
        }else {
            System.out.println("El producto no existe.");
            System.out.println("###############################");
        }
        
    }
    
    public void eliminarProducto(HashMap<String, Double> producto){
        System.out.println("¿Que producto desea eliminar?");
        String prod = leer.next().toUpperCase();
        
        if (producto.containsKey(prod)) {
            producto.remove(prod);
            System.out.println("Producto eliminado.");
            System.out.println("###############################");
        }else {
            System.out.println("El producto no existe.");
            System.out.println("###############################");
        }
    
    }
}
