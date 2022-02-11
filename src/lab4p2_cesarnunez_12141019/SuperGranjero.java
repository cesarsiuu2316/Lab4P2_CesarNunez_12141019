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

    @Override
    public void ataque() {
        
    }   

    @Override
    public void ataque(Aldeano aldeano) {
        
    }
    
}
