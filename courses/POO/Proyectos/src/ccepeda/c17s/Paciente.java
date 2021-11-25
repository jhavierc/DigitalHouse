package ccepeda.c17s;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws ClienteException{
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        fechaAlta = null;

        if (fechaInternacion.before(hoy)){
            this.fechaInternacion = fechaInternacion;
        } else {
            throw new ClienteException("ERROR: La fecha de internacion no puede ser superior a la fecha del sistema");
        }
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws ClienteException {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            throw new ClienteException("ERROR: La fecha e alta NO debe ser inferior a la fecha de ingreso");
    }


}
