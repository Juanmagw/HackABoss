public class Estudiante {
    private Integer id;
    private String nombre;
    private Integer edad;
    private Integer calificacion;

    public Estudiante() {
    }

    public Estudiante(Integer id, String nombre, Integer edad, Integer calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Integer getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "El estudiante tiene id=" + id +" se llama " + nombre + " tiene " + edad +" años y una calificacion de " + calificacion + " puntos.";
    }
}
