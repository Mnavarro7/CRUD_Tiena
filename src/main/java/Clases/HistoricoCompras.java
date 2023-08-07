
package Clases;

import java.util.*;

/**
 *
 * @author dizov
 */
public class HistoricoCompras {
    private CarritoCompras carritoCompras;
 private ArrayList<Comprar>historialCompras;

    public CarritoCompras getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(CarritoCompras carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    public ArrayList<Comprar> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(ArrayList<Comprar> historialCompras) {
        this.historialCompras = historialCompras;
    }

    public HistoricoCompras(CarritoCompras carritoCompras, ArrayList<Comprar> historialCompras) {
        this.carritoCompras = carritoCompras;
        this.historialCompras = historialCompras;
    }

    public HistoricoCompras() {
    }

    @Override
    public String toString() {
        return "HistoricoCompras{" + "carritoCompras=" + carritoCompras + ", historialCompras=" + historialCompras + '}';
    }

   
}
