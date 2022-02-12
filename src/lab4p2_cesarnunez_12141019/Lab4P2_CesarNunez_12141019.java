package lab4p2_cesarnunez_12141019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lab4P2_CesarNunez_12141019 {
    
    private static ArrayList<Familia> familias = new ArrayList();
    private static Familia montesco = new Familia("Montesco");
    private static Random rand = new Random();

    public static void main(String[] args) {
        
        Familia capuleto = new Familia("Capuleto");
        capuleto.getAldeanos().add(new Herrero("juan", "Capuleto", 25));
        capuleto.getAldeanos().add(new Agronomo("Pedro", "Capuleto", 40, 150));
        capuleto.getAldeanos().add(new Normal("Julieta", "Capuleto", 19, 100));
        familias.add(capuleto);
        
        Familia matute = new Familia("Matute");
        matute.getAldeanos().add(new Herrero("Esteban", "Matute", 21));
        matute.getAldeanos().add(new Agronomo("Marina", "Matute", 35, 200));
        matute.getAldeanos().add(new Normal("Pedro", "Matute", 24, 120));
        familias.add(matute);
        
        montesco.getAldeanos().add(new Herrero("Hernesto", "Montesco", 27));
        montesco.getAldeanos().add(new Agronomo("Pablo", "Montesco", 30, 150));
        montesco.getAldeanos().add(new SuperGranjero("Romeo", "Montesco", 22));
        
        while(true){
            switch(menu()){
                case 1:{
                    System.exit(0);
                    break;
                } // case
                
                case 2:{
                    familias.add(crearFamilia());
                    break;
                } // case
                
                case 3:{
                    crearAldeano();
                    break;
                } // case
                
                case 4:{
                    imprimirFamilias();
                    break;
                } // case
                
                case 5:{
                    String apellido = JOptionPane.showInputDialog("Ingrese el apellido de la familia:");
                    while(familias.size() > 1 && apellido.equalsIgnoreCase("Capuleto")){
                        apellido = JOptionPane.showInputDialog("Ingrese el apellido de la familia:");
                    }

                    Familia vsFamilia = new Familia();
                    for (Familia familia : familias) {
                        if(familia.getApellido().equalsIgnoreCase(apellido)){
                            vsFamilia = familia;
                        }
                    }
                    
                    pelear(vsFamilia);
                    break;
                } // case
                
            } // switch
        } // while        
    } // main
    
    public static int menu(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("***** MENU *****\n"
                + "1. Salir\n"
                + "2. Crear familia\n"
                + "3. Crear aldeano\n"
                + "4. Imprimir familias\n"
                + "5. Pelear\n"
                + "Ingrese una opción:"));
        return opcion;
    }
    
    public static Familia crearFamilia(){
        boolean unico = false;
        String apellido = "";
        while(unico == false){
            apellido = JOptionPane.showInputDialog("Ingrese el apellido de la familia:");
            unico = true;
            for (Familia familia : familias) {
                if(familia.getApellido().equalsIgnoreCase(apellido)){
                    unico = false;
                    JOptionPane.showMessageDialog(null, "Ya hay una familia con este apellido!");
                    break;
                }
            }
        }
        return new Familia(apellido);        
    }
    
    public static void crearAldeano(){
        int op = Integer.parseInt(JOptionPane.showInputDialog("1. Normal\n"
                + "2. Pacifista\n"
                + "3. Herrero\n"
                + "4. Agronomo\n"
                + "5. Explosivo\n"
                + "Ingrese el tipo de aldeano:"));
        
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String apellido = "";
        boolean existe = false;
        while(existe == false){
            apellido = JOptionPane.showInputDialog("Apellido:");
            for (Familia familia : familias) {
                if(familia.getApellido().equalsIgnoreCase(apellido)){
                    existe = true; 
                    break;
                }
            }
        }        

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
        Aldeano nuevo = new Aldeano();
        if(op == 1){
            double ptsVida = Integer.parseInt(JOptionPane.showInputDialog("Puntos de vida: "));
            nuevo = new Normal(nombre, apellido, edad, ptsVida);            
        }else if(op == 2){
            double ptsVida = Integer.parseInt(JOptionPane.showInputDialog("Puntos de vida: "));
            nuevo = new Pacifista(nombre, apellido, edad, ptsVida); 
        }else if(op == 3){
            double ptsAtaque = Integer.parseInt(JOptionPane.showInputDialog("Puntos de ataque (200-500): "));
            nuevo = new Herrero(nombre, apellido, edad);   
            while(true){
                try{
                    ((Herrero) nuevo).setPtsAtaque(ptsAtaque);
                    break;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Tiene que ser un número entre 200 y 500!");
                }
            }            
        }else if(op == 4){
            double ptsVida = Integer.parseInt(JOptionPane.showInputDialog("Puntos de vida: "));
            nuevo = new Agronomo(nombre, apellido, edad, ptsVida); 
        }else if(op == 5){
            double ptsVida = Integer.parseInt(JOptionPane.showInputDialog("Puntos de vida: "));
            nuevo = new Explosivo(nombre, apellido, edad, ptsVida); 
        }else{
            JOptionPane.showMessageDialog(null, "La opción que ingresó es incorrecta!");
        }
        
        for (Familia familia : familias) {
            if(familia.getApellido().equalsIgnoreCase(nuevo.getApellido())){
                familia.getAldeanos().add(nuevo);
            }
        }
    }
    
    public static void imprimirFamilias(){
        String s = "1) " +  montesco.toString() + "\n";
        int i = 2;
        for (Familia familia : familias) {
            s += i + ") " + familia.toString() + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
    public static void pelear(Familia vsFamilia){
        
        Collections.shuffle(montesco.getAldeanos());
        Collections.shuffle(vsFamilia.getAldeanos());
        Aldeano a = montesco.getAldeanos().get(0);       
        Aldeano b;
        
        if(a instanceof Explosivo){
            Collections.shuffle(montesco.getAldeanos());
            Collections.shuffle(vsFamilia.getAldeanos());
            int x = 1 + rand.nextInt(2);
            if(x == 1){
                b = montesco.getAldeanos().get(0);
            }else{
                b = vsFamilia.getAldeanos().get(0);
            }
            
            int turno = 0;
            while(a.getPtsVida() > 0 && b.getPtsVida() > 0){
                if(turno / 2 == 0){
                    double v = a.getPtsVida();
                    a.ataque(b);
                    turno++;
                }else{
                    b.ataque(a);
                    turno++;
                }
            }
            
            if(a.getPtsVida() > 0){
                
            }else{

            }   
                
        }else if(a instanceof SuperGranjero){

        }else{

        }
        
        if(montesco.getAldeanos().get(0).getPtsVida() > 0){
            
        }else{
            
        }   

                   
    }
    
} // clase
