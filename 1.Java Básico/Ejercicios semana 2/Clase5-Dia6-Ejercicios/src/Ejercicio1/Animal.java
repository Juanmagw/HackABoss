package Ejercicio1;

public class Animal {
    private Integer id;
    private String nombre;
    private Integer edad;
    private String tipoPiel;
    private String tipoAlimentacion;

    public Animal() {
    }

    public Animal(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String saludar(){
        return "Hola, soy un animal";
    }
}
