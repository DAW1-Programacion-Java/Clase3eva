package tema7.ejercicio7;


import java.util.*;

public class Diccionario {
    private String idioma;
    private Map<String, Set<String>> dic;

    public Diccionario(String idioma) {
        this.idioma = idioma;
        dic = new HashMap<>();
    }

    public void addPalabra(String palabra, String significado) {
        if (dic.containsKey(palabra)) {
            //dic.get(palabra)// Obtenemos el significado de la palabra actual, Set<String>
            dic.get(palabra).add(significado);
        } else {
            Set<String> listaS = new HashSet<>();
            listaS.add(significado);
            dic.put(palabra, listaS);
        }
    }

    public void addPalabra(String palabra, List<String> significados) {
        /*if (dic.containsKey(palabra)) {
            //dic.get(palabra).addAll(significados);
            for (String s : significados) {
                dic.get(palabra).add(s);
                //addPalabra(palabra, s);
            }
        } else {
            Set<String> listaS = new HashSet<>();
            listaS.addAll(significados);
            dic.put(palabra, listaS);
        }*/
        for (String s : significados) {
            addPalabra(palabra, s);
        }
    }

    public void addPalabra(String palabra, String[] significados) {
        addPalabra(palabra, Arrays.asList(significados));
        /*for (String s : significados) {
            addPalabra(palabra, s);
        }*/
    }

    public void addPalabra(String palabra, String significado, String separador) {
        String [] s = significado.split(separador);
        addPalabra(palabra, s);
    }

    public List<String> getSignificadosDe(String palabra){
        List<String> listaSig = new ArrayList<>();
        Set<String> setSig = new HashSet<>();

        setSig = dic.get(palabra);
        //primera forma
        /*if (setSig != null) {
            listaSig.addAll(setSig);
        }*/
        //segunda forma
        for (String s : setSig) {
            listaSig.add(s);
        }
        return listaSig;
    }

    public Set<String> getSignificadosDe1(String palabra){
        return dic.get(palabra);
    }
}
