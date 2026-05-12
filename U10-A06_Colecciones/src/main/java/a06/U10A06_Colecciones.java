
package a06;

import java.util.*;
public class U10A06_Colecciones {

    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            original.add(random.nextInt(100) + 1);
        }

        //Volcar en una tabla de tipo Integer[]
        Integer[] tabla = original.toArray(new Integer[0]);

        Arrays.sort(tabla);

        //Volcar la tabla ordenada en una nueva colección
        List<Integer> ordenada = new ArrayList<>(Arrays.asList(tabla));

        System.out.println("Coleccion : " + original);
        System.out.println("Coleccion Ordenada: " + ordenada);

        // Para ordenar de mayor a menor, usariamos Collections.reverseOrder()
        Arrays.sort(tabla, Collections.reverseOrder());
        System.out.println("Coleccion de mayor a menor: " + Arrays.asList(tabla));
    }
}
