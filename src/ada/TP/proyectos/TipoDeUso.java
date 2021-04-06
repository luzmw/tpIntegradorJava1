package ada.TP.proyectos;

public enum TipoDeUso {
    PROFESIONAL (1,"prof"),
    PARTICULAR (2,"part"),
    MIXTO (3,"m"),
    ;
    private  String abreviatura;
    private int codigo;


    TipoDeUso(int codigo, String abreviatura) {
        this.codigo = codigo;
        this.abreviatura = abreviatura;
    }

    TipoDeUso() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAbreviatura() {
        return abreviatura;
    }


    @Override
    public String toString() {
        return  "tipo de uso: "+ abreviatura+" código: "+codigo;
    }
}
