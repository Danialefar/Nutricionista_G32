
package Nutricionista_G32_entidades;


public class Comida {
    private int id_comida;
    private String nombre_comida;
    private String detalle_comida;
    private int calorias_comida;
    private boolean estado_comida;

    public Comida() {
    }

    public Comida(int id_comida) {
        this.id_comida = id_comida;
    }

    public Comida(int id_comida, String nombre_comida, String detalle_comida, int calorias_comida, boolean estado_comida) {
        this.id_comida = id_comida;
        this.nombre_comida = nombre_comida;
        this.detalle_comida = detalle_comida;
        this.calorias_comida = calorias_comida;
        this.estado_comida = estado_comida;
    }

    public Comida(String nombre_comida, String detalle_comida, int calorias_comida, boolean estado_comida) {
        this.nombre_comida = nombre_comida;
        this.detalle_comida = detalle_comida;
        this.calorias_comida = calorias_comida;
        this.estado_comida = estado_comida;
    }

    public int getId_comida() {
        return id_comida;
    }

    public void setId_comida(int id_comida) {
        this.id_comida = id_comida;
    }

    public String getNombre_comida() {
        return nombre_comida;
    }

    public void setNombre_comida(String nombre_comida) {
        this.nombre_comida = nombre_comida;
    }

    public String getDetalle_comida() {
        return detalle_comida;
    }

    public void setDetalle_comida(String detalle_comida) {
        this.detalle_comida = detalle_comida;
    }

    public int getCalorias_comida() {
        return calorias_comida;
    }

    public void setCalorias_comida(int calorias_comida) {
        this.calorias_comida = calorias_comida;
    }

    public boolean isEstado_comida() {
        return estado_comida;
    }

    public void setEstado_comida(boolean estado_comida) {
        this.estado_comida = estado_comida;
    }

    
    @Override
    public String toString() {
        return "Id=" + id_comida + "- nombre: " + nombre_comida + "- detalle: " + detalle_comida + "- calorias= " + calorias_comida ;
    }
    
    
    
}
