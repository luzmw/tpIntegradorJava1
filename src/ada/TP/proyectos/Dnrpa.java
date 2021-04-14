package ada.TP.proyectos;

import java.util.ArrayList;
import java.util.List;

public class Dnrpa {
   private  List<Registro> registros;

    public Dnrpa(List<Registro> registros) {
       this.registros = registros;
    }

    public Dnrpa() {
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }



   public  String listarTodosLosAutos(){
    String autos = "";
      for (Registro registro: registros){
        for (Registrable aut : registro.getAutomotores()) {
            if (aut instanceof Auto) {
                Auto una = (Auto) aut;

                autos += aut.verDetalles();
            }
        }
    }
        return autos;
}

    /*
         public static Automotor buscarDominio(String dominio){
        Automotor automotor= null;
        for (Registro_Seccional r : registros){
            if (r.existeDominio(dominio)) {
                automotor = r.getAutomotor(dominio);
                break;
            }
        }
        return automotor;
    }
         */


}
