package ccepeda.cs6;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Practica {


    public static void main(String[] args) {

        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.parse("2018-05-05");
        Date mifecha = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        System.out.println("Fecha "+ mifecha.toString());

        Impresora epson = new Impresora();
        epson.setFechaFabricacion(mifecha);
        epson.setModelo("Epson 2021");
        epson.setHojasDisponibles(100);
        epson.setTipoConexion("Wifi, Bluetooth");

        System.out.println(epson.toString());


    }
}

