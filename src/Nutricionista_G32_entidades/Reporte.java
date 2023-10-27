
package Nutricionista_G32_entidades;


public class Reporte {
    
    private Paciente paciente;
    double pesoObjetivo;
    double ultimoPesoRegistro;
    double diferencia;

    public Reporte() {
    }

    public Reporte(Paciente paciente, double pesoObjetivo, double ultimoPesoRegistro, double diferencia) {
        this.paciente = paciente;
        this.pesoObjetivo = pesoObjetivo;
        this.ultimoPesoRegistro = ultimoPesoRegistro;
        this.diferencia = diferencia;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getPesoObjetivo() {
        return pesoObjetivo;
    }

    public void setPesoObjetivo(double pesoObjetivo) {
        this.pesoObjetivo = pesoObjetivo;
    }

    public double getUltimoPesoRegistro() {
        return ultimoPesoRegistro;
    }

    public void setUltimoPesoRegistro(double ultimoPesoRegistro) {
        this.ultimoPesoRegistro = ultimoPesoRegistro;
    }

    public double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(double diferencia) {
        this.diferencia = diferencia;
    }
    
    
    
}
