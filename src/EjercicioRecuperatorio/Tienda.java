package EjercicioRecuperatorio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Tienda
{
    private ArrayList<Producto> productosTienda ;
    private ArrayList<Empresa> empresas ;
    public static LocalDate hoy = LocalDate.now() ;

    // Constructor parametrizado

    public Tienda(ArrayList<Producto> productosTienda, ArrayList<Empresa> empresas)
    {
        this.productosTienda = productosTienda;
        this.empresas = empresas;
    }

    // Constructor por defecto

    public Tienda()
    {
        this.productosTienda = new ArrayList<>() ;
        this.empresas = new ArrayList<>() ;
    }

    // Getters y Setters

    public ArrayList<Producto> getProductosTienda()
    {
        return productosTienda;
    }

    public void setProductosTienda(ArrayList<Producto> productosTienda)
    {
        this.productosTienda = productosTienda;
    }

    public ArrayList<Empresa> getEmpresas()
    {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    // Punto 2
    public void mostrarProductos()
    {
        for (Producto p : productosTienda)
        {
            if (p instanceof Percedero)
            {
                Percedero per = (Percedero) p;
                if ( per.getFecha_vencimiento().isBefore(hoy) )
                {
                    System.out.println("Producto vencido en la tienda: " +per.getNombre() + ", " + per.getMarca());
                }
            }
        }
    }


    // Punto 3
    public void regalosParaEmpresa(Empresa emp) {
        ArrayList<Producto> productosContados = new ArrayList<>();

        System.out.println("Regalos necesarios para la empresa " + emp.getNombre() + ":");

        for (Empleado emple : emp.getEmpleados())
        {
            for (Producto p : emple.getProductosRecibidos())
            {
                boolean yaContado = false;
                for (Producto pc : productosContados)
                {
                    if (pc.getNombre().equals(p.getNombre()) && pc.getMarca().equals(p.getMarca()))
                    {
                        yaContado = true;
                        break;
                    }
                }
                if (!yaContado)
                {
                    productosContados.add(p);
                    int cantidad = 0;

                    for (Empleado e : emp.getEmpleados())
                    {
                        for (Producto pr : e.getProductosRecibidos())
                        {
                            if (pr.getNombre().equals(p.getNombre()) && pr.getMarca().equals(p.getMarca()))
                            {
                                cantidad++;
                            }
                        }
                    }
                    System.out.println(p.getNombre() + " - " + p.getMarca() + ": " + cantidad + " unidades");
                }
            }
        }
    }

    // Punto 4
    public void empresaMasProductos()
    {
        Empresa eMayor = empresas.getFirst() ;
        for(Empresa e: empresas)
        {
            if( e.cantProductos() > eMayor.cantProductos() )
            {
                eMayor = e ;
            }
        }
        System.out.println("La empresa que mas prodcutos ofrece a la tienda es: " +eMayor.getNombre() );
    }

    // Punto 7
    public void beneficioReciclable()
    {
        int recic = 0 ;
        for (Producto p : productosTienda)
        {
            if (p instanceof NoPercedero)
            {
                NoPercedero no = (NoPercedero) p ;
                if ( no.isPaqueteReciclable() )
                {
                    recic += 1 ;
                }
            }
        }
        if (recic >= (productosTienda.size()*0.45) )
        {
            System.out.println("La tienda accede al beneficio");
        }
        else
        {
            System.out.println("La tienda no accede al beneficio");
        }
    }

    public void agregarProducto(Producto p)
    {
        productosTienda.add(p);
    }

    public void agregarEmpresa(Empresa e)
    {
        empresas.add(e);
    }

    public static void main(String[] args)
    {
        Percedero leche = new Percedero(101, "Leche Entera", "La Serenisima", "Lacteos SA", LocalDate.of(2025, 6, 15), 100, LocalDate.of(2025, 6, 20), 3);
        Percedero yogur = new Percedero(102, "Yogur Natural", "Danone", "Lacteos SA", LocalDate.of(2025, 6, 10), 80, LocalDate.of(2025, 6, 18), 2);

        NoPercedero arroz = new NoPercedero(201, "Arroz Largo Fino", "Gallo", "Cereal SA", LocalDate.of(2024, 1, 5), 90, 1, true);
        NoPercedero aceite = new NoPercedero(202, "Aceite de Girasol", "Cocinero", "Aceites SRL", LocalDate.of(2024, 3, 10), 250, 1, true);

        ArrayList<Producto> productos1 = new ArrayList<>();
        productos1.add(yogur);
        productos1.add(arroz);

        ArrayList<Producto> productos2 = new ArrayList<>();
        productos2.add(yogur);
        productos2.add(leche);

        ArrayList<Producto> productos3 = new ArrayList<>();
        productos3.add(arroz);
        productos3.add(aceite);

        Empleado emple1 = new Empleado("Lucía", "Gómez", LocalDate.of(1980, 5, 12), LocalDate.of(2020, 4, 1), 150000, productos1);
        Empleado emple2 = new Empleado("Carlos", "Martínez", LocalDate.of(1964, 3, 25), LocalDate.of(2018, 6, 15), 180000, productos1);
        Empleado emple3 = new Empleado("María", "Fernández", LocalDate.of(1990, 11, 10), LocalDate.of(2021, 1, 20), 120000, productos2);
        Empleado emple4 = new Empleado("Jorge", "López", LocalDate.of(1985, 7, 30), LocalDate.of(2019, 9, 5), 160000, productos3);


        Empresa empresa1 = new Empresa();
        Empresa empresa2 = new Empresa();

        empresa1.agregarProducto(leche);
        empresa1.agregarProducto(arroz);
        empresa1.agregarProducto(aceite);

        empresa2.agregarProducto(yogur);
        empresa2.agregarProducto(arroz);

        empresa1.agregarEmpleado(emple1);
        empresa1.agregarEmpleado(emple2);

        empresa2.agregarEmpleado(emple3);
        empresa2.agregarEmpleado(emple4);

        empresa1.setDomicilio("Oslo 1293");
        empresa2.setDomicilio("Oslo 1294");

        empresa1.setNombre("Empresa1");
        empresa2.setNombre("Empresa2");


        Tienda supermercado = new Tienda();

        supermercado.agregarProducto(leche);
        supermercado.agregarProducto(yogur);
        supermercado.agregarProducto(aceite);
        supermercado.agregarProducto(arroz);

        supermercado.agregarEmpresa(empresa1);
        supermercado.agregarEmpresa(empresa2);

        // Metodos
        System.out.println("-----------------------------");
        supermercado.mostrarProductos();
        System.out.println("-----------------------------");
        supermercado.empresaMasProductos();
        System.out.println("-----------------------------");
        supermercado.beneficioReciclable();
        System.out.println("-----------------------------");
        supermercado.regalosParaEmpresa(empresa1);
        System.out.println("-----------------------------");
        supermercado.regalosParaEmpresa(empresa2);

    }
}
