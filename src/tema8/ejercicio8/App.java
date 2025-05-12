/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.ejercicio8;

import java.util.List;

/**
 *
 * @author profesor
 */
public class App {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Multa multa1 = new Multa("123456789", null, 100.0);
		Multa multa2 = new Multa("123456789", null, 200.0);
		Multa multa3 = new Multa("123456789", null, 300.0);

		List<Multa> listaMultas = List.of(multa1, multa2, multa3);




		
		

	}
}
