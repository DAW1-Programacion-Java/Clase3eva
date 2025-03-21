package tema9.ejercicio4;

public class ListaPersona {
    private Persona[] listaP;
    private int posicion;

    public ListaPersona() {
        listaP = new Persona[10];
    }

    public void anadirPersona(Persona persona, int posicion) {
        try {
            if(comprobarArray()){
                throw new ExcepcionArrayLleno("No hay sitio, buscate otro array");
            }
            else {
                listaP[posicion] = persona;
            }
        } catch (ExcepcionArrayLleno e) {
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public boolean comprobarArray() {
        for (int i = 0; i < listaP.length; i++) {
           if(listaP[i] == null){
               return false;
           }
        }
        return true;
    }

    public void mostrarLista() {
        for (int i = 0; i < listaP.length; i++) {
            if(listaP[i] != null){
                System.out.println(listaP[i]);
            }
        }
    }
}
