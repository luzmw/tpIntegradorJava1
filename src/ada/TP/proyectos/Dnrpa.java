package ada.TP.proyectos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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





    /*

    public void listarAutomotoresPorDominio(String dominio){
        SortedMap<String,Automotor> automotores = new TreeMap<>();
        //Utils_IO.imprimirSeparador();
        //System.out.println("CONSULTA DE AUTOMOTORES POR DOMINIO");
        for (Registro_Seccional r : registros){
            if (dominio=="") automotores.putAll(r.getAutomotores());
            else {
                if (r.existeDominio(dominio)) {
                    automotores.put(dominio,r.getAutomotor(dominio));
                    break;
                }
            }
        }
        if (automotores.size()>0) {
            if (automotores.size()==1)
                automotores.get(dominio).mostrarDatosConAutorizados();
            else{
                Automotor.mostrarDatosTablaEncabezado();
                automotores.forEach((patente, automotor) -> automotor.mostrarDatosTabla());
                Utils_IO.mostrarCantidadEncontrada(automotores.size());
            }
        } else Utils_IO.mostrarNoSeEncontraronDatos();
    }

     */


}
