package lab4p2_cesarnunez_12141019;

public class SuperGranjero extends Aldeano{
    
    private double ptsAtaque = 1000;

    public SuperGranjero() {
        super();
    }

    public SuperGranjero(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        super.setPtsVida(1000);
    }

    public double ataque(Aldeano aldeano) {
        if(aldeano instanceof Herrero){
            aldeano.setPtsVida(aldeano.getPtsVida() - (ptsAtaque * 1.1));
            return ptsAtaque * 1.1;
        }else if(aldeano instanceof Explosivo){
            aldeano.setPtsVida(aldeano.getPtsVida() - (ptsAtaque * 1.15));
            return ptsAtaque * 1.15;
        }else{
            aldeano.setPtsVida(aldeano.getPtsVida() - ptsAtaque);
            return ptsAtaque;
        }
    }    
}
