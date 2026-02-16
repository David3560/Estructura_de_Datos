package Actividad_7;

import java.util.EmptyStackException;
import java.util.Stack;

public class HistorialNavegadorDemo {

    public static void main(String[] args) {

        // Pila para guardar URLs (último que entra, primero que sale)
        Stack<String> pilaUrls = new Stack<>();

        // 2) Simulación de navegación (push)
        visitarSitio(pilaUrls, "https://universidadlibertadores.edu.co");
        visitarSitio(pilaUrls, "https://stackoverflow.com");
        visitarSitio(pilaUrls, "https://github.com");

        System.out.println("\n--- Estado actual ---");

        // 3) peek: muestra el último sitio visitado sin quitarlo de la pila
        if (!pilaUrls.empty()) {
            System.out.println("Página actual (peek): " + pilaUrls.peek());
        }

        System.out.println("\n--- Botón Atrás (pop) ---");

        // 4) pop: simula ir hacia atrás (recupera el último visitado)
        // Se valida con empty() para no fallar
        if (!pilaUrls.empty()) {
            String paginaRecuperada = pilaUrls.pop();
            System.out.println("Regresando desde: " + paginaRecuperada);
        }

        // Mostrar la página actual luego de un "atrás"
        if (!pilaUrls.empty()) {
            System.out.println("Ahora quedó en: " + pilaUrls.peek());
        }

        System.out.println("\n--- Vaciar toda la pila ---");

        // 5) Intentar hacer pop hasta vaciar la pila, de forma segura
        while (!pilaUrls.empty()) {
            System.out.println("Atrás -> " + pilaUrls.pop());
        }

        System.out.println("\n--- Prueba de robustez ---");

        // Aquí ya está vacía. Se muestra que se evita el error.
        if (pilaUrls.empty()) {
            System.out.println("No hay más páginas para regresar. La pila está vacía.");
        }

        // Opcional: demostración de la excepción (controlada con try-catch)
        // Esto sirve para mostrar que el estudiante entiende EmptyStackException.
        try {
            pilaUrls.pop(); // aquí falla porque ya está vacía
        } catch (EmptyStackException e) {
            System.out.println("Error controlado: no se puede hacer pop() en una pila vacía.");
        }
    }

    // Método simple para no repetir prints y push en main
    private static void visitarSitio(Stack<String> pilaUrls, String url) {
        System.out.println("Navegando a: " + url);
        pilaUrls.push(url); // push guarda la URL en la pila
    }
}
