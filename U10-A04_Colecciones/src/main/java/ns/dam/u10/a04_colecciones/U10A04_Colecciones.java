
package ns.dam.u10.a04_colecciones;

import java.util.*;

public class U10A04_Colecciones {

    public static void main(String[] args) {
        //crea la coleccion e inserta 100 numeros aleatorios
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(10) + 1);
        }

        // Mostrar la colección 
        System.out.println("Coleccion (100 elementos):");
        System.out.println(numeros);

        // Utiliza un Iterator para eliminar todos los 5
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            if (it.next() == 5) {
                it.remove(); // Elimina el elemento actual de la colección
            }
        }

        //La coleccion después de la eliminación
        System.out.println("\nColeccion no 5's:");
        System.out.println(numeros);
        System.out.println("\nNuevo tamanio de la coleccion: " + numeros.size());
    }
}
