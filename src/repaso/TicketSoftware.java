package repaso;

import java.time.LocalDate;
import java.util.ArrayList;

public class TicketSoftware extends Ticket
{
        private String software;
        private int intentos;
        private static int MAX_INTENTOS = 3;
        private boolean parcheAplicable;

    public TicketSoftware(String cliente, String descripcion, LocalDate fechaHoraCreacion, LocalDate fechaHoraFinalizacion, ArrayList<String> comentarios, EstadoTicket estado, String software, int intentos, boolean parcheAplicable) {
        super(cliente, descripcion, fechaHoraCreacion, fechaHoraFinalizacion, comentarios, estado);
        this.software = software;
        this.intentos = intentos;
        this.parcheAplicable = parcheAplicable;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public static int getMaxIntentos() {
        return MAX_INTENTOS;
    }

    public static void setMaxIntentos(int maxIntentos) {
        MAX_INTENTOS = maxIntentos;
    }

    public boolean isParcheAplicable() {
        return parcheAplicable;
    }

    public void setParcheAplicable(boolean parcheAplicable) {
        this.parcheAplicable = parcheAplicable;
    }
}
