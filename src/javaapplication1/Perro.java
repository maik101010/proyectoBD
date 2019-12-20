package javaapplication1;

/**
 *
 * @author megarcia
 */
public class Perro implements Animal{

    @Override
    public void caminar() {
        System.out.println("El Perro caminando");
    }
    
    public void ladrar(){
        System.out.println("Perro ladra");
    }
            
}
