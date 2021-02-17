package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class Automotor {
    private Persona propietario;
    private List<Conductor> conductoresAutorizados;
    private String uso; //profesional o particular
    private String patente;
    private LocalDate fechaDeAlta;

    public Automotor() {
    }

    public Automotor(Persona propietario) {
        this.propietario = propietario;
    }

    public Automotor(Persona propietario, List<Conductor> conductoresAutorizados, String uso,
                     String patente, LocalDate fechaDeAlta, String tipoMotor) {
        this.propietario = propietario;
        this.conductoresAutorizados = conductoresAutorizados;
        this.uso = uso;
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

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
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
