package repaso;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket
{
    protected String cliente ;
    protected String descripcion ;
    protected LocalDate fechaHoraCreacion ;
    protected LocalDate fechaHoraFinalizacion ;
    protected ArrayList<String> comentarios ;
    protected EstadoTicket estado ;

    public Ticket(String cliente, String descripcion, LocalDate fechaHoraCreacion, LocalDate fechaHoraFinalizacion, ArrayList<String> comentarios, EstadoTicket estado)
    {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraFinalizacion = fechaHoraFinalizacion;
        this.comentarios = comentarios;
        this.estado = estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(LocalDate fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public LocalDate getFechaHoraFinalizacion() {
        return fechaHoraFinalizacion;
    }

    public void setFechaHoraFinalizacion(LocalDate fechaHoraFinalizacion) {
        this.fechaHoraFinalizacion = fechaHoraFinalizacion;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public EstadoTicket getEstado() {
        return estado;
    }

    public void setEstado(EstadoTicket estado) {
        this.estado = estado;
    }

    public void cambiarEstado(EstadoTicket est)
    {
        this.estado = est ;
    }

    public void agregarComentarios(String comen)
    {
        comentarios.add(comen) ;
    }

}
