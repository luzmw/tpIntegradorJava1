package ada.TP.proyectos;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class Utilitaria {
    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        String texto = "";
        int numero = 0;
        boolean correcto = false;
        do{
            texto = sc.nextLine();
            try{
                numero = Integer.parseInt(texto);
                correcto = true;
            }catch (NumberFormatException e){
                System.out.print("Ingrese un número correcto: ");
            }
        }while(!correcto);
        return numero;
    }



    public static String getString(String mensaje) {
        String texto = "";
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        do{
            System.out.print(mensaje+": ");
            texto = sc.nextLine();
            if(texto.length()>0) correcto=true;
        }while(!correcto);
        return texto;
    }

    public static boolean validarString(String texto, int maximo) {
        return texto.length()<=maximo;
    }

    public  static boolean esDecimal(String dec) {
        try {
            Double.parseDouble(dec);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("numero incorrecto");
        }
        return false;
    }


     public static boolean validarDni(String dni) {
            if ((dni.length()>6 && dni.length()<9));
            return true;
    }

    public static boolean esFechaDeHoy(int anio, int mes,int dia) {
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

   /* public static boolean esPatenteVallida(String patente){
        patente= "";
    }

    */





    /*




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






}
     */
}
