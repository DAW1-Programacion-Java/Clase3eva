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
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CrearArchivo crearArch = new CrearArchivo("Personas.dat");

        String retorno = crearArch.crear();
        System.out.println("Retorno: " + retorno);
        
        LeerArchivo leerArch =  new LeerArchivo("Personas.dat");
        retorno = leerArch.leer();
        System.out.println("Retorno: " + retorno);
    }
    
}
