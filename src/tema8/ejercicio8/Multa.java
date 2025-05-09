/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.ejercicio8;

import java.time.LocalDate;

public class Multa {
    private String matricula;
    private LocalDate fechaMulta;
    private Double importeMulta;

    public Multa(String matricula, LocalDate fechaMulta, Double importeMulta) {
        this.matricula = matricula;
        this.fechaMulta = fechaMulta;
        this.importeMulta = importeMulta;
    }

    public Double getImporteMulta() {
        return importeMulta;
    }

    public void setImporteMulta(Double importeMulta) {
        this.importeMulta = importeMulta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaMulta() {
        return fechaMulta;
    }

    public void setFechaMulta(LocalDate fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    @Override
    public String toString() {
        return "Multa{" + "matricula=" + matricula + ", fechaMulta=" + fechaMulta + ", importeMulta=" + importeMulta + '}';
    }
}
