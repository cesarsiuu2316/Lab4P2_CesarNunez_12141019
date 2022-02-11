package lab4p2_cesarnunez_12141019;

import java.util.ArrayList;


public class Familia {
    
    private String apellido;
    private ArrayList<Aldeano> aldeanos = new ArrayList();

    public Familia() {
    }

    public Familia(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "apellido=" + apellido + ", aldeanos=" + aldeanos;
    }
    
    
    
}
