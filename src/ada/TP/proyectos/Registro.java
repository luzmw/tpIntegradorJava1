package ada.TP.proyectos;

import java.util.ArrayList;
import java.util.List;

public class  Registro {
   private List<Automotor> automotores;
   private  String Seccional;

    public Registro(List<Automotor> automotores , String seccional) {

    }

    public void agregarAutomotores(){
        automotores.add(new Automotor())
    }

    public List<Automotor> getAutomotores() {
        return automotores;
    }

    public void setAutomotores(List<Automotor> automotores) {
        this.automotores = automotores;
    }

    public String getSeccional() {
        return Seccional;
    }

    public void setSeccional(String seccional) {
        Seccional = seccional;
    }
}
