package lab4p2_cesarnunez_12141019;

import java.util.Random;

public class Explosivo extends Aldeano{

    private Random rand = new Random();
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

    public double ataque(Aldeano aldeano) {
        int odds = 1 + rand.nextInt(100);
        if(odds <= 85){
            if(aldeano instanceof Agronomo){
                aldeano.setPtsVida(aldeano.getPtsVida() - (ptsAtaque * 1.1));
                return ptsAtaque * 1.1;
            }else if(aldeano instanceof Herrero){
                aldeano.setPtsVida(aldeano.getPtsVida() - (ptsAtaque * 1.05));
                return ptsAtaque * 1.05;
            }else{
                aldeano.setPtsVida(aldeano.getPtsVida() - ptsAtaque);
                return ptsAtaque;
            }
        }
        else{
            return 0;
        }
    }
    
        
}
