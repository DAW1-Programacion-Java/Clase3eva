package tema7.ejercicio5;

import java.util.HashMap;
import java.util.Map;

public class HashMapCrud {
    private Map<String, String> miMap = new HashMap<>();

    public void create(String key, String value) {
        miMap.put(key, value);
    }

    public boolean borrar(String key) {
        if (miMap.containsKey(key)) {
            miMap.remove(key);
            return true;
        }
        return false;
    }

    public String read(String key) {
        return miMap.get(key);
    }

    public boolean update(String key, String value) {
        if (miMap.containsKey(key)) {
            miMap.put(key, value);
            return true;
        }
        return false;
    }
}
