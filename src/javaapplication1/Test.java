package javaapplication1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author megarcia
 */
public class Test {

    public static void main(String[] args) {
        List<String> jediList = Arrays.asList("Yoda", "Luke", "Anakin", "Obi Wan", "Luke");
        jediList.stream()
                .skip(2)
                .filter(jedi -> jedi.startsWith("Lu"))
                .limit(1)
                .distinct()
                .map(String::length)
                .flatMap(jedi -> Stream.of(jedi))
                .peek(System.out::println)
                .collect(Collectors.toList());
        int[] enteros = new int[]{1, 2, 3, 4, 5};
        IntStream streamEnteros = Arrays.stream(enteros);

        System.out.println(streamEnteros.filter(e -> e > 3).sum());

        List<String> ciudades = Arrays.asList("Cali", "Bogota", "Cartagena", "Medellin");
        Predicate<String> ciudadParametro = parametro -> parametro.contains("C");
//Stream de ciudades cuya primera letra es C de Cali 
        ciudades.stream()
                .filter(ciudadParametro)
                .forEach(ciudad -> System.out.println(ciudad));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.stream().forEach(e -> System.out.println(e.toString()));

        List<String> palabras = Arrays.asList("Java", "Lambdas", "Stream", "API");
//Verifica si todas las palabras tienen un tamaño de 4  caracteres 
        boolean longitud = palabras.stream().allMatch(s -> s.length() >= 4);

//Verifica si existe la cadena “lambda” dentro del  Stream 
        boolean anymatch = palabras.stream()
                .anyMatch(s -> s.equalsIgnoreCase("lambda"));
        Optional<String> alguno = palabras.stream().findAny();
        System.out.println("alguno: " + alguno);
        List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 10);

        //Obtiene el posible número mayor par del Stream 
        Optional<Integer> opt = numeros.stream()
                .filter(x -> x % 2 == 0)
                .reduce(Integer::max);
        System.out.println(opt);
        Integer suma = numeros
                .stream()
                .reduce(0, (x, y) -> x + y);
//        
//        String hola = "hola";
//        System.out.println(hola.indexOf("o"));
//        
//        Persona persona = null;
//        Persona[] personasValidas;
//        Scanner sc = new Scanner(System.in);
//        int cantidadPersona = 0;
//        try {
//            System.out.println("Digite la cantidad de personas a ingresar: ");
//            cantidadPersona = sc.nextInt();
//        } catch (InputMismatchException ex) {
//            sc.next();
//            System.out.println("Por favor digite una cantidad valida: ");
//            cantidadPersona = sc.nextInt();
//        }
//        int contador = 0;
//        personasValidas = new Persona[cantidadPersona];
//        while (contador < cantidadPersona) {
//            persona = new Persona();
//            try {
//                System.out.println("Digite su edad: ");
//                persona.setEdad(sc.nextInt());
//            } catch (InputMismatchException ex) {
//                sc.next();
//                System.out.println("Por favor digite un dato númerico: ");
//                persona.setEdad(sc.nextInt());
//            }
//            if (persona.getEdad() > 18) {
//                System.out.println("Usted no puede ingresar");
//            } else {
//                persona.setId(contador + 1);
//                System.out.println("Digite su nombre: ");
//                persona.setName(sc.next());
//                System.out.println("Usted trae drogas? ");
//                persona.setTieneDrogas(sc.next().equalsIgnoreCase("si") ? true : false);
//                personasValidas[contador] = persona;
//                contador++;
//            }
//        }
//
//        for (Persona personasValida : personasValidas) {
//            System.out.println(personasValida);
//        }
//        try {
//            persona.getName();
//        } catch (NullPointerException ex) {
//            System.out.println("El objeto persona es nulo ");
//        }
//        persona = new Persona();
//        persona.setId(1);
//        System.out.println(persona.getId());
        /// seguir programando lo demás
//        if (persona != null) {
//            System.out.println(persona.getName());
//            System.out.println(persona.getId());
//        }
//        persona.setId(1);
//        try {
//            int numero1 = 10;
//            int numero2 = 3;
//            int total = numero1 / numero2;
//            String numeroTotal =null;
////            numeroTotal=null;
//            if (numeroTotal=="d") {
//                System.out.println("es igual a d");
//            }
//            System.out.println(total);
//            System.out.println(numeroTotal);
//        } catch (RuntimeException exception) {
//            System.out.println("No puede dividir por cero: " + exception.getMessage());
//            exception.printStackTrace();
//        }
    }
}

class Persona {

    private int id;
    private String name;
    private boolean tieneDrogas;
    private int edad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTieneDrogas() {
        return tieneDrogas;
    }

    public void setTieneDrogas(boolean tieneDrogas) {
        this.tieneDrogas = tieneDrogas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", name=" + name + ", tieneDrogas=" + tieneDrogas + ", edad=" + edad + '}';
    }
}
