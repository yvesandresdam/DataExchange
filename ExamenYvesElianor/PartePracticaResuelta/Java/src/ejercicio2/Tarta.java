package ejercicio2;


public class Tarta {
    private EstadoTarta estadoTarta;

    public Tarta(){
        estadoTarta = EstadoTarta.BIZCOCHO_SIN_HORNEAR;
    }
    public EstadoTarta getEstadoTarta(){
        return estadoTarta;
    }

    public void setEstadoTarta(EstadoTarta estadoTarta){
        this.estadoTarta = estadoTarta;
    }
}
