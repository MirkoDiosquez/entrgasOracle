package repaso.hashis;

public class Departamento extends Vivienda
{
    private int cantidad_ambientes ;
    static int precio= 50;

    public Departamento(String direccion, int codigo_postal, Duenio dueño, int cantidad_ambientes) {
        super(direccion, codigo_postal, dueño);
        this.cantidad_ambientes = cantidad_ambientes;
    }

    public int getCantidad_ambientes() {
        return cantidad_ambientes;
    }

    public void setCantidad_ambientes(int cantidad_ambientes) {
        this.cantidad_ambientes = cantidad_ambientes;
    }

    @Override
    int getPrecio()
    {
        return precio ;
    }

    public static void setPrecio(int precio) {
        Departamento.precio = precio;
    }

}
