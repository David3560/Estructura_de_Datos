package Actividad_8;

import java.util.LinkedList;
import java.util.Queue;

public class ColaAtencionCallCenter {

    public static void main(String[] args) {

        // 1) Queue es interfaz, por eso se instancia con LinkedList
        Queue<String> filaLlamadas = new LinkedList<>();

        // 2) Llegadas (enqueue): offer agrega al final de la cola
        registrarLlegada(filaLlamadas, "Camila R.");
        registrarLlegada(filaLlamadas, "Juan P.");
        registrarLlegada(filaLlamadas, "Laura M.");

        System.out.println("\n--- Estado de la fila ---");

        // 3) peek: mira quién sigue, pero no lo saca de la cola
        System.out.println("Siguiente en fila (peek): " + filaLlamadas.peek());

        System.out.println("\n--- Atención (FIFO) ---");

        // 4) poll: atiende (saca el primero). Si está vacía retorna null.
        atenderSiguiente(filaLlamadas);
        atenderSiguiente(filaLlamadas);

        System.out.println("\n--- Verificar quién queda ---");
        System.out.println("Siguiente en fila (peek): " + filaLlamadas.peek());

        System.out.println("\n--- Vaciar y probar cola vacía ---");

        // Atender hasta que se vacíe
        while (filaLlamadas.peek() != null) {
            atenderSiguiente(filaLlamadas);
        }

        // Intentar atender con la cola vacía (poll no explota)
        atenderSiguiente(filaLlamadas);

        /*
          5) Diferencia importante:
          - poll(): si la cola está vacía retorna null (más seguro).
          - remove(): si la cola está vacía lanza excepción (NoSuchElementException).
          Por eso en este ejercicio se usa poll para manejo de vacío.
        */
    }

    // Método pequeño para que el main quede limpio
    private static void registrarLlegada(Queue<String> filaLlamadas, String cliente) {
        System.out.println("Llega llamada de: " + cliente);
        filaLlamadas.offer(cliente); // offer agrega al final
    }

    // Atiende al primero en entrar (FIFO)
    private static void atenderSiguiente(Queue<String> filaLlamadas) {
        String atendido = filaLlamadas.poll(); // poll saca el primero

        if (atendido == null) {
            System.out.println("No hay llamadas pendientes (cola vacía).");
        } else {
            System.out.println("Atendiendo a: " + atendido);
        }
    }
}
