

package a01;

import java.util.Arrays;

public class U10A01_Colecciones {

  // metodo generico estatico
    public static <T> T[] guardar(T elemento, T[] tabla) {
        //copia con un espacio adicional al final
        T[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        
        //inserta el elemento en la ultima posicion
        nuevaTabla[nuevaTabla.length - 1] = elemento;
        return nuevaTabla;
    }
    public static void main(String[] args) {
        //prueba con Strings
        String[] nombres = {"ana", "jorge"};
        nombres = guardar("maria", nombres);
        nombres = guardar("juan", nombres);
        
        System.out.println("Tabla de Strings: " + Arrays.toString(nombres));

        //prueba con Integers
        Integer[] numeros = {10, 20};
        numeros = guardar(30, numeros);
        numeros = guardar(40, numeros);
        
        System.out.println("Tabla de Integers: " + Arrays.toString(numeros));
    }
}