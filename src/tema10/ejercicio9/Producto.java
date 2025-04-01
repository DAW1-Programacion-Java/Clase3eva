package tema10.ejercicio9;

import java.util.HashMap;
import java.util.Map;

public class Producto {
    private String id;
    private String nombre;
    private Map<Integer, Integer> anoVentas;

    public Producto(String id, String nombre, Map<Integer, Integer> anoVentas) {
        this.anoVentas = new HashMap<>();
        this.id = id;
        this.nombre = nombre;
        this.anoVentas = anoVentas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<Integer, Integer> getAnoVentas() {
        return anoVentas;
    }

    public void setAnoVentas(Map<Integer, Integer> anoVentas) {
        this.anoVentas = anoVentas;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", anoVentas=" + anoVentas +
                '}';
    }
}
