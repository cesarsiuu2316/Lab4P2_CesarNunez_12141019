package lab4p2_cesarnunez_12141019;

public class Herrero extends Aldeano{
    
    private double ptsAtaque = 100;
    
    public Herrero() {
        super();
    }

    public Herrero(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        super.setPtsVida(super.getPtsVida() * 1.5);
    }

    public double getPtsAtaque() {
        return ptsAtaque;
    }

    public void setPtsAtaque(int ptsAtaque) {
        this.ptsAtaque = ptsAtaque;
    }

    @Override
    public String toString() {
        return super.toString() + ", (Herrero): ptsAtaque=" + ptsAtaque;
    }

    
    
}
