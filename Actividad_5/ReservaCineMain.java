package Actividad_5;

public class ReservaCineMain {

    public static void main(String[] args) {

        // Se crea la sala (ya queda inicializada en 0)
        SalaCineClase sala = new SalaCineClase();

        // Pruebas rápidas como en clase
        sala.reservarAsiento(2, 3);
        sala.reservarAsiento(2, 4);
        sala.reservarAsiento(5, 6);

        // Prueba de estado: intentar reservar el mismo
        sala.reservarAsiento(2, 3);

        // Buscar 2 asientos contiguos libres en una fila
        sala.buscarDosLibresSeguidos(2);

        // Mostrar el resultado final
        sala.imprimirMapa();
    }
}
