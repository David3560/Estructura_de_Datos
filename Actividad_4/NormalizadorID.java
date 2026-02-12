package Actividad_4;

public class NormalizadorID {

    public static void main(String[] args) {

        // 1) ID recibido con errores (espacios y formato)
        String idSucio = " User_123 ";

        // 2) Limpieza del ID usando métodos de String
        // trim -> quita espacios
        // toUpperCase -> convierte a mayúsculas
        // substring -> ejemplo de recorte (desde posición 0)
        String idLimpio = idSucio.trim().toUpperCase().substring(0);

        System.out.println("ID original: " + idSucio);
        System.out.println("ID limpio: " + idLimpio);

        // 3) Mostrar direcciones de memoria (demuestra inmutabilidad)
        // String crea objetos nuevos al modificarse
        System.out.println("Hash idSucio: " + System.identityHashCode(idSucio));
        System.out.println("Hash idLimpio: " + System.identityHashCode(idLimpio));

        // 4) Uso de StringBuilder para modificar eficientemente
        // StringBuilder cambia el mismo objeto en memoria
        StringBuilder constructor = new StringBuilder(idLimpio);

        // 5) Invertir el ID
        constructor.reverse();
        String idInvertido = constructor.toString();

        System.out.println("ID invertido: " + idInvertido);
    }
}
