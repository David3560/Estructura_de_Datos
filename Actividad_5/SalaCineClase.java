package Actividad_5;

public class SalaCineClase {

    // Matriz fija: 8 filas y 10 asientos
    // 0 = libre, 1 = ocupado
    private int[][] asientos = new int[8][10];

    // Constructor: deja todo en 0
    public SalaCineClase() {
        cargarSalaEnCeros();
    }

    // 2) Recorre la matriz completa y pone 0 en cada puesto
    private void cargarSalaEnCeros() {
        for (int fila = 0; fila < asientos.length; fila++) {
            for (int col = 0; col < asientos[fila].length; col++) {
                asientos[fila][col] = 0;
            }
        }
    }

    // 3) Reserva un asiento si la posición existe y está libre
    public void reservarAsiento(int fila, int col) {

        // Validación de límites para no salirse de la matriz
        if (fila < 0 || fila >= asientos.length || col < 0 || col >= asientos[0].length) {
            System.out.println("Fuera de rango. Fila: 0-7, Col: 0-9");
            return;
        }

        // Revisa si ya está ocupado
        if (asientos[fila][col] == 1) {
            System.out.println("No se puede. Asiento ocupado en [" + fila + "," + col + "]");
            return;
        }

        // Si está libre, lo marca como ocupado
        asientos[fila][col] = 1;
        System.out.println("Reserva lista en [" + fila + "," + col + "]");
    }

    // 4) Busca si hay 2 asientos libres seguidos en una fila (dos ceros)
    public boolean buscarDosLibresSeguidos(int fila) {

        // Validación básica de fila
        if (fila < 0 || fila >= asientos.length) {
            System.out.println("Fila fuera de rango. Use 0-7");
            return false;
        }

        // Recorre columnas (hasta la penúltima) buscando 0 y 0
        for (int col = 0; col < asientos[fila].length - 1; col++) {
            if (asientos[fila][col] == 0 && asientos[fila][col + 1] == 0) {
                System.out.println("2 libres seguidos en fila " + fila +
                        ": columnas " + col + " y " + (col + 1));
                return true;
            }
        }

        System.out.println("No hay 2 asientos seguidos libres en la fila " + fila);
        return false;
    }

    // 5) Imprime la sala en consola, una fila por línea
    public void imprimirMapa() {
        System.out.println("\nMapa (0 libre / 1 ocupado):");

        for (int fila = 0; fila < asientos.length; fila++) {
            for (int col = 0; col < asientos[fila].length; col++) {
                System.out.print(asientos[fila][col] + " ");
            }
            System.out.println(); // salto al final de cada fila
        }
    }
}
