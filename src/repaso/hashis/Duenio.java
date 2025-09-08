package repaso.hashis;

public class Duenio
{
        private int dni ;
        private String nombre;
        private String apellido;

    public Duenio(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Duenio()
    {
        this.dni = 111 ;
        this.nombre ="Juan" ;
        this.apellido = "Perez" ;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

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

    public static void main(String[] args) {
        Duenio d1 = new Duenio(12345678, "Juan", "Pérez");
        Duenio d2 = new Duenio(23456789, "María", "García");
    }
}
