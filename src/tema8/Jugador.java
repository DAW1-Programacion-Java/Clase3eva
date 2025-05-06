package tema8;

public class Jugador {
    private String nombre;
    private double peso;
    private double altura;

    public Jugador(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
