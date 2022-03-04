package herenciaJava.com.softtools.app.domain;

public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private int aniosExperiencia;
    private int idMasajista;
    private static int contadorMasajista;

    public Masajista(){
        this.idMasajista = ++Masajista.contadorMasajista;
    }

    public Masajista(String titulacion, int aniosExperiencia){
        this.idMasajista = ++Masajista.contadorMasajista;
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;

    }

    public Masajista(String titulacion, int aniosExperiencia, String nombre, String apellidos, int edad){
        super(nombre,apellidos,edad);
        this.idMasajista = ++Masajista.contadorMasajista;
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;

    }

    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista [aniosExperiencia=" + aniosExperiencia + ", idMasajista=" + idMasajista + ", titulacion="
                + titulacion +
                super.toString() + "]";
    }

    
    
}
