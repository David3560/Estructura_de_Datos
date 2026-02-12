/**
 * Esta clase representa una canción.
 * Se usa como apoyo para trabajar con la playlist.
 */
public class Cancion {

    // Datos básicos de la canción
    private String tituloCancion;
    private String artista;
    private int duracionSegundos;
    private int añoLanzamiento;

    /**
     * Constructor que permite crear una canción con sus datos principales.
     */
    public Cancion(String tituloCancion, String artista, int duracionSegundos, int añoLanzamiento) {
        this.tituloCancion = tituloCancion;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
        this.añoLanzamiento = añoLanzamiento;
    }

    // Métodos para acceder y modificar los datos

    public String getTituloCancion() {
        return tituloCancion;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
}
