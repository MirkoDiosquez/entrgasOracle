package EjercicioRecuperatorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado
{
    private String nombre ;
    private String apellido ;
    private LocalDate fNacimiento ;
    private LocalDate fEntrada ;
    private float salario ;
    private ArrayList<Producto> productosRecibidos ;

    // Constructor parametrizado

    public Empleado(String nombre, String apellido, LocalDate fNacimiento, LocalDate fEntrada, float salario, ArrayList<Producto> productosRecibidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.fEntrada = fEntrada;
        this.salario = salario;
        this.productosRecibidos = productosRecibidos;
    }

    // Constructor por defecto

    public Empleado() {
        this.apellido = "";
        this.nombre = "";
        this.fNacimiento = LocalDate.now();
        this.fEntrada = LocalDate.now();
        this.salario = 0;
        this.productosRecibidos = new ArrayList<>();
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public LocalDate getfEntrada() {
        return fEntrada;
    }

    public void setfEntrada(LocalDate fEntrada) {
        this.fEntrada = fEntrada;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public ArrayList<Producto> getProductosRecibidos() {
        return productosRecibidos;
    }

    public void setProductosRecibidos(ArrayList<Producto> productosRecibidos) {
        this.productosRecibidos = productosRecibidos;
    }

    public static void main(String[] args)
    {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new NoPercedero(4, "Fideos", "Don Vicente", "Pasta SA", LocalDate.of(2025, 3, 10), 700, 500, true));
        Empleado emple = new Empleado("Lucía", "Gómez", LocalDate.of(1980, 5, 12), LocalDate.of(2020, 4, 1), 150000, new ArrayList<Producto>());
    }
}
