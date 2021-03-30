package ada.TP.proyectos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class  Registro {
    private List<Registrable> automotores;
    private String seccional;
    //Lista de fechas de alta
    // fechas de cambio de propietario
    //alta de vehiculos con la nueva  patente?

    public Registro(List<Registrable> automotores, String seccional) {
        this.automotores = new ArrayList<>();
        this.seccional = seccional;
    }

    public Registro() {
    }

    public void agregarAutomotor(Registrable automotor) {
        List<Registrable> automotores = new ArrayList<>();
        automotores.add(automotor);
    }

    public List<Registrable> getAutomotores() {
        return automotores;
    }

    public void setAutomotores(List<Registrable> automotores) {
        this.automotores = automotores;
    }

    public String getSeccional() {
        return seccional;
    }

    public void setSeccional(String seccional) {
        seccional = seccional;
    }

    public void mostrarAutomotores() {
        for (Registrable automotor : automotores)
            System.out.println(automotor.verDetalles());
    }


   /* private static void mostrarPropietarios(List<Registro> registros) {
        List<String> props = new ArrayList<>();
        for (Registro reg : registros) {
            for (Automotor aut : reg.getAutomotores()) {
                if (aut instanceof Camion) {
                    props.add(aut.getPropietario().getNombre());
                }
            }
        }
        Collections.sort(props);
        System.out.println("Propietarios de Camiones de todas las seccionales: ");
        for (String prop : props) {
            System.out.println("Nombre: " + prop);
        }
       }
    */

    //TODO BORRAR METODO DE PRUEBA

    /* private void registrarMuchosAutomotores(){
         agregarAutomotores(new Auto());
         agregarAutomotores(new Auto());
         registro.agregarAutomotores(new Auto());
         registro.agregarAutomotores(new Auto());
         registro.agregarAutomotores(new Auto());
         registro.agregarAutomotores(new Camion());
         registro.agregarAutomotores(new Camion());
         registro.agregarAutomotores(new Camion());
         registro.agregarAutomotores(new Moto());
         registro.agregarAutomotores(new MotoElectrica());
         registro.agregarAutomotores(new Utilitario());
         registro. agregarAutomotores(new AutoElectrico());
         registro.agregarAutomotores(new Auto());

     }

     */
    //TODO falta mostrar nombre de seccional
    public String verElementosRegistrados() {
        String automotores = "";
        for (Registrable r : this.getAutomotores()) {
            automotores += r.verDetalles();

        }
        return automotores;
    }

    public  String listarPropietarios(){
       List<Registrable> registrados = new ArrayList<>();
       List<Camion> camiones = new ArrayList<>();
       List<String> propietarios = new ArrayList<>();

        for (Registrable aut :registrados){
            if (aut instanceof Camion){
                Camion c = (Camion) aut;
                camiones.add(c);

            }

        }
        for (Camion ca: camiones){
             propietarios.add(ca.getPropietario().getNombre());
        }
        Collections.sort(propietarios);
        for (String a :propietarios){
            System.out.println(a);}
        return "";
    }

    public String ListarAutos (List<Registrable> automotores){
       String autos ="";
        List<Registro> registros= new ArrayList<>();
        for (Registro r : registros){
            for (Registrable aut : automotores){
                if (aut instanceof Auto){
                    Auto una = (Auto) aut;
                    autos+= una.verDetalles();
                }
            }
        }return autos ;
    }

}
   /*public void modificarElementoRegistrado(){
        Registro registro= new Registro();
        List<Registrable> registrados = registro.getAutomotores();
        Registrable r = registrados.get(0);
        if (r.getClass().getSimpleName().equals("Propietario")){
            //modificar nombre y asignar patente
        }
        registrados.set(r, registrable)
    }

    */
