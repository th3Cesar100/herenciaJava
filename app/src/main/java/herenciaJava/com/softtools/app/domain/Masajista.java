package herenciaJava.com.softtools.app.domain;

public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private int aniosExperiencia;
    private int idMasajista;
    private static int contadorMasajista;

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

    
    
}
