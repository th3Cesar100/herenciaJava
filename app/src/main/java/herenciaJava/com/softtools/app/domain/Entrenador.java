package herenciaJava.com.softtools.app.domain;

public class Entrenador extends SeleccionFutbol{

    private int idFederacion;
    private int idEntrenador;
    private static int contadorEntrenador;

    public Entrenador(){
        this.idEntrenador = ++Entrenador.contadorEntrenador;
    }

    public Entrenador(int idFederacion){
        this.idEntrenador = ++Entrenador.contadorEntrenador;
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, String nombre, String apellidos, int edad){
        super(nombre,apellidos,edad);
        this.idEntrenador = ++Entrenador.contadorEntrenador;
        this.idFederacion = idFederacion;
    }



    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador [idEntrenador=" + idEntrenador + ", idFederacion=" + idFederacion + 
        super.toString() + "]";
    }
    
    
}
