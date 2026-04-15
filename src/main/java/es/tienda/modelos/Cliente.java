package es.tienda.modelos;

/**
 * Clase Cliente que hereda de Persona
 */
public class Cliente extends Persona {

    // Enum tipoCliente
    public enum TipoCliente {
        POTENCIAL,
        NUEVO,
        VIP,
        MOROSO
    }

    private TipoCliente tipoCliente;

    // Constructor vacío
    public Cliente() {
        super("", "", "");
    }

    // Constructor completo
    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        super(nombre, apellidos, dni);
        this.tipoCliente = tipoCliente;
    }

    // Getter y Setter
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    // Método de Alta
    public static Cliente alta(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        return new Cliente(nombre, apellidos, dni, tipoCliente);
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo de cliente: " + tipoCliente);
    }
}