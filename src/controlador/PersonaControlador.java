package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Persona;

/**
 *
 * @author megarcia
 */
public class PersonaControlador {

    private Conexion conexion = new Conexion();
    private Persona persona;

    public List<Persona> listaPersonas() {
        List<Persona> listaPersona = new ArrayList<>();
        try {
            String script = "SELECT * FROM persona;";
            PreparedStatement preparedStatement = conexion.obtenerConexion().prepareStatement(script);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                persona = new Persona();
                persona.setId(resultSet.getInt("id"));
                persona.setNombre(resultSet.getString("nombre"));
                persona.setEdad(resultSet.getInt("edad"));
                listaPersona.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPersona;
    }

    public void personas() {
        try {
            String script = "SELECT * FROM persona;";
            PreparedStatement preparedStatement = conexion.obtenerConexion().prepareStatement(script);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                persona = new Persona();
                persona.setId(resultSet.getInt("id"));
                persona.setNombre(resultSet.getString("nombre"));
                persona.setEdad(resultSet.getInt("edad"));
                System.out.println(persona.toString());
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int insertarPersona(final Persona persona){
        String script = "INSERT INTO persona(id, nombre, edad) VALUES (?, ?, ?);";
        int resultado=0;
        try {
            PreparedStatement preparedStatement = conexion.obtenerConexion().prepareStatement(script);
            preparedStatement.setInt(1, persona.getId());
            preparedStatement.setString(2, persona.getNombre());
            preparedStatement.setInt(3, persona.getEdad());
            resultado = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

//    public static void main(String[] args) {
//        PersonaControlador controlador = new PersonaControlador();
//        List<Persona> listaRetornada = controlador.listaPersonas();
//        for (Persona persona : listaRetornada) {
//            System.out.println(persona.getNombre());
//        }
//    }

}
