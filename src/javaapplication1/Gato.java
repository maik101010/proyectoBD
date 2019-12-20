package javaapplication1;

/**
 *
 * @author megarcia
 */
public class Gato implements Animal {

    @Override
    public void caminar() {
        System.out.println("El gato caminando");
    }
    
    public void dormir(){
        System.out.println("Gato duerme");
    }
    
}
