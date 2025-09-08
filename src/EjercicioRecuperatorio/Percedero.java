package EjercicioRecuperatorio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Percedero extends Producto {
    private LocalDate fecha_vencimiento;
    private int dias_afterFecha;

    // Constructor parametrizado

    public Percedero(int codigo, String nombre, String marca, String empresa, LocalDate fecha_envasado, int precio, LocalDate fecha_vencimiento, int dias_afterFecha) {
        super(codigo, nombre, marca, empresa, fecha_envasado, precio);
        this.fecha_vencimiento = fecha_vencimiento;
        this.dias_afterFecha= dias_afterFecha;
    }

    // Constructor por defecto

    public Percedero() {
        super();
        this.fecha_vencimiento = LocalDate.now();
        this.dias_afterFecha= 0;
    }

    // Getters y Setters

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getDias_afterFecha() {
        return dias_afterFecha;
    }

    public void setDias_afterFecha(int dias_afterFecha) {
        this.dias_afterFecha = dias_afterFecha;
    }

    // Punto 6
    public int prodVencido(Percedero pe)
    {
        LocalDate vencimiento = pe.getFecha_vencimiento();
        if ( vencimiento.isBefore(hoy) )
        {
            return -1 ;
        }
        else
        {
            return(int) ChronoUnit.DAYS.between(hoy, vencimiento) ;
        }
    }

    // Punto 9
    public boolean consumibleOno(Percedero pe)
    {
        LocalDate fechaFin = pe.fecha_vencimiento.plusDays(pe.getDias_afterFecha()) ;
        LocalDate hoy = LocalDate.now() ;
        if (hoy.isBefore(fechaFin))
        {
            System.out.println("El producto se puede consumir");
            return true ;
        }
        else
        {
            System.out.println("El producto no se puede consumir");
            return false ;
        }
    }

    public static void main(String[] args)
    {
        Percedero yogur = new Percedero(2, "Yogur", "Sancor", "Sancor SA", LocalDate.of(2025, 6, 30), 300, LocalDate.of(2025, 7, 10), 2);
        System.out.println("¿Es consumible el producto?: " + yogur.consumibleOno(yogur));
        System.out.println("¿Esta vencido el producto? " +yogur.prodVencido(yogur));
    }
}

