package EjercicioRecuperatorio;

import java.time.LocalDate;

public class NoPercedero extends Producto
{
    private int peso ;
    private boolean paqueteReciclable;

    // Constructor parametrizado

    public NoPercedero(int codigo, String nombre, String marca, String empresa, LocalDate fecha_envasado, int precio, int peso, boolean paqueteReciclable)
    {
        super(codigo,nombre,marca,empresa,fecha_envasado,precio);
        this.paqueteReciclable = paqueteReciclable ;
        this.peso = peso ;
    }

    // Constructor por defecto

    public NoPercedero()
    {
        this.paqueteReciclable = true;
        this.peso = 0 ;
    }

    // Getters y Setters

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isPaqueteReciclable() {
        return paqueteReciclable;
    }

    public void setPaqueteReciclable(boolean paqueteReciclable) {
        this.paqueteReciclable = paqueteReciclable;
    }

    public static void main(String[] args)
    {
        NoPercedero arroz = new NoPercedero(3, "Arroz", "Gallo", "Molinos SA", LocalDate.of(2024, 12, 10), 500, 1000, true);
    }
}
