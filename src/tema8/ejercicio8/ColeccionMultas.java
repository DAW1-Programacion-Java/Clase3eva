package tema8.ejercicio8;
/*
completa la clase ColeccionMultas añadiendo los métodos
siguientes.
a. Retornar el número de multas asociadas a una matrícula.
b. Retornar la suma de los importes de las multas asociadas a una matrícula.
c. Retornar el importe medio de las multas de un mes y año pasados como
parámetros.
d. Retornar las multas asociadas a una matrícula.
e. Retornar la primera multa en orden cronológico asociada a una matrícula.
f. Retornar si todos los importes de las multas asociadas a una matrícula son
superiores a un valor dado.
 */
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ColeccionMultas {

	List<Multa> multas = new ArrayList<>();
	
	public ColeccionMultas() {
		Random rnd = new Random();
		String[] matriculas = { "1299-BMX", "3899-KML", "9099-JKL", "3737-NMS",
					"4566-CMC", "9001-BMT", "3201-KKL", "8012-BCD"};
		Double[] importes = { 50.0, 100.0, 150.0, 200.0, 250.0, 300.0 };
		for (int i = 0; i < 20; i++) {
			multas.add(new Multa(matriculas[rnd.nextInt(matriculas.length)],
					LocalDate.of(2000 + rnd.nextInt(25)  , rnd.nextInt(12) + 1, rnd.nextInt(28) + 1),
					importes[rnd.nextInt(importes.length)]));
		}
	}
	/**
	 * Retornar el número de multas asociadas a una matrícula.
	 * @param matricula
	 * @return
	 */
	public long getNumeroMultas(String matricula) {
		return multas.stream().filter(m -> m.getMatricula().equals(matricula)).count();
	}
	/**
	 * Retornar la suma de los importes de las multas asociadas a una matrícula.
	 * @param matricula
	 * @return
	 */
	public Double getSumaImportes(String matricula) {
		return multas.stream().filter(m -> m.getMatricula().equals(matricula)).mapToDouble(Multa::getImporteMulta).sum();
	}
	/**
	 * Retornar el importe medio de las multas de un mes y año pasados como
	 * parámetros.
	 */
	public Double getImporteMedio(int mes, int ano){
		return multas.stream().filter(m -> m.getFechaMulta().getMonthValue() == mes && m.getFechaMulta().getYear() == ano)
				.mapToDouble(Multa::getImporteMulta).average().orElse(0.0);

		/*return multas.stream().filter(m -> m.getFechaMulta().getMonthValue() == mes && m.getFechaMulta().getYear() == ano)
				.collect(Collectors.averagingDouble(Multa::getImporteMulta));*/
	}
	/**
	 * Retornar las multas asociadas a una matrícula.
	 */
	public List<Multa> multasPorMatricula(String matricula) {
		return multas.stream().filter(m -> m.getMatricula().equals(matricula)).collect(Collectors.toList());
	}
	/**
	 * Retornar la primera multa en orden cronológico asociada a una matrícula.
	 */
	public Multa primeraMulta(String matricula){
		return multas.stream().filter(m -> m.getMatricula().equals(matricula))
				.sorted(Comparator.comparing(Multa::getFechaMulta)).findFirst().orElse(null);

		/*return multas.stream().filter(m -> m.getMatricula().equals(matricula))
				.sorted((m1, m2)-> m1.getFechaMulta().compareTo(m2.getFechaMulta())).findFirst().orElse(null);*/
	}
	/**
	 * Retornar si todos los importes de las multas asociadas a una matrícula son
	 * superiores a un valor dado.
	 */
	public boolean todosImportesSuperiores(String matricula, Double valor){
		return multas.stream().filter(m -> m.getMatricula().equals(matricula))
				.allMatch(m -> m.getImporteMulta() > valor);
	}
}
