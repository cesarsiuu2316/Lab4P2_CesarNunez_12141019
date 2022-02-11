package lab4p2_cesarnunez_12141019;

public class Normal extends Aldeano{
    
    private double ptsAtaque = 50;

    public Normal() {
        super();
    }

    public Normal(String nombre, String apellido, int edad, int ptsVida) {
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
        return super.toString() + ", (Normal): ptsAtaque=" + ptsAtaque;
    }

    @Override
    public void ataque(Aldeano aldeano) {
        
    }

    @Override
    public void ataque() {
        
    }
    
}
