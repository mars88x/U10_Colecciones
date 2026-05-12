

package a05;

import java.util.*;

public class U10A05_Colecciones {
   public static void main(String[] args) {
        //colección con 100 números aleatorios
        List<Integer> principal = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            principal.add(random.nextInt(10) + 1);
        }

        // Mostrar la colección 
        System.out.println("Coleccion:");
        System.out.println(principal);

        // Crear otra colección vacía e inserta solo el número 5
        List<Integer> aEliminar = new ArrayList<>();
        aEliminar.add(5);

        principal.removeAll(aEliminar);

        System.out.println("\nColeccion despues de removeAll (no 5's):");
        System.out.println(principal);
        System.out.println("\nNuevo tamaioo: " + principal.size());
    }
}
