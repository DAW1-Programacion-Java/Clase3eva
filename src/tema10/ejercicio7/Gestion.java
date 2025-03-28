package tema10.ejercicio7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Gestion {

    public double[] getNotasFile(int id) {

        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader("src/tema10/ejercicio7/DatosAlumnos.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                int idAlumno = Integer.parseInt(partes[0]);

                if (idAlumno == id) {
                    double[] notas = new double[10];
                    for (int i = 0; i < 10; i++) {
                        notas[i] = Double.parseDouble(partes[i + 2]);
                    }
                    return notas;
                }
            }


        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally {
            try {
                br.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public double getMedia(int id) {
        double[] notas = getNotasFile(id);
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public double getNotaMaxima(int id) {
        double[] notas = getNotasFile(id);
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    public void mostrarDatos(){

        try (BufferedReader br = new BufferedReader(new FileReader("src/tema10/ejercicio7/DatosAlumnos.txt"))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                int idAlumno = Integer.parseInt(partes[0]);
                System.out.println("ID: " + idAlumno + " Nombre: " + partes[1]+ " Media: " + getMedia(idAlumno) );
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
