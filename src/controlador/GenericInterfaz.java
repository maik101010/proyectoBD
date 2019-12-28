package controlador;

import java.util.List;
import modelo.Persona;

/**
 *
 * @author megarcia
 */
public interface GenericInterfaz {
    List<Persona> listar();
    int insertar(Object objeto);
    int eliminar(int id);
    int actualizar(Object objeto);
}