package ada.TP.proyectos;

public class Moto extends Automotor  implements  VehiculoACombustion, Registrable{
    private String tipoMoto;

    public Moto() {
    }

    public Moto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    @Override
    public void indicarlitrosNafta() {

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
        String fechaAlta = super.getFechaDeAlta().toString();
        //patente
        String autorizados = "";
        String propietario= super.getPropietario().verDetalles();

        for(Conductor c :super.getConductoresAutorizados()){
            // c.verDetalles() // tenés que completar este método
            autorizados += c.getNroLicenciaConducir()+" "+c.verDetalles();
        }
        return "el auto tiene  " + " puertas, fecha: " + fechaAlta+ " - autorizados: " +propietario;

    }
}
