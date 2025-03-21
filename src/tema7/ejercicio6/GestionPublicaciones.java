package tema7.ejercicio6;

import java.util.HashMap;
import java.util.Map;

public class GestionPublicaciones {
    Map<String, Publicacion> mapPubli;

    public GestionPublicaciones() {
        mapPubli = new HashMap<>();
    }

    public void addPublicacion(Publicacion p) {
        mapPubli.put(p.getTitulo(), p);
    }

    public boolean removePublicacion(String titulo) {
        if(mapPubli.containsKey(titulo)){
            mapPubli.remove(titulo);
            return true;
        }
        return false;
    }

    public Publicacion getPublicacion(String titulo) {
        return mapPubli.get(titulo);
    }

    /*public void mostrarPublicaciones() {
        for (Map.Entry<String, Publicacion> entry : mapPubli.entrySet()) {
            System.out.println(entry.getValue());
        }
    }*/

    public void mostrarPublicaciones() {
        for(String t : mapPubli.keySet()){
            System.out.println(t +"," + mapPubli.get(t));
        }
    }

}
