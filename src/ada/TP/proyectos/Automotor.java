package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Automotor implements Registrable {
    private Propietario propietario;
    private List<Conductor> conductoresAutorizados;
    private TipoDeUso tipoDeUso;
    private String patente;
    private LocalDate fechaDeAlta;

    public Automotor() {
    }

    public Automotor(Propietario propietario) {
        this.propietario = propietario;
    }

    public Automotor(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso,
        String patente, LocalDate fechaDeAlta) {
        this.propietario = propietario;
        this.conductoresAutorizados = new ArrayList<>();
        this.tipoDeUso = tipoDeUso;
        this.patente = patente;
        this.fechaDeAlta = fechaDeAlta;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
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

    @Override
    public void asignarDiaDeAlta() {

    }

    @Override
    public void asignarLicencia() {

    }

    @Override
    public void asignarPatente() {

    }

    @Override
    public void agregarARegistro() {

    }

    @Override
    public String verDetalles() {
        String Autorizados;
        String  tipoDeUso= this.tipoDeUso.toString();
        String patente;
        String fechaDeAlta;
        String propietario = this.getPropietario().verDetalles();

        return null;
    }
}
