package tema7.ejercicio8;

import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Random rd = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            lista.add(rd.nextInt(10)+1);
        }
        Collections.sort(lista);//Ordena la lista
        for(Integer i : lista){//Recorre la lista para imprimir
            System.out.print(i+ ",");
        }
        System.out.println();

        Map<Integer, Integer> mapRepe = new HashMap<>();
        for(Integer n : lista){
            if(mapRepe.containsKey(n)){//Si el número ya está en el mapa, se le suma 1
                mapRepe.put(n, mapRepe.get(n)+1);
            }else{
                mapRepe.put(n, 1);
            }
        }

        for(Integer k : mapRepe.keySet()){
            System.out.println("El número "+k+" se repite "+mapRepe.get(k)+" veces");
        }

    }
}
