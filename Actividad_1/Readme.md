# TAD Playlist (Interface Java)

Este proyecto define el contrato (TAD) de una Playlist para un reproductor de música tipo Spotify, usando **interfaces en Java**.

La idea principal es **definir el comportamiento lógico** de la “Lista de Reproducción Actual” sin implementar todavía cómo se guardará en memoria.

## Estructura del proyecto

- `Cancion.java`  
  Clase auxiliar que representa una canción con:
  - Título
  - Artista
  - Duración (segundos)
  - Año de lanzamiento

- `IPlaylist.java`  
  Interface que define el contrato de la Playlist.  
  Contiene solo firmas de métodos (sin implementación), como lo pide la guía.

- `Principal.java`  
  Clase de prueba mínima para crear una canción con datos reales y mostrar sus atributos en consola.

## Métodos del contrato (IPlaylist)

- `void agregarCancion(Cancion c);`
- `void eliminarCancion(String tituloCancion);`
- `Cancion reproducirSiguiente();`
- `void vaciarLista();`
- `int obtenerCantidadCanciones();`

## Requisitos

- Java 8 o superior
- Archivos guardados en UTF-8 (para soportar caracteres como `ñ` en nombres de variables)

## Cómo ejecutar

### Compilar
```bash
javac *.java
