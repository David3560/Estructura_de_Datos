/**
 * Clase principal del programa.
 * Aquí solo se crean canciones para probar la estructura.
 */
public class Principal {

    public static void main(String[] args) {

        // Canción de ejemplo (datos reales)
        Cancion principal = new Cancion(
                "See You Again",
                "Wiz Khalifa",
                229,
                2015
        );

        // Mostrar información de la canción
        System.out.println("Título: " + principal.getTituloCancion());
        System.out.println("Artista: " + principal.getArtista());
        System.out.println("Duración (s): " + principal.getDuracionSegundos());
        System.out.println("Año: " + principal.getAñoLanzamiento());
    }
}
