import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Integer id=0;
    static String nombre="";
    static Integer edad=0;
    static Integer calificacion=0;

    public static void main(String[] args) {

        try {
            System.out.println("Conexión establecida con MySQL");

            String sqlUpdate = "UPDATE estudiantes SET nombre="+nombre+", edad="+edad+", calificacion="+calificacion+" WHERE id="+id+"";
            String sqlDelete = "DELETE FROM estudiantes WHERE id="+id+"";

            //Crear estudiantes
            Estudiante estudiante = new Estudiante(6, "Pepe", 31, 10);
            crearEstudiante(estudiante);

            //Mostrar estudiantes
            List<Estudiante> estudiantes = mostrarEstudiantes();
            for(Estudiante e : estudiantes){
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection conexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String contraseña = "root";
        return DriverManager.getConnection(url, usuario, contraseña);

    }

    public static List<Estudiante> mostrarEstudiantes() throws SQLException {
        Connection conexion = conexion();
        Statement statement = conexion.createStatement();
        String sqlSelect = "SELECT * FROM estudiantes";
        ResultSet resultado = statement.executeQuery(sqlSelect);
        List<Estudiante> estudiantes = new ArrayList<>();

        while(resultado.next()){
            id = resultado.getInt("id");
            nombre = resultado.getNString("nombre");
            edad = resultado.getInt("edad");
            calificacion = resultado.getInt("calificacion");
            Estudiante estudiante= new Estudiante(id, nombre, edad, calificacion);
            estudiantes.add(estudiante);
        }
        resultado.close();
        statement.close();
        conexion.close();
        return estudiantes;
    }

    public static void crearEstudiante(Estudiante estudiante) throws SQLException {
        Connection conexion = conexion();
        String sqlCreate = "INSERT INTO estudiantes(id, nombre, edad, calificacion) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = conexion.prepareStatement(sqlCreate);

        statement.setInt(1, estudiante.getId());
        statement.setString(2, estudiante.getNombre());
        statement.setInt(3, estudiante.getEdad());
        statement.setInt(4, estudiante.getCalificacion());

    int result = statement.executeUpdate();
    if(result>0){
        System.out.println("Estudiante creado con exito.");
    }

    }
}