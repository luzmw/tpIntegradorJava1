package ada.TP.proyectos;

import java.time.LocalDate;

public interface Registrable {
    void asignarDiaDeAlta();

    void asignarPatente();


    void agregarARegistro();

    String verDetalles();

    void modificarItem();

    default String verFechaDeAlta(){

        return "LocalDate";
    }


}
