
package Nutricionista_G32_entidades;


public class Paciente {
    private int id_paciente;
    private String apellido_paciente;
    private String nombre_paciente;
    private int dni_paciente;
    private String direccion_paciente;
    private String telef_paciente;
    private boolean estado;

    public Paciente() {
    }

    public Paciente(int id_paciente, String apellido_paciente, String nombre_paciente, int dni_paciente) {
        this.id_paciente = id_paciente;
        this.apellido_paciente = apellido_paciente;
        this.nombre_paciente = nombre_paciente;
        this.dni_paciente = dni_paciente;
    }

    public Paciente(int id_paciente, String apellido_paciente, String nombre_paciente, int dni_paciente, String direccion_paciente, String telef_paciente, boolean estado) {
        this.id_paciente = id_paciente;
        this.apellido_paciente = apellido_paciente;
        this.nombre_paciente = nombre_paciente;
        this.dni_paciente = dni_paciente;
        this.direccion_paciente = direccion_paciente;
        this.telef_paciente = telef_paciente;
        this.estado = estado;
    }

    public Paciente(String apellido_paciente, String nombre_paciente, int dni_paciente, String direccion_paciente, String telef_paciente, boolean estado) {
        this.apellido_paciente = apellido_paciente;
        this.nombre_paciente = nombre_paciente;
        this.dni_paciente = dni_paciente;
        this.direccion_paciente = direccion_paciente;
        this.telef_paciente = telef_paciente;
        this.estado = estado;
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

    public String getTelef_paciente() {
        return telef_paciente;
    }

    public void setTelef_paciente(String telef_paciente) {
        this.telef_paciente = telef_paciente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    @Override
    public String toString() {
        return id_paciente + " - " + apellido_paciente + ", " + nombre_paciente + " - " + dni_paciente ;
    }
    
    
}
