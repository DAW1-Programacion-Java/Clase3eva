package tema10.ejercicio7;

public class Alumno {
    private int id;
    private String nombre;
    private double[] notas= new double[10];

    public Alumno(int id, String nombre, double[] notas) {
        this.id = id;
        this.nombre = nombre;
        this.notas = notas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append(", Nombre: ").append(nombre).append(", Notas: ");
        for (double nota : notas) {
            sb.append(nota).append(" ");
        }
        return sb.toString();
    }
}
