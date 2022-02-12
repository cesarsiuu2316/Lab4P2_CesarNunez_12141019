package lab4p2_cesarnunez_12141019;

import java.util.Random;

public class Agronomo extends Aldeano{
    
    private Random rand = new Random();
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

    public double ataque(Aldeano aldeano) {
        int odds = 1 + rand.nextInt(100);
        if(odds <= 95){
            if(aldeano instanceof Normal){
                aldeano.setPtsVida(aldeano.getPtsVida() - (ptsAtaque * 1.1));
                return ptsAtaque * 1.1;
            }else if(aldeano instanceof Pacifista){
                aldeano.setPtsVida(aldeano.getPtsVida() - (ptsAtaque * 1.05));
                return ptsAtaque * 1.05;
            }else{
                aldeano.setPtsVida(aldeano.getPtsVida() - ptsAtaque);
                return ptsAtaque;
            }
        }else{
            return 0;
        }
    }
    
    
}
