package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Automotor {//tambien implemente registrable?
    private Persona propietario;
    private List<Conductor> conductoresAutorizados;
    private TipoDeUso tipoDeUso;
    private String patente;
    private LocalDate fechaDeAlta;

    public Automotor() {
    }

    public Automotor(Persona propietario) {
        this.propietario = propietario;
    }

    public Automotor(Persona propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso,
        String patente, LocalDate fechaDeAlta) {
        this.propietario = propietario;
        this.conductoresAutorizados = new ArrayList<>();
        this.tipoDeUso = tipoDeUso;
        this.patente = patente;
        this.fechaDeAlta = fechaDeAlta;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public List<Conductor> getConductoresAutorizados() {
        return conductoresAutorizados;
    }

    public void setConductoresAutorizados(List<Conductor> conductoresAutorizados) {
        this.conductoresAutorizados = conductoresAutorizados;
    }

    public TipoDeUso getTipoDeUso() {
        return tipoDeUso;
    }

    public void setTipoDeUsoUso(String tipoDeUsoUso) {
        this.tipoDeUso = tipoDeUso;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }


}
