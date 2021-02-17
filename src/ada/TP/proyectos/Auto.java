package ada.TP.proyectos;

public class Auto extends  Automotor implements VehiculoACombustion{
    Integer cantidadPuertas;

    public Auto() {
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
