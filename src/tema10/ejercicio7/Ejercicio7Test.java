package tema10.ejercicio7;

public class Ejercicio7Test {
    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        double[] notas = gestion.getNotasFile(14308556);
        System.out.println("Notas del alumno 14308556: ");
        for (double nota : notas) {
            System.out.println(nota);
        }
        System.out.println("Media del alumno 1: " + gestion.getMedia(14308556));
        System.out.println("Nota máxima del alumno 1: " + gestion.getNotaMaxima(2267650));
        System.out.println("Datos de los alumnos: ");
        //gestion.mostrarDatos();
        Alumno al = new Alumno(2267650, "Juan", new double[]{5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 5.0, 6.0, 7.0, 8.0});
        System.out.println(al);
    }
}
