package tema10.ejercicio9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class GestionProductos {
    private List<Producto> listaP = new ArrayList<>();
    private AccesoDatos ad;

    public GestionProductos(){
        ad = new AccesoDatos();
        listaP = ad.cargarProductos("src/tema10/ejercicio9/datosProductos.txt");
    }

    public void consultarProducto(String id){
        for (Producto p : listaP) {
            if (p.getId().equals(id)) {
                System.out.println(p);
            }
        }
        System.out.println("No existe el producto con id " + id);
    }

    public List<Producto> sumaUnidades(int unidades){
        List<Producto> listaM = new ArrayList<>();
        for (Producto p : listaP) {
            int suma = 0;
            for(Integer i: p.getAnoVentas().keySet()) {
                suma += p.getAnoVentas().get(i);
            }
            if (suma > unidades) {
                listaM.add(p);
            }
        }
        return listaM;
    }

    public List<Integer> ventasAno(int ano){
        List<Integer> listaV = new ArrayList<>();
        for (Producto p : listaP) {
            /*for(Integer i: p.getAnoVentas().keySet()) {
                if (i == ano) {
                    listaV.add(p.getAnoVentas().get(i));
                }
            }*/
            if (p.getAnoVentas().containsKey(ano)) {
                listaV.add(p.getAnoVentas().get(ano));
            }
        }
        return listaV;
    }
    //generar ventas de un año aleatorias
    public void generarFile(int ano){
        List<Integer> listaF = new ArrayList<>();
        listaF = ventasAno(ano);

        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new java.io.FileWriter("src/tema10/ejercicio9/ventas" + ano + ".txt"));
            for (Integer i : listaF) {
                bw.write(i);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void guardarLista(){
        ad.escribirProductos(listaP, "src/tema10/ejercicio9/datosProductos.txt");
    }
}
