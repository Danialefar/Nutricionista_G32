
package Nutricionista_G32_entidades;


public class Dieta_Comida {
    private int id_dieta_comida;
    private Comida comida;
    private Dieta dieta;
    private String tipo_comida;
    

    public Dieta_Comida() {
    }

    public Dieta_Comida(int id_dieta_comida, Comida comida, Dieta dieta, String tipo_comida) {
        this.id_dieta_comida = id_dieta_comida;
        this.comida = comida;
        this.dieta = dieta;
        this.tipo_comida = tipo_comida;
    }

    public Dieta_Comida(Comida comida, Dieta dieta, String tipo_comida) {
        this.comida = comida;
        this.dieta = dieta;
        this.tipo_comida = tipo_comida;
    }

    public int getId_dieta_comida() {
        return id_dieta_comida;
    }

    public void setId_dieta_comida(int id_dieta_comida) {
        this.id_dieta_comida = id_dieta_comida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    
    
    
}
