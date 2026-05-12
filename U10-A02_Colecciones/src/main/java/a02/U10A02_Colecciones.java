

package a02;
import java.util.*;
public class U10A02_Colecciones {

     public static void main(String[] args) {
        Collection<String> listaNombres = new ArrayList<>();

        listaNombres.add("Carlos");
        listaNombres.add("Elena");
        listaNombres.add("Sofia");
        listaNombres.add("Lucas");
        System.out.println("Lista inicial: " + listaNombres);

        // comprueba si un elemento existe
        String buscar = "Elena";
        if (listaNombres.contains(buscar)) {
            System.out.println(buscar + " esta en la lista.");
        }

        // eliminar un elemento
        listaNombres.remove("Lucas");
        System.out.println("Lucas eliminado: " + listaNombres);

        // recorre la coleccion usando Iterator
        System.out.print("Recorrido con Iterator: ");
        Iterator<String> it = listaNombres.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // vaciar la colección
        listaNombres.clear();
        System.out.println("Esta vacia?: " + listaNombres.isEmpty());
    }
}