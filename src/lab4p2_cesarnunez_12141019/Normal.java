package lab4p2_cesarnunez_12141019;

public class Normal extends Aldeano{
    
    private double ptsAtaque = 50;

    public Normal() {
        super();
    }

    public Normal(String nombre, String apellido, int edad, double ptsVida) {
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

    public void ataque(Aldeano aldeano) {
        if(aldeano instanceof Pacifista){
            aldeano.setPtsVida(aldeano.getPtsVida() - (ptsAtaque * 1.05));
        }else{
            aldeano.setPtsVida(aldeano.getPtsVida() - ptsAtaque);
        }
    }
    
}
