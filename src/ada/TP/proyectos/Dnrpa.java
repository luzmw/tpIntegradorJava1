package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dnrpa {

    public static void main(String[] args) {
        List<Registro> registrosSeccionales = new ArrayList<>();

        //crear lista de conductores
        List<Conductor> conductores = new ArrayList<>();

        //instanciar conductor
        Conductor unConductor = new Conductor();
        unConductor.setNombre("otroPepe");
        unConductor.setDireccion("cabildo 222");
        unConductor.setNroLicenciaConducir("ffd62365");
        unConductor.setDni("332563256");
        //agregar a lista conductores
        conductores.add(unConductor);

        unConductor.setNombre("pepe");
        unConductor.setDireccion("lujan 555");
        unConductor.setNroLicenciaConducir("afd5865");
        unConductor.setDni("27565369");
        //agregar a lista conductores
        conductores.add(unConductor);

        //instanciar persona propietario
        Persona propietario = new Persona();
        propietario = (Persona) unConductor;

        //propietario.setDni("27565369");
        //propietario.setNombre("pepe");
        //propietario.setDireccion("lujan 555");

        //crear lista de automotores
        List<Automotor> automotores = new ArrayList<>();

        //instanciar automotor
        Auto auto = new Auto();
        //setear propietario
        auto.setPropietario(propietario);
        //setear lista conductores
        auto.setConductoresAutorizados(conductores);
        auto.setCantidadPuertas(5);
        auto.setUso("profesional");
        auto.setFechaDeAlta(LocalDate.now());
        auto.setPatente("asd653");
        //agregar automotor a lista de automotores
        automotores.add(auto);

        //instanciar registro
        Registro registro = new Registro();
        //setear lista de automotores
        registro.setAutomotores(automotores);
        registro.setSeccional("carapachay");

        //agregar registro a lista registrosSeccionales
        registrosSeccionales.add(registro);

        mostrarPropietarios(registrosSeccionales);
        /*
        armar lista de propietarios (personas)
        recorrer for registors seccionales automotores
         */
        mostrarAutomotores();

        MotoElectrica me = new MotoElectrica();
        AutoElectrico ae = new AutoElectrico();


    }

    private static void mostrarAutomotores() {
    }

    private static void mostrarPropietarios(List<Registro> registros) {
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
}
