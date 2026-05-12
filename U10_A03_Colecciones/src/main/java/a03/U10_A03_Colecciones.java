
package a03;

import java.util.*;

public class U10_A03_Colecciones {

    public static void main(String[] args) {
        // primera colección con 20 numeros aleatorios
        List<Integer> listaConRepetidos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
          
            int numeroAleatorio = random.nextInt(10) + 1;
            listaConRepetidos.add(numeroAleatorio);
        }

        System.out.println("Lista (repetidos): " + listaConRepetidos);

        //segunda colección 
        List<Integer> listaSinRepetidos = new ArrayList<>();

        for (Integer num : listaConRepetidos) {
  
            if (!listaSinRepetidos.contains(num)) {
                listaSinRepetidos.add(num);
            }
        }
        System.out.println("Lista (no repetidos): " + listaSinRepetidos);
    }
}
