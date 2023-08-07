
package Clases;

/**
 *
 * @author dizov
 */
public class Usuario extends Persona{
    private String tipoUsuario;

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario(String tipoUsuario, String nombre, String apellido, String identificacion, String direccion, String email, int telefono) {
        super(nombre, apellido, identificacion, direccion, email, telefono);
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "tipoUsuario=" + tipoUsuario + '}';
    }
    
    
}
