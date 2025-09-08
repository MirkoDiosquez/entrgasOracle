package EjercicioRecuperatorio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Empresa
{
    private ArrayList<Producto> productosFabricados ;//
    private String domicilio ;
    private String nombre ;
    private ArrayList<Empleado> empleados ;//
    public static LocalDate hoy = LocalDate.now() ;

    // Constructor parametrizado

    public Empresa(ArrayList<Producto> productosFabricados, String domicilio, String nombre, ArrayList<Empleado> empleados) {
        this.productosFabricados = productosFabricados;
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.empleados = empleados;
    }

    // Constructor por defecto
    
    public Empresa() {
        this.productosFabricados = new ArrayList<>();
        this.domicilio = "";
        this.nombre = "";
        this.empleados = new ArrayList<>();
    }

    // Getters y Setters

    public ArrayList<Producto> getProductosFabricados() {
        return productosFabricados;
    }

    public void setProductosFabricados(ArrayList<Producto> productosFabricados) {
        this.productosFabricados = productosFabricados;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int cantProductos()
    {
        return productosFabricados.size() ;
    }

    // Punto 5
    public void cantDinero(Empresa empre)
    {
        int aux = 0 ;
        for( Empleado e : empre.getEmpleados())
        {
            aux += e.getSalario() ;
        }
        System.out.println("La empresa " + empre.getNombre() + " necesita " + aux + " pesos para pagarle a todos los empleados");
    }

    // Punto 8
    public void aniosEnEmpresa (Empleado emple)
    {
        System.out.println("El empleado " +emple.getNombre() + " tiene " + ChronoUnit.YEARS.between(emple.getfEntrada(), hoy) +" años en la empresa");
    }

    // Punto 10
    public void empleadosMayores(Empresa empresa)
    {
        int aux = 0 ;
        for(Empleado e : empleados)
        {
            if (ChronoUnit.YEARS.between(e.getfNacimiento(), hoy) > 60) {
                aux += 1;
            }
        }
        if(aux == 0 )
        {
            System.out.println("La empresa " +empresa.getNombre() +" no tiene empleados mayores");
        }
        else
        {
            System.out.println("La empresa " +empresa.getNombre() +" tiene " + aux + " empleados mayores de 60 años en la empresa");
        }
    }

    public void agregarProducto(Producto p)
    {
        productosFabricados.add(p);
    }

    public void agregarEmpleado(Empleado empleado)
    {
        empleados.add(empleado);
    }

    public static void main(String[] args)
    {
        Percedero leche = new Percedero(101, "Leche Entera", "La Serenisima", "Lacteos SA", LocalDate.of(2025, 6, 15), 100, LocalDate.of(2025, 6, 20), 3);
        Percedero yogur = new Percedero(102, "Yogur Natural", "Danone", "Lacteos SA", LocalDate.of(2025, 6, 10), 80, LocalDate.of(2025, 6, 18), 2);

        NoPercedero arroz = new NoPercedero(201, "Arroz Largo Fino", "Gallo", "Cereal SA", LocalDate.of(2024, 1, 5), 90, 1, true);
        NoPercedero aceite = new NoPercedero(202, "Aceite de Girasol", "Cocinero", "Aceites SRL", LocalDate.of(2024, 3, 10), 250, 1, false);
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

        // Metodos
        System.out.println("-----------------------------");
        empresa1.cantDinero(empresa1);
        empresa2.cantDinero(empresa2) ;
        System.out.println("-----------------------------");
        empresa1.aniosEnEmpresa(emple1);
        empresa2.aniosEnEmpresa(emple3);
        System.out.println("-----------------------------");
        empresa1.empleadosMayores(empresa1);
        empresa2.empleadosMayores(empresa2);

    }
}
