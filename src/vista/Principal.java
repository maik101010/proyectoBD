package vista;

import controlador.PersonaControlador;
import java.util.List;
import java.util.Scanner;
import modelo.Persona;

/**
 *
 * @author megarcia
 */
public class Principal {

    public static void main(String[] args) {
        Persona persona = new Persona();
        PersonaControlador controlador = new PersonaControlador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- Insertar \n2- Listar");
        int respuesta = scanner.nextInt();
        if (respuesta == 1) {
            System.out.println("Dijite el id: ");
            persona.setId(scanner.nextInt());
            System.out.println("Dijite el nombre: ");
            persona.setNombre(scanner.next());
            System.out.println("Dijite la edad: ");
            persona.setEdad(scanner.nextInt());
            int resultado = controlador.insertarPersona(persona);
            if (resultado == 1) {
                System.out.println("Se registro la persona de mierda");
            } else {
                System.out.println("No se registro");
            }
        } else {
            List<Persona> listaRetornada = controlador.listaPersonas();
            for (Persona persona1 : listaRetornada) {
                System.out.println(persona1.getNombre());
            }
        }
    }
}
