package ccepeda.c17s;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Paciente paciente = null;
        try {
            paciente = new Paciente("Juan", "Perez", "12345", parseDate("2022-11-05"));
        } catch (ClienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            paciente.darAlta(parseDate("2021-10-05"));
        } catch (ClienteException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e2) {
            System.out.println("ERROR: No se cuencontro inforamcion del paciente");
        }
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

}
