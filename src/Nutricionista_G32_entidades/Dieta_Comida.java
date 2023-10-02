
package Nutricionista_G32_entidades;


public class Dieta_Comida {
    private int id_dieta_comida;
    private Comida comida;
    private Dieta dieta;

    public Dieta_Comida() {
    }

    public Dieta_Comida(int id_dieta_comida, Comida comida, Dieta dieta) {
        this.id_dieta_comida = id_dieta_comida;
        this.comida = comida;
        this.dieta = dieta;
    }

    public Dieta_Comida(Comida comida, Dieta dieta) {
        this.comida = comida;
        this.dieta = dieta;
    }
    
    
}
