package TiendaElectronica;

public class Multimedia extends Producto {
    private boolean bluetooht;

    public Multimedia(int stock, double precio, String nombre, boolean bluetooht) {
        super(stock, precio, nombre);
        this.bluetooht = bluetooht;
    }

    public boolean isBluetooht() {
        return bluetooht;
    }

    public void setBluetooht(boolean bluetooht) {
        this.bluetooht = bluetooht;
    }
}
