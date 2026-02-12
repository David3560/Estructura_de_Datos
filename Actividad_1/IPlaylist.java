/**
 * Interface que define qué puede hacer una playlist.
 * Aquí no se programa cómo funciona, solo qué operaciones tiene.
 */
public interface IPlaylist {

    // Agrega una canción a la lista
    void agregarCancion(Cancion c);

    // Elimina una canción usando su título
    void eliminarCancion(String tituloCancion);

    // Devuelve la siguiente canción a reproducir
    Cancion reproducirSiguiente();

    // Borra todas las canciones de la lista
    void vaciarLista();

    // Devuelve cuántas canciones hay en la lista
    int obtenerCantidadCanciones();
}
