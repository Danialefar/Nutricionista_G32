
package Nutricionista_G32_entidades;


public class Paciente {
    private int id_paciente;
    private String apellido_paciente;
    private String nombre_paciente;
    private int dni_paciente;
    private String direccion_paciente;
    private int telef_paciente;

    public Paciente() {
    }

    public Paciente(int id_paciente, String apellido_paciente, String nombre_paciente, int dni_paciente, String direccion_paciente, int telef_paciente) {
        this.id_paciente = id_paciente;
        this.apellido_paciente = apellido_paciente;
        this.nombre_paciente = nombre_paciente;
        this.dni_paciente = dni_paciente;
        this.direccion_paciente = direccion_paciente;
        this.telef_paciente = telef_paciente;
    }

    public Paciente(String apellido_paciente, String nombre_paciente, int dni_paciente, String direccion_paciente, int telef_paciente) {
        this.apellido_paciente = apellido_paciente;
        this.nombre_paciente = nombre_paciente;
        this.dni_paciente = dni_paciente;
        this.direccion_paciente = direccion_paciente;
        this.telef_paciente = telef_paciente;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getApellido_paciente() {
        return apellido_paciente;
    }

    public void setApellido_paciente(String apellido_paciente) {
        this.apellido_paciente = apellido_paciente;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public int getDni_paciente() {
        return dni_paciente;
    }

    public void setDni_paciente(int dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public String getDireccion_paciente() {
        return direccion_paciente;
    }

    public void setDireccion_paciente(String direccion_paciente) {
        this.direccion_paciente = direccion_paciente;
    }

    public int getTelef_paciente() {
        return telef_paciente;
    }

    public void setTelef_paciente(int telef_paciente) {
        this.telef_paciente = telef_paciente;
    }

    @Override
    public String toString() {
        return "id.=" + id_paciente + " - " + apellido_paciente + ", " + nombre_paciente + "- dni: " + dni_paciente;
    }
    
    
}
