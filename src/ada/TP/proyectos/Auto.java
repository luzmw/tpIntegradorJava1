package ada.TP.proyectos;

public class Auto extends  Automotor{
    String tipoAuto;

    public Auto(Persona propietario, String tipoAuto) {
        super(propietario);
        this.tipoAuto = tipoAuto;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }
}
