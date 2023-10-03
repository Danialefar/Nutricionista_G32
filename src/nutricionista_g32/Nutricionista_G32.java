package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Conexion;
import Nutricionista_G32_accesoDatos.Paciente_Data;
import Nutricionista_G32_entidades.Paciente;
import java.sql.Connection;

public class Nutricionista_G32 {
    
    public static void main(String[] args) {
        
        Connection con = Conexion.getConexion();
        
        Paciente p1 = new Paciente(1,"FARIAS", "JUAN MANUEL", 33254110, "JUAN JOSE PASO Nº542 Bº CIUDADELA - CORDOBA", "3517885544", true);
        Paciente_Data pD = new Paciente_Data();

//        pD.guardarPaciente(p1);
//        pD.buscarPacientePorDni(33254110);
        pD.modificarPaciente(p1);
        
    }
    
}
