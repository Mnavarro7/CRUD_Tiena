/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author dizov
 */
public class Cliente extends Persona{

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String identificacion, String direccion, String email, int telefono) {
        super(nombre, apellido, identificacion, direccion, email, telefono);
    }

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }
    
}
