package tema8.ejercicioT;

import examen.ConectarBD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccesoBdatos {
    Connection c = null;

    public AccesoBdatos(){
        try {
            c = ConectarBD.getConexion("classicmodels");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public ResultSet cargarProductos() throws SQLException, IOException {

        PreparedStatement ps = c.prepareStatement("select * from products");
        return ps.executeQuery();

    }
}
