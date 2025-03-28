package tema10.ejercicio7bis;

import tema10.ejercicio7.Alumno;

import java.util.ArrayList;
import java.util.List;

public class GestionBis {
    private List<Alumno> listaAlumnos = new ArrayList<>();
    private AccesoDatos accesoDatos = new AccesoDatos();

    public GestionBis() {
        listaAlumnos = accesoDatos.cargarAlumnos("src/tema10/ejercicio7/DatosAlumnos.txt");
    }

    public double[] getNotasFile(int id) {
        for (Alumno a : listaAlumnos) {
            if (a.getId() == id) {
                return a.getNotas();
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
    public void mostrarDatos() {
        for (Alumno a : listaAlumnos) {
            System.out.println(a);
        }
    }

    public void escribirAlumnos(String ruta) {
        accesoDatos.escribirAlumnos(listaAlumnos, "src/tema10/ejercicio7/DatosAlumnos.txt");
    }
}
