    package Actividad_9;

import java.util.HashMap;
import java.util.Map;

public class ControlAlmacenHash {

    public static void main(String[] args) {

        // 1) Estructura tipo clave-valor
        // La clave será el SKU y el valor el nombre del artículo
        Map<String, String> registroBodega = new HashMap<>();

        // 2) Inserción de productos
        registroBodega.put("Z100", "Monitor LG");
        registroBodega.put("Z200", "Teclado Mecánico");
        registroBodega.put("Z300", "Mouse Logitech");

        System.out.println("Contenido inicial:");
        System.out.println(registroBodega);

        // 3) Colisión / actualización de valor con la misma clave
        // La clave no se repite, se reemplaza el valor
        registroBodega.put("Z100", "Monitor Samsung");

        System.out.println("\nDespués de actualizar la clave Z100:");
        System.out.println("Valor actual: " + registroBodega.get("Z100"));

        // 4) Verificación de unicidad de clave
        // No existen dos Z100, solo se actualiza el valor
        System.out.println("\nClaves actuales en el mapa:");
        System.out.println(registroBodega.keySet());

        // 5) Búsqueda rápida (sin recorrer todo)
        System.out.println("\nBúsqueda de un producto existente:");
        System.out.println("Z200 -> " + registroBodega.get("Z200"));

        System.out.println("\nBúsqueda de un producto inexistente:");
        System.out.println("Z999 -> " + registroBodega.get("Z999"));

        /*
          get() tiene acceso directo por clave.
          No necesita recorrer todo el mapa como en una lista.
          Su complejidad promedio es cercana a O(1).
        */
    }
}
