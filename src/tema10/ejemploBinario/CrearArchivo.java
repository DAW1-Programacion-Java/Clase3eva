/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejemploBinario;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author jose
 */
public class CrearArchivo {
    String archivo;

    public CrearArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    public String crear(){
        ObjectOutputStream fSalida = null;
        try {
            fSalida = new ObjectOutputStream(new FileOutputStream(archivo));
            for (int i = 0; i < 10; i++) {
                fSalida.writeObject(new Persona(""+i, "Nombre"+i));
            }
            fSalida.close();
        } catch (FileNotFoundException ex) {
            return ex.getMessage();
        } catch (IOException ex) {
            return ex.getMessage();
        } finally {
            if (fSalida!=null){
                try {
                    fSalida.close();                    
                } catch (IOException ex) {
                    return ex.getMessage();
                }
            }
        }
        return "Fichero creado";
    }
}
