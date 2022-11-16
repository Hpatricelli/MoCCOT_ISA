package ar.edu.undef.fie.moccot_isa.models.request;

import ar.edu.undef.fie.moccot_isa.models.entities.PelotonAtanGpoApySecTir;
import ar.edu.undef.fie.moccot_isa.models.entities.Personal;

import java.util.ArrayList;
import java.util.List;

public class PelotonAtanGpoApySecTirRequest {
    private String nombre;
    private List<Personal> personal;
    private Integer cantidadMaximaDePersonas;

    public PelotonAtanGpoApySecTirRequest(){}

    public PelotonAtanGpoApySecTirRequest(String nombre, List<Personal> personal, Integer cantidadMaximaDePersonas) {
        this.nombre = nombre;
        this.personal = personal;
        this.cantidadMaximaDePersonas = cantidadMaximaDePersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    public Integer getCantidadMaximaDePersonas() {
        return cantidadMaximaDePersonas;
    }

    public void setCantidadMaximaDePersonas(Integer cantidadMaximaDePersonas) {
        this.cantidadMaximaDePersonas = cantidadMaximaDePersonas;
    }

    public PelotonAtanGpoApySecTirRequest(String nombre) {
        this.nombre = nombre;

        this.setCantidadMaximaDePersonas(6);
        List<Personal> listPerPelAtan = new ArrayList<>();

        var apuntAtan1 = new Personal( "Apuntador de Arma Antitanque 1");
        var auxAtan1 = new Personal( "Auxiliar Atan 1");
        var auxAtan2 = new Personal( "Auxiliar Atan 2");
        listPerPelAtan.add(apuntAtan1);
        listPerPelAtan.add(auxAtan1);
        listPerPelAtan.add(auxAtan2);

        var apuntAtan2 = new Personal( "Apuntador de Arma Antitanque 2");
        var auxAtan3 = new Personal( "Auxiliar Atan 3");
        var auxAtan4 = new Personal( "Auxiliar Atan 4");
        listPerPelAtan.add(apuntAtan2);
        listPerPelAtan.add(auxAtan3);
        listPerPelAtan.add(auxAtan4);
        this.setPersonal(listPerPelAtan);
    }
    public PelotonAtanGpoApySecTir toEntitie(){
        return new PelotonAtanGpoApySecTir("Peloton Atan");
    }
}
