package juanmagw.hackaboss.ejerciciointegradorjsp.jpa.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Partido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private LocalDate fecha;
    @ManyToOne
    //@JoinColumn(name = "equipo_id")
    private Equipo equipo1;
    @ManyToOne
    //@JoinColumn(name = "equipo_id")
    private Equipo equipo2;
    private Integer puntuacionEquipo1;
    private Integer puntuacionEquipo2;

    public Partido() {
    }

    public Partido(String nombre, LocalDate fecha, Equipo equipo1, Equipo equipo2, Integer puntuacionEquipo1, Integer puntuacionEquipo2) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.puntuacionEquipo1 = puntuacionEquipo1;
        this.puntuacionEquipo2 = puntuacionEquipo2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Integer getPuntuacionEquipo1() {
        return puntuacionEquipo1;
    }

    public void setPuntuacionEquipo1(Integer puntuacionEquipo1) {
        this.puntuacionEquipo1 = puntuacionEquipo1;
    }

    public Integer getPuntuacionEquipo2() {
        return puntuacionEquipo2;
    }

    public void setPuntuacionEquipo2(Integer puntuacionEquipo2) {
        this.puntuacionEquipo2 = puntuacionEquipo2;
    }

}
