package repaso.hashis;

public class Casa extends Vivienda
{
    private float metros_cubiertos ;
    private float metros_descubiertos ;
    static int precio= 100 ;

    public Casa(String direccion, int codigo_postal, Duenio dueño, float metros_descubiertos, float metros_cubiertos) {
        super(direccion, codigo_postal, dueño);
        this.metros_descubiertos = metros_descubiertos;
        this.metros_cubiertos = metros_cubiertos;
    }

    public float getMetros_cubiertos() {
        return metros_cubiertos;
    }

    public void setMetros_cubiertos(float metros_cubiertos) {
        this.metros_cubiertos = metros_cubiertos;
    }

    public float getMetros_descubiertos() {
        return metros_descubiertos;
    }

    public void setMetros_descubiertos(float metros_descubiertos) {
        this.metros_descubiertos = metros_descubiertos;
    }

    @Override
    int getPrecio()
    {
        return precio ;
    }

    public static void setPrecio(int precio) {
        Casa.precio = precio;
    }
}
