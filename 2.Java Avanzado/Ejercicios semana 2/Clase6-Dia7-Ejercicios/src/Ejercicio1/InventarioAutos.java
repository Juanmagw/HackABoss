package Ejercicio1;

import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

public class InventarioAutos <T extends Auto>{
    private List<T> autos;

    public InventarioAutos(List<T> autos) {
        this.autos = autos;
    }

    public List<T> getAutos() {
        return autos;
    }

    public void setAutos(List<T> autos) {
        this.autos = autos;
    }

    public void agregarAuto(T objeto){
        autos.add(objeto);
    }

    public List<T> buscarAutoMarca(String marca){
        return autos.stream()
                .filter(auto -> auto.getMarca().equalsIgnoreCase(marca))
                .collect(Collectors.toList());
    }

    public List<T> buscarAutoAnio(int anio){
        return autos.stream()
                .filter(auto -> auto.getAnio().equals(Year.of(anio)))
                .collect(Collectors.toList());
    }

    public Double calcularTotalInventario(){
        return autos.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();
    }
}
