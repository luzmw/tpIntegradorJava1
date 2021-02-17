package ada.TP.proyectos;

public class Moto extends Automotor  implements  VehiculoACombustion{
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
}