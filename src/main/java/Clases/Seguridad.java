
package Clases;

/**
 *
 * @author dizov
 */
public class Seguridad {
    private Usuario usuario;
    private String Contaseña;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getContaseña() {
        return Contaseña;
    }

    public void setContaseña(String Contaseña) {
        this.Contaseña = Contaseña;
    }

    public Seguridad(Usuario usuario, String Contaseña) {
        this.usuario = usuario;
        this.Contaseña = Contaseña;
    }

    public Seguridad() {
    }
    

    @Override
    public String toString() {
        return "Seguridad{" + "usuario=" + usuario + ", Contase\u00f1a=" + Contaseña + '}';
    }
    
}
