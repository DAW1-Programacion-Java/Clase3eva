package tema8.ejercicioT;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Operaciones1 {
    List<Producto> listaP = null;
    AccesoBdatos ad = null;

    public Operaciones1() {
        listaP = new ArrayList<>();
        ad = new AccesoBdatos();
        cargarDatos();
    }

    private void cargarDatos() {
        ResultSet rs = null;

        try{
            rs=ad.cargarProductos();
            while (rs.next()){
                listaP.add(new Producto(rs.getString("productCode"), rs.getString("productName"),
                        rs.getString("productLIne"),rs.getString("productScale"),
                        rs.getString("productoVendor"), rs.getString("productDescription"),
                        rs.getInt("quantityInStock"), rs.getDouble("buyPrice"),
                        rs.getDouble("MSRP")));
            }

        }catch (Exception e){
            System.out.println("Error al buscar el participante: " + e.getMessage());
        }
    }
}
