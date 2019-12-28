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
        int respuesta = 0;
        do {
            System.out.println("1- Insertar \n2- Listar \n3- Eliminar \n4- Actualizar \n5- salir");
            respuesta = scanner.nextInt();
            switch (respuesta) {
                case 1:
                    llamarInsertar(persona, scanner, controlador);
                    break;
                case 2:
                    listarInformacion(controlador);
                    break;
                case 3:
                    llamarEliminar(persona, scanner, controlador);
                    break;
                default:
                    llamarActualizar(persona, scanner, controlador);
                    break;
            }
        } while (respuesta != 5);
    }

    private static void llamarInsertar(Persona persona, Scanner scanner, PersonaControlador controlador) {
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
    }

    private static void listarInformacion(PersonaControlador controlador) {
        List<Persona> listaRetornada = controlador.listaPersonas();
        System.out.println("----------Lista de personas2-----------");
        for (Persona persona1 : listaRetornada) {
            System.out.println(persona1.getId() + "-" + persona1.getNombre());
        }
        System.out.println("----------------------------------------");
    }

    private static void llamarActualizar(Persona persona, Scanner scanner, PersonaControlador controlador) {
        System.out.println("Dijite el id: ");
        persona.setId(scanner.nextInt());
        System.out.println("Dijite el nombre: ");
        persona.setNombre(scanner.next());
        System.out.println("Dijite la edad: ");
        persona.setEdad(scanner.nextInt());
        int resultado = controlador.actualizarPersona(persona);
        if (resultado == 1) {
            System.out.println("Se actualizo la persona de mierda");
        } else {
            System.out.println("No se actualizo");
        }
    }

    private static void llamarEliminar(Persona persona, Scanner scanner, PersonaControlador controlador) {
        System.out.println("Dijite el id: ");
        persona.setId(scanner.nextInt());
        int resultado = controlador.eliminarPersona(persona.getId());
        if (resultado == 1) {
            System.out.println("Se elimino la persona");
        } else {
            System.out.println("No se realizo la operación");
        }
    }
}
