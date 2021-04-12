package ada.TP.proyectos;

public abstract class Utilitaria {

    /*


    public static Boolean numeroValido(Double numero){
        return (numero>0);
    }

    public static Boolean palabraValido(String palabra) {
        return (!(palabra.trim().equals("")));
    }

    public static boolean validarString(String texto, int maximo) {
        return texto.length()<=maximo;
    }

    public static boolean esNumerico(String palabra) {
        Boolean resultado;
        try {
            Long.parseLong(palabra);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    public static boolean dniValido(String dni) {
        return ((dni.length()>6 && dni.length()<9) && esNumerico(dni));
    }

    public static boolean esFechaValidaHastaHoy(int anio, int mes,int dia) {
        if (esFechaValida(anio,mes,dia)) {
            return !LocalDate.of(anio,mes,dia).isAfter(LocalDate.now());
        }
        return false;
    }

    public static boolean esFechaValida(int anio, int mes,int dia){
        boolean esFechaValida = true;
        try{
            LocalDate.of(anio, mes, dia);
        }catch(DateTimeException e) {
            esFechaValida = false;
        }
        return esFechaValida;
    }
}
© 2021 GitHub, Inc.
     */
}
