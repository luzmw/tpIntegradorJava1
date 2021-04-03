package ada.TP.proyectos;

public interface Registrable {

    void asignarDiaDeAlta();

    void asignarLicencia();
    
    void asignarPatente();
    //argumento un hasset de patentes (para que no se repita)
   /* patentes asignadas con random
   string patente = utilitaria.getstring (indique patente )
   if validar patente(patente)
   patentes.add(patente
   else édir de nuevo)
   pone rpatente en do while
   validar si se agrego
   if patente.contains (patente ) joya
   sino add

   ALEATORIO DE PATENTES
   int patente aleatoria= (int)math.floor(math.random*100)
   o
   random.nextint(1000)
    */

    void agregarARegistro();

     String  verDetalles();

     //void modificarRegistro();

}
