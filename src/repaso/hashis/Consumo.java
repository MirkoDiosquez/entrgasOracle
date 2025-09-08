package repaso.hashis;

public class Consumo
{
    private int precio ;
    private int kilo ;

    public Consumo(int precio, int kilo) {
        this.precio = precio;
        this.kilo = kilo;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getPrecioFinal()
    {
        double precioFinal = precio * kilo ;
        return precioFinal ;
    }

}
