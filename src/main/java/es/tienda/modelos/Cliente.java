package es.tienda.modelos;

public class Cliente extends Persona {
    private TipoCliente tipoCliente;
    private static int contadorClientes = 0;
    private int idCliente;

    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipo) {
        super(nombre, apellidos, dni);
        this.tipoCliente = tipo;
        this.idCliente = ++contadorClientes;
    }

    public Cliente(String nombre, String apellidos, String dni) {
        this(nombre, apellidos, dni, TipoCliente.NUEVO);
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== DATOS DEL CLIENTE ===");
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("Nombre: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("=========================");
    }

    public static Cliente darDeAlta(String nombre, String apellidos, String dni, TipoCliente... tipoCliente) {
        if (tipoCliente.length > 0 && tipoCliente[0] != null) {
            return new Cliente(nombre, apellidos, dni, tipoCliente[0]);
        } else {
            return new Cliente(nombre, apellidos, dni);
        }
    }

    public void actualizarTipoCliente(TipoCliente nuevoTipo) {
        this.tipoCliente = nuevoTipo;
        System.out.println("Cliente " + getNombre() + " " + getApellidos() +
                " actualizado a tipo: " + nuevoTipo);
    }

    @Override
    public String toString() {
        return String.format("Cliente{id=%d, nombre='%s %s', dni='%s', tipo=%s}",
                idCliente, getNombre(), getApellidos(), getDni(), tipoCliente);
    }
}