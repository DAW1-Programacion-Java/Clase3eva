package tema8.ejercicioT;

import tema11.EjercicioQ.AccesoBDatos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Operaciones {
    List<Producto> listaP = null;
    AccesoBdatos ad = null;

    public Operaciones() {
        listaP = new ArrayList<>();
        ad = new AccesoBdatos();
        cargarDatos();
    }
    public void cargarDatos() {
       ResultSet rs = null;
       try {
           rs = ad.cargarProductos();
           while(rs.next()){
               listaP.add(new Producto(rs.getString("productCode"),
                       rs.getString("productName"), rs.getString("productLIne"),
                       rs.getString("productScale"), rs.getString("productoVendor"),
                       rs.getString("productDescription"),rs.getInt("quantityInStock"),
                       rs.getDouble("buyPrice"), rs.getDouble("MSRP")));

            }
        } catch (Exception e) {
            System.out.println("Error al buscar el participante: " + e.getMessage());
        }
    }
    public void imprimirProductos(){
        listaP.stream().forEach(System.out::println);
    }

    public void buscarProducto(String codigo){
        listaP.stream().filter(p -> p.getCodigoProducto().equals(codigo))
                .forEach(System.out::println);
    }

    public Producto buscarProductoPorNombre(String nombre){
        return listaP.stream().filter(p -> p.getNombreProducto().equals(nombre))
                .findFirst().orElse(null);
        }

    public void buscarProductosPorCategoria(String categoria){
        listaP.stream().filter(p -> p.getCategoriaProducto().equals(categoria))
                /*.sorted((p1, p2)->p1.getNombreProducto().compareTo(p2.getNombreProducto()))
                .sorted((p1, p2)-> Double.compare(p1.getPrecioCompra(), p2.getPrecioCompra()))*/
                .sorted(Comparator.comparing(Producto::getNombreProducto))
                .forEach(System.out::println);

    }
}
