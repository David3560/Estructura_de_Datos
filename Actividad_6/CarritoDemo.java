package Actividad_6;

import java.util.ArrayList;
import java.util.List;

public class CarritoDemo {

    public static void main(String[] args) {

        // 2) Lista dinámica: aquí el carrito crece solo (no tiene tamaño fijo)
        List<ItemCatalogo> cesta = new ArrayList<>();

        // Productos de ejemplo
        ItemCatalogo p1 = new ItemCatalogo(10, "Camiseta negra", 45000);
        ItemCatalogo p2 = new ItemCatalogo(20, "Gorra urbana", 38000);
        ItemCatalogo p3 = new ItemCatalogo(10, "Camiseta negra (duplicado)", 45000);

        // 3 y 4) Agregar usando add(), pero antes validar con contains() para no duplicar
        agregarSinRepetir(cesta, p1);
        agregarSinRepetir(cesta, p2);
        agregarSinRepetir(cesta, p3); // este no debería entrar (mismo codigo que p1)

        System.out.println("\nCarrito actual:");
        System.out.println(cesta);

        // 5) Eliminar: ejemplo por objeto
        cesta.remove(p2);
        System.out.println("\nDespués de eliminar por objeto (p2):");
        System.out.println(cesta);

        // 5) Eliminar: ejemplo por índice (solo si hay algo en la lista)
        if (!cesta.isEmpty()) {
            cesta.remove(0);
        }
        System.out.println("\nDespués de eliminar por índice 0:");
        System.out.println(cesta);

        /*
          6) Teoría (capacidad vs tamaño):
          - Tamaño (size): cuántos elementos reales hay en el ArrayList.
          - Capacidad (capacity): cuántos elementos caben en el arreglo interno antes de crecer.

          Cuando el ArrayList se va llenando y llega a su capacidad (normalmente inicia con 10),
          internamente crea un arreglo más grande (muchas veces crece ~50%),
          copia los elementos al nuevo arreglo y sigue trabajando.

          Esa copia cuesta O(n) porque toca mover n elementos.
        */
    }

    // Método pequeño para no repetir el mismo if en main
    private static void agregarSinRepetir(List<ItemCatalogo> cesta, ItemCatalogo nuevo) {

        // contains() usa equals(); por eso equals() es obligatorio en ItemCatalogo
        if (!cesta.contains(nuevo)) {
            cesta.add(nuevo);
            System.out.println("Agregado: " + nuevo.getNombreItem());
        } else {
            System.out.println("No se agregó (duplicado por codigo): " + nuevo.getCodigo());
        }
    }
}
