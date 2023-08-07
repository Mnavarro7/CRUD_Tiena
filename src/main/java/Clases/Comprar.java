/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author dizov
 */
public class Comprar extends MantenimientoProductos {

    private MantenimientoProductos mantenimientoProductos;

    public MantenimientoProductos getMantenimientoProductos() {
        return mantenimientoProductos;
    }

    public void setMantenimientoProductos(MantenimientoProductos mantenimientoProductos) {
        this.mantenimientoProductos = mantenimientoProductos;
    }

    public Comprar(int idProducto, int cantidad, String tipoProducto, String nombre, String marca, String categoria) {
        super(idProducto, cantidad, tipoProducto, nombre, marca, categoria);
    }

    public Comprar() {
    }

    @Override
    public String toString() {
        return "Comprar{" + "mantenimientoProductos=" + mantenimientoProductos + '}';
    }

}
