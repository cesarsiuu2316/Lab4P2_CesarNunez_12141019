package lab4p2_cesarnunez_12141019;

public class Aldeano {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double ptsVida;

    public Aldeano() {
    }

    public Aldeano(String nombre, String apellido, int edad, double ptsVida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ptsVida = ptsVida;
    }
    
    public Aldeano(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPtsVida() {
        return ptsVida;
    }

    public void setPtsVida(double ptsVida) {
        this.ptsVida = ptsVida;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", ptsVida=" + ptsVida;
    }
    
    public void ataque(Aldeano aldeano){
    }    
    
    public void ataque(){   
    }    
        
}
