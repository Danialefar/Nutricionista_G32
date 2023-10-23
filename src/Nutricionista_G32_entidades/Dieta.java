
package Nutricionista_G32_entidades;

import java.time.LocalDate;


public class Dieta {
    private int id_dieta;
    private String nombre_dieta;
    private Paciente paciente;
    private double peso_incial;
    private double peso_final;
    private LocalDate fecha_inicial;
    private LocalDate fecha_final;

    public Dieta() {
    }

    public Dieta(int id_dieta) {
        this.id_dieta = id_dieta;
    }

    public Dieta(int id_dieta, String nombre_dieta, Paciente paciente, double peso_incial, double peso_final, LocalDate fecha_inicial, LocalDate fecha_final) {
        this.id_dieta = id_dieta;
        this.nombre_dieta = nombre_dieta;
        this.paciente = paciente;
        this.peso_incial = peso_incial;
        this.peso_final = peso_final;
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
    }

    public Dieta(String nombre_dieta, Paciente paciente, double peso_incial, double peso_final, LocalDate fecha_inicial, LocalDate fecha_final) {
        this.nombre_dieta = nombre_dieta;
        this.paciente = paciente;
        this.peso_incial = peso_incial;
        this.peso_final = peso_final;
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
    }

    public int getId_dieta() {
        return id_dieta;
    }

    public void setId_dieta(int id_dieta) {
        this.id_dieta = id_dieta;
    }

    public String getNombre_dieta() {
        return nombre_dieta;
    }

    public void setNombre_dieta(String nombre_dieta) {
        this.nombre_dieta = nombre_dieta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getPeso_incial() {
        return peso_incial;
    }

    public void setPeso_incial(double peso_incial) {
        this.peso_incial = peso_incial;
    }

    public double getPeso_final() {
        return peso_final;
    }

    public void setPeso_final(double peso_final) {
        this.peso_final = peso_final;
    }

    public LocalDate getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(LocalDate fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public LocalDate getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(LocalDate fecha_final) {
        this.fecha_final = fecha_final;
    }

            
}
