package lab4p2_cesarnunez_12141019;

public class Explosivo extends Aldeano{
    
    private double ptsAtaque = 250;

    public Explosivo() {
        super();
    }

    public Explosivo(String nombre, String apellido, int edad, double ptsVida) {
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
        return super.toString() + ", (Explosivo): ptsAtaque=" + ptsAtaque;
    }

    @Override
    public void ataque(Aldeano aldeano) {
        
    }

    @Override
    public void ataque() {
        
    }
    
    
        
}
