/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejemploBinario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class LeerArchivo {
    String archivo;

    public LeerArchivo(String archivo) {

        this.archivo = archivo;
    }
    
    public String leer(){
    
        ObjectInputStream fEntrada=null;
        
        try {
            fEntrada = new ObjectInputStream(new FileInputStream(archivo));
            
            Persona persona = null;
            while ((persona=(Persona)fEntrada.readObject())!=null){
                System.out.println("Persona: " + persona.toString());
            }
            
        } catch (IOException ex) {
            return "Fichero procesado";
        } catch (ClassNotFoundException ex) {
            return ex.getMessage();
        } finally {
            try {
                fEntrada.close();
            } catch (IOException ex) {
                return ex.getMessage();
            }
        }
        return "Fichero procesado";
    }
}
