public class EstacionClimatica {

    public static void main(String[] args) {

        // Arreglo para guardar 24 temperaturas (24 horas)
        double[] temperaturas = new double[24];

        // Llenar el arreglo con valores aleatorios
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.random() * 40;
        }

        // Acceso directo a la hora 12 (mediodía)
        System.out.println(temperaturas[12]);

        // Prueba de acceso fuera del arreglo
        try {
            temperaturas[24] = 25;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No se puede acceder a esa posición. El arreglo es de tamaño fijo.");
        }
    }
}


// se podria capturar con un if - else para predecir que va a generar una excepcion para salir.
