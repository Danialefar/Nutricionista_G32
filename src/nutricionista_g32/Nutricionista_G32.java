package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Comida_Data;
import Nutricionista_G32_accesoDatos.Conexion;
import Nutricionista_G32_accesoDatos.Paciente_Data;
import Nutricionista_G32_entidades.Comida;
import Nutricionista_G32_entidades.Paciente;
import java.sql.Connection;

public class Nutricionista_G32 {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();

        Paciente p1 = new Paciente(1, "FARIAS CORVALAN", "JUAN MANUEL", 33250000,
                "JUAN JOSE PASO Nº542 Bº CIUDADELA - CORDOBA", "3517885544", true);
        Paciente_Data pD = new Paciente_Data();
//        pD.guardarPaciente(p1);
//        pD.buscarPacientePorDni(33254110);
//        pD.modificarPaciente(p1);

        Comida d1 = new Comida("DESAYUNO 1", "INFUSION CON EDULCORANTE + 2 RODAJAS DE PAN LACTAL CON MERMELADA O QUESO", 70, true);
        Comida d2 = new Comida(2,"DESAYUNO 2", "YOGURT DESCREMADO CON 2 CUCHARADAS DE AVENA Y 1 DE PASAS DE CEREALES + 1 FRUTA", 80, true);
        Comida_Data cD = new Comida_Data();

//        cD.guardarComida(d2);
//        cD.modificarComida(d2);
          cD.bajaComida(2);
    }

}
