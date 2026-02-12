package Actividad_3;

//Permiten usar las clases Vector y ArrayList en el programa para no estar escribiendo toda las 
// veces el paquete completo java.util.Vector o java.util.ArrayList.
import java.util.Vector;
import java.util.ArrayList;

// Clase que maneja el registro bancario y las transacciones
public class RegistroBancario {

    // Vector usado para guardar el log de transacciones
    // Se usa Vector porque es synchronized (thread-safe)
    private Vector<String> logTransacciones;

    // Constructor: inicializa el registro
    public RegistroBancario() {
        logTransacciones = new Vector<>();
    }

    // Agrega 5 mensajes simulados al log
    public void cargarLogsIniciales() {
        logTransacciones.add("Depósito aprobado - Cuenta 1001");
        logTransacciones.add("Retiro aprobado - Cuenta 2045");
        logTransacciones.add("Transferencia realizada - Cuenta 3002");
        logTransacciones.add("Pago de servicio - Cuenta 7788");
        logTransacciones.add("Transacción rechazada - Fondos insuficientes");
    }

    // Devuelve el log (para que otro archivo lo use)
    public Vector<String> getLogTransacciones() {
        return logTransacciones;
    }

    /*
     Explicación importante:
     Vector tiene sus métodos synchronized.
     Eso hace que solo un hilo pueda usarlo a la vez.
     Es más lento que ArrayList, pero evita errores por concurrencia.
     Vector → es synchronized, seguro para hilos
     ArrayList → no es synchronized, pero es más rápido
    */

    // Compara el tiempo de insertar datos en Vector vs ArrayList
    public void compararTiempoInsercion() {

        int cantidad = 1_000_000;

        Vector<String> vector = new Vector<>();
        ArrayList<String> arrayList = new ArrayList<>();

        long inicioVector = System.nanoTime();
        for (int i = 0; i < cantidad; i++) {
            vector.add("TX-" + i);
        }
        long finVector = System.nanoTime();

        long inicioArray = System.nanoTime();
        for (int i = 0; i < cantidad; i++) {
            arrayList.add("TX-" + i);
        }
        long finArray = System.nanoTime();

        System.out.println("Vector (synchronized): "
                + (finVector - inicioVector) / 1_000_000 + " ms");

        System.out.println("ArrayList (no sync):  "
                + (finArray - inicioArray) / 1_000_000 + " ms");
    }
}
