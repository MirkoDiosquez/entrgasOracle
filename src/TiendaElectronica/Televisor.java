package TiendaElectronica;

public class Televisor extends Multimedia
{
    private Tecnologia resolucion;

    public Televisor(int stock, double precio, String nombre, boolean bluetooht, Tecnologia resolucion) {
        super(stock, precio, nombre, bluetooht);
        this.resolucion = resolucion;
    }

    public Tecnologia getResolucion() {
        return resolucion;
    }

    public void setResolucion(Tecnologia resolucion) {
        this.resolucion = resolucion;
    }
}