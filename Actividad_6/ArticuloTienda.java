package Actividad_6;

public class ArticuloTienda {

    // Datos básicos del artículo
    private int codigo;
    private String descripcion;
    private double valor;

    public ArticuloTienda(int codigo, String descripcion, double valor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    // Getters y setters (básicos)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}