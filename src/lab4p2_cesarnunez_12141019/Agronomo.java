package lab4p2_cesarnunez_12141019;

public class Agronomo extends Aldeano{
    
    private double ptsAtaque = 100;

    public Agronomo() {
        super();
    }

    public Agronomo(String nombre, String apellido, int edad, double ptsVida) {
        super(nombre, apellido, edad, ptsVida);
    }    

    public double getPtsAtaque() {
        return ptsAtaque;
    }

    public void setPtsAtaque(double ptsAtaque) {
        this.ptsAtaque = ptsAtaque;
    }

    @Override
    public String toString() {
        return super.toString() + ", (Agronomo): ptsAtaque=" + ptsAtaque;
    }

    @Override
    public void ataque(Aldeano aldeano) {
        
    }

    @Override
    public void ataque() {
        
    }
    
    
    
}
