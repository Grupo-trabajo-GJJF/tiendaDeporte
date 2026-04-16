package es.tienda.modelos;

/**
 * Clase que representa un artículo de la tienda
 */
public class Articulo {

    private String codigo;
    private String descripcion;
    private double precio;

    // Constructor vacío
    public Articulo() {

    }

    // Constructor parametrizado
    public Articulo(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método de Alta
    public static Articulo alta(String codigo, String descripcion, double precio) {
        return new Articulo(codigo, descripcion, precio);
    }

    // Método para visualizar los datos
    public void visualizarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio + "€");
    }

}