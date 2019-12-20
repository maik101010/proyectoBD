package javaapplication1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author megarcia
 */
public class Pruebas {

    public static void main(String[] args) {
//        int numero1 = 10;
//        String numeroEntero = "2";
//        double numero2 = (int) numero1;
//        numero2 = Double.valueOf(numeroEntero);
//        System.out.println(numero2);

        Animal miAnimal = new Gato();
        miAnimal.caminar();
        
        Perro miAnimal2 = new Perro();
        miAnimal2.caminar();
        miAnimal2.ladrar();
        
        

        List<Persona1> listaPersona = new ArrayList<>();
        List<Persona1> listaPersona2 = new LinkedList<>();
        listaPersona.add(new Persona1(1, "alejandro", 21));
        listaPersona.add(new Persona1(2, "sara", 19));
        listaPersona.add(new Persona1(3, "michael", 16));
        listaPersona.add(new Persona1(5, "anderson", 23));

//        for (int i = 0; i < listaPersona.size(); i++) {
//            System.out.println(listaPersona.get(i).getNombre());
//        }
//        for (Persona1 persona1 : listaPersona) {
//            cargarFiltrosFor(persona1);
//        }
//        Predicate<Persona1> filtroEdad = persona -> {
//            return persona.getEdad()>18;
//        };
//        listaPersona.stream()
//                .filter(persona -> persona.getEdad()>18)
//                .filter(persona -> persona.getNombre().charAt(0)=='a')
//                .forEach(persona -> System.out.println(persona.getNombre()));
//        listaPersona.stream().filter(cargarFiltros()).forEach(persona -> System.out.println(persona.getNombre()));

//        Persona1 persona = new Persona1(1, "daniel");
//        Trabajador trabajador2 = new Trabajador(1, "sara", 5000);
////        Trabajador trabajador = (Trabajador) persona;
//        Persona1 persona2 = (Trabajador) trabajador2;
//        System.out.println(persona2);
    }

    private static void cargarFiltrosFor(Persona1 persona1) {
        if (persona1.getEdad() > 18 && persona1.getNombre().charAt(0) == 'a') {
            System.out.println(persona1.getNombre());
        }
    }

    private static Predicate<? super Persona1> cargarFiltros() {
        Predicate<Persona1> filtroLetraNombre = persona -> {
            return persona.getNombre().contains("a") && persona.getEdad() > 18;
        };
        return filtroLetraNombre;
    }

}

class Persona1 {

    public Persona1(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    private int id;

    private int edad;

    private String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona1{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}

class Trabajador extends Persona1 {

    int sueldo;

    public Trabajador(int id, String nombre, int edad, int sueldo) {
        super(id, nombre, edad);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "sueldo=" + sueldo + '}';
    }

}
