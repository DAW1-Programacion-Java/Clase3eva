package tema10.ejercicio9;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccesoDatos {

    public List<Producto> cargarProductos(String ruta) {
        List<Producto> listaP = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                String id = partes[0];
                String nombre = partes[1];
                Map<Integer, Integer> ventas = new HashMap<>();
                for (int i = 2; i < partes.length; i=i+2) {
                    ventas.put(Integer.parseInt(partes[i]), Integer.parseInt(partes[i + 1]));
                }
                listaP.add(new Producto(id, nombre, ventas));
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return listaP;
    }

    public void escribirProductos(List<Producto> listaP, String ruta) {

        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(ruta));
            for (Producto p : listaP) {
                //bw.write(alumno.toString());
                bw.write(p.getId() + ";" + p.getNombre() + ";");
                for(Integer i : p.getAnoVentas().keySet()) {
                    bw.write(i + ";" + p.getAnoVentas().get(i) + ";");
                }
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
