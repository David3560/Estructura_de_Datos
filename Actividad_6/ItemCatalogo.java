package Actividad_6;

/*
  Clase simple para representar un “producto” del catálogo.
  Se usan nombres diferentes (ItemCatalogo, codigo, nombreItem, precioUnitario)
  para que no quede igual al de todos.
*/
public class ItemCatalogo {

    private int codigo;
    private String nombreItem;
    private double precioUnitario;

    public ItemCatalogo(int codigo, String nombreItem, double precioUnitario) {
        this.codigo = codigo;
        this.nombreItem = nombreItem;
        this.precioUnitario = precioUnitario;
    }

    // Getters básicos (para poder leer los datos desde otras clases)
    public int getCodigo() {
        return codigo;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /*
      equals() es clave para que contains() funcione bien.
      Aquí se decide que dos productos son “iguales” si tienen el mismo codigo.
      Así se puede evitar duplicados por ID.
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;          // mismo objeto
        if (obj == null) return false;         // si es null, no es igual
        if (getClass() != obj.getClass()) return false;

        ItemCatalogo otro = (ItemCatalogo) obj;
        return this.codigo == otro.codigo;
    }

    // Solo para imprimir bonito en consola (ayuda a ver el carrito)
    @Override
    public String toString() {
        return "Item{codigo=" + codigo + ", nombre='" + nombreItem + "', precio=" + precioUnitario + "}";
    }
}
