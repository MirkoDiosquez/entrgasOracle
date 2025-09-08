package repaso.hashis;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.HashMap;

abstract class Vivienda
{
    private String direccion ;
    private int codigo_postal ;
    private Duenio duenio ;
    private HashMap<Integer,HashMap<Month,Consumo>> consumo ;

    public Vivienda(String direccion, int codigo_postal, Duenio duenio) {
        this.direccion = direccion;
        this.codigo_postal = codigo_postal;
        this.duenio = duenio;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    abstract int getPrecio();

    public void descuento(LocalDate fecha)
    {
        int anio = fecha.getYear() ;
        Month mes = fecha.getMonth() ;
        if(consumo.containsKey(anio) && consumo.get(anio).containsKey(mes))
        {
            if (consumo.get(anio).get(mes).getKilo() <= consumo.get(anio - 1).get(mes).getKilo() - (consumo.get(anio - 1).get(mes).getKilo() * 0.10)) {
                double aux = consumo.get(anio).get(mes).getPrecioFinal();
                aux = aux - (aux * 0.05) ;
                System.out.println("Felicitaciones , obtuviste un descuento del 5%");
            }
            else{
                System.out.println("La fecha no existe");
            }
        }
    }

    public double calcularSubtotalDeUnaFecha(LocalDate fecha)
    {
        int anio = fecha.getYear() ;
        Month mes = fecha.getMonth() ;
        if(consumo.containsKey(anio) && consumo.get(anio).containsKey(mes))
        {
            return consumo.get(anio).get(mes).getPrecioFinal() ;
        }
        return 0 ;
    }

    private void cargarCosto(LocalDate fecha , Consumo consu)
    {
        int anio = fecha.getYear() ;
        Month mes = fecha.getMonth() ;
        if(consumo.containsKey(anio))
        {
            if (consumo.get(anio).containsKey(mes))
            {
                System.out.println("La fecha ya esta cargada");
            }
            else
            {
                consumo.get(anio).put(mes,consu) ;
            }
        }
        else
        {
            HashMap<Month, Consumo> pepe = new HashMap<>() ;
            pepe.put(mes,consu) ;
            consumo.put(anio,pepe) ;
        }
    }


    public static void main(String[] args)
    {
        Duenio d1 = new Duenio(12345678, "Juan", "Pérez");
        Duenio d2 = new Duenio(23456789, "María", "García");

        Casa c1 = new Casa("Av. Siempre Viva 742", 1001, d1, 50, 120);
        Departamento dep1 = new Departamento("Calle Falsa 123", 1002, d2, 3);

        HashMap<Integer,HashMap<Month,Consumo>> ou = new HashMap<>() ;

        Consumo cons2023 = new Consumo(120, 5000);  // 120 kWh - $5000
        Consumo cons2024 = new Consumo(100, 4500);  // 100 kWh - $4500 (10% menos)

        // Fechas
        LocalDate fecha2023 = LocalDate.of(2023, Month.JANUARY, 1);
        LocalDate fecha2024 = LocalDate.of(2024, Month.JANUARY, 1);

        c1.descuento(fecha2023);




    }
}
