package lab4p2_cesarnunez_12141019;

import java.util.Random;

public class Herrero extends Aldeano{
    
    private Random rand = new Random();
    private double ptsAtaque;
    
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

    public void setPtsAtaque(double ptsAtaque) throws Exception {
        if(ptsAtaque >= 200 && ptsAtaque <= 500){
                throw new Exception();
        }
        this.ptsAtaque = ptsAtaque;
    }

    @Override
    public String toString() {
        return super.toString() + ", (Herrero): ptsAtaque=" + ptsAtaque;
    }


    public double ataque(Aldeano aldeano) {
        int odds = 1 + rand.nextInt(10);
        if(odds != 1){
            if(aldeano instanceof Agronomo){
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
