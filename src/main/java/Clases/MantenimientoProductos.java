
package Clases;

/**
 *
 * @author dizov
 */
public class MantenimientoProductos extends Inventario{
    int idProducto;
    int cantidad;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public MantenimientoProductos(int idProducto, int cantidad, String tipoProducto, String nombre, String marca, String categoria) {
        super(tipoProducto, nombre, marca, categoria);
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public MantenimientoProductos() {
    }

    @Override
    public String toString() {
        return "MantenimientoProductos{" + "idProducto=" + idProducto + ", cantidad=" + cantidad + '}';
    }
    
}
