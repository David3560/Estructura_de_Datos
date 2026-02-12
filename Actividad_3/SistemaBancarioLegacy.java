package Actividad_3;
//crea la clase SistemaBancarioLegacy que es donde vive todo el programa dentro de una clase: sirve para arrancar el programa.
public class SistemaBancarioLegacy {

    //Indica a la JVM que el método main es el punto de entrada del programa o por donde empieza a ejecutarse...
    public static void main(String[] args) {

        // Se crea el registro bancario
        RegistroBancario registro = new RegistroBancario();

        // Se cargan los logs simulados
        registro.cargarLogsIniciales();

        // Se muestran los logs
        System.out.println("Logs del sistema bancario:");
        System.out.println(registro.getLogTransacciones());

        // Comparación de rendimiento
        registro.compararTiempoInsercion();
    }
}
