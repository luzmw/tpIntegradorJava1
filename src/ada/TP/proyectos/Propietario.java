package ada.TP.proyectos;

public class Propietario extends Persona implements Registrable {
    private String licPropiedad;


    public Propietario(String nombre, String direccion, String dni, String licPropiedad) {
        super(nombre, direccion, dni);
        this.licPropiedad = licPropiedad;
    }

    public Propietario() {
    }

    public String getLicPropiedad() {
        return licPropiedad;
    }

    public void setLicPropiedad(String licPropiedad) {
        this.licPropiedad = licPropiedad;
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
        String nombre = super.getNombre();
        String dni= super.getDni();
        String direccion = super.getDireccion();
        String licpropiedad= this.getLicPropiedad();
        return "datos del propietario: nombre "+nombre+ "  dni  "+dni+" direccion " +direccion+ "nro de lic propietaria"+licpropiedad;
    }
}
