
package Nutricionista_G32_entidades;

import java.time.LocalDate;


public class Historial {
    private int id_historial;
    private Paciente paciente;
    private double peso_registro;
    private LocalDate fecha_registro;

    public Historial() {
    }

    public Historial(int id_historial, Paciente paciente, double peso_registro, LocalDate fecha_registro) {
        this.id_historial = id_historial;
        this.paciente = paciente;
        this.peso_registro = peso_registro;
        this.fecha_registro = fecha_registro;
    }

    public Historial(Paciente paciente, double peso_registro, LocalDate fecha_registro) {
        this.paciente = paciente;
        this.peso_registro = peso_registro;
        this.fecha_registro = fecha_registro;
    }

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getPeso_registro() {
        return peso_registro;
    }

    public void setPeso_registro(double peso_registro) {
        this.peso_registro = peso_registro;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
    
}
