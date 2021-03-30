package ada.TP.proyectos;

public class Conductor extends Persona implements Registrable {

    private String nroLicenciaConducir;


    public Conductor(String nombre, String direccion, String dni, String nroLicenciaConducir) {
        super(nombre, direccion, dni);
        this.nroLicenciaConducir = nroLicenciaConducir;
    }

    public Conductor() {
    }

    public String getNroLicenciaConducir() {
        return nroLicenciaConducir;
    }

    public void setNroLicenciaConducir(String nroLicenciaConducir) {
        this.nroLicenciaConducir = nroLicenciaConducir;
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
        String nombre= super.getNombre();
        String direccion= super.getDireccion();
        String dni = super.getDni();
        String nroLicenciaConducir = this.getNroLicenciaConducir();

        return "nombre: "+nombre+" direccion: "+direccion+ "dni "+dni+"nro licencia "+nroLicenciaConducir;
        }


}