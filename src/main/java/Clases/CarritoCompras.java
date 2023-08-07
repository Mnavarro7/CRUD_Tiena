package Clases;

/**
 *
 * @author dizov
 */
public class CarritoCompras {

    private double total;
    private double Subtotal;
    private double Impuesto;
    private Comprar comprar;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(double Impuesto) {
        this.Impuesto = Impuesto;
    }

    public Comprar getComprar() {
        return comprar;
    }

    public void setComprar(Comprar comprar) {
        this.comprar = comprar;
    }

    public CarritoCompras(double total, double Subtotal, double Impuesto, Comprar comprar) {
        this.total = total;
        this.Subtotal = Subtotal;
        this.Impuesto = Impuesto;
        this.comprar = comprar;
    }

    @Override
    public String toString() {
        return "CarritoCompras{" + "total=" + total + ", Subtotal=" + Subtotal + ", Impuesto=" + Impuesto + ", comprar=" + comprar + '}';
    }
            
    
}
