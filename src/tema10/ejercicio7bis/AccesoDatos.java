package tema10.ejercicio7bis;

import tema10.ejercicio7.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class AccesoDatos {

    public List<Alumno> cargarAlumnos(String ruta) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                int idAlumno = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                double[] notas = new double[10];
                for (int i = 0; i < 10; i++) {
                    notas[i] = Double.parseDouble(partes[i + 2]);
                }
                listaAlumnos.add(new Alumno(idAlumno, nombre, notas));
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
        return listaAlumnos;
    }

    public void escribirAlumnos(List<Alumno> listaAlumnos, String ruta) {

        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(ruta));
            for (Alumno alumno : listaAlumnos) {
                //bw.write(alumno.toString());
                bw.write(alumno.getId() + ";" + alumno.getNombre() + ";");
                for (double nota : alumno.getNotas()) {
                    bw.write(nota + ";");
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
