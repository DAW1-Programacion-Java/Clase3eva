package tema8.ejercicioT;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectarBD1 {
    Connection c = null;

    public ConectarBD1(){
        try{
            c=ConectarBD.getConexion("classicmodels");
        }catch(Exception e){
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public ResultSet cargarDatos() throws SQLException, IOException {

        PreparedStatement ps = c.prepareStatement("select * from productos");
        return ps.executeQuery();

    }
}
