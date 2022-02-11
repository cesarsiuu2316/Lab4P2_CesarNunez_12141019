
package lab4p2_cesarnunez_12141019;

public class Pacifista extends Aldeano{
    
    private double discrsoPaz = 0;

    public Pacifista() {
        super();
    }

    public Pacifista(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
    }

    public double getDiscrsoPaz() {
        return discrsoPaz;
    }

    public void setDiscrsoPaz(int discrsoPaz) {
        this.discrsoPaz = discrsoPaz;
    }

    @Override
    public String toString() {
        return super.toString() + ", (Pacifista): discrsoPaz=" + discrsoPaz;
    }

    @Override
    public void ataque(Aldeano aldeano) {
        
    }

    @Override
    public void ataque() {
        
    }
       
    
}
