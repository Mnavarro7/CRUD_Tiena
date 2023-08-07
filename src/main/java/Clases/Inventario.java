
package Clases;

/**
 *
 * @author dizov
 */
public class Inventario {
    private String tipoProducto;
    private String nombre;
    private String marca;
    private String categoria;

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Inventario(String tipoProducto, String nombre, String marca, String categoria) {
        this.tipoProducto = tipoProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
    }

    public Inventario() {
    }

    @Override
    public String toString() {
        return "Inventario{" + "tipoProducto=" + tipoProducto + ", nombre=" + nombre + ", marca=" + marca + ", categoria=" + categoria + '}';
    }
    
           
}
