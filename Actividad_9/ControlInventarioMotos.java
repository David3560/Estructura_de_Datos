package Actividad_9;

import java.util.HashMap;
import java.util.Map;

public class ControlInventarioMotos {

    public static void main(String[] args) {

        // 1) Estructura clave-valor
        // La clave será el SKU de la moto y el valor el modelo
        Map<String, String> stockSuperBikes = new HashMap<>();

        // 2) Registro de motos en el sistema
        stockSuperBikes.put("SBK01", "Yamaha R1");
        stockSuperBikes.put("SBK02", "BMW S1000RR");
        stockSuperBikes.put("SBK03", "Kawasaki Ninja ZX-10R");

        System.out.println("Inventario inicial de motos:");
        System.out.println(stockSuperBikes);

        // 3) Actualización de una clave existente
        // Se reemplaza el modelo anterior con uno nuevo
        stockSuperBikes.put("SBK01", "Ducati Panigale V4");

        System.out.println("\nActualización del SKU SBK01:");
        System.out.println("Nuevo modelo asociado: " + stockSuperBikes.get("SBK01"));

        // 4) Verificación de unicidad de clave
        System.out.println("\nSKUs registrados en el sistema:");
        System.out.println(stockSuperBikes.keySet());

        // 5) Búsqueda rápida de motos
        System.out.println("\nConsulta de una moto existente:");
        System.out.println("SBK02 -> " + stockSuperBikes.get("SBK02"));

        System.out.println("\nConsulta de una moto que no existe:");
        System.out.println("SBK99 -> " + stockSuperBikes.get("SBK99"));

        /*
          get() accede directamente usando la clave (SKU).
          No recorre todo como una lista.
          Por eso su complejidad promedio es cercana a O(1).
        */
    }
}