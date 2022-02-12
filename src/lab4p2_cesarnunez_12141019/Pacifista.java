
package lab4p2_cesarnunez_12141019;

public class Pacifista extends Aldeano{
    
    private double discursoPaz = 0;

    public Pacifista() {
        super();
    }

    public Pacifista(String nombre, String apellido, int edad, double ptsVida) {
        super(nombre, apellido, edad, ptsVida);
    }

    public double getDiscursoPaz() {
        return discursoPaz;
    }

    public void setDiscrsoPaz(int discrsoPaz) {
        this.discursoPaz = discrsoPaz;
    }

    @Override
    public String toString() {
        return super.toString() + ", (Pacifista): discrsoPaz=" + discursoPaz;
    }

    public void ataque(Aldeano aldeano) {
         aldeano.setPtsVida(aldeano.getPtsVida() - discursoPaz);
    }
    
}
