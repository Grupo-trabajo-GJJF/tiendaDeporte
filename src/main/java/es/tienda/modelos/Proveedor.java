package es.tienda.modelos;

/**
 * Clase que representa a un proveedor de la tienda.
 * Hereda de Persona e incluye un tipo de proveedor.
 */
public class Proveedor extends Persona {

    private TipoProveedor tipoProveedor;

    /**
     * Constructor de la clase Proveedor.
     */
    public Proveedor(String nombre, String apellidos, String dni, TipoProveedor tipoProveedor) {
        super(nombre, apellidos, dni);
        this.tipoProveedor = tipoProveedor;
    }

    /**
     * Devuelve el tipo de proveedor.
     */
    public TipoProveedor getTipoProveedor() {
        return tipoProveedor;
    }

    /**
     * Modifica el tipo de proveedor.
     */
    public void setTipoProveedor(TipoProveedor tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    /**
     * Crea un nuevo proveedor.
     */
    public static Proveedor altaProveedor(String nombre, String apellidos, String dni, TipoProveedor tipo) {
        return new Proveedor(nombre, apellidos, dni, tipo);
    }

    /**
     * Muestra los datos del proveedor por consola.
     */
    @Override
    public void mostrarDatos() {
        System.out.println("PROVEEDOR:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo proveedor: " + tipoProveedor);
    }
}