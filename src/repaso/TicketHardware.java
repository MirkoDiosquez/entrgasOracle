package repaso;

import java.time.LocalDate;
import java.util.ArrayList;

public class TicketHardware extends Ticket
{
    private String dispositivo;

    public TicketHardware(String cliente, String descripcion, LocalDate fechaHoraCreacion, LocalDate fechaHoraFinalizacion, ArrayList<String> comentarios, EstadoTicket estado, String dispositivo) {
        super(cliente, descripcion, fechaHoraCreacion, fechaHoraFinalizacion, comentarios, estado);
        this.dispositivo = dispositivo;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }
}




