/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Jorge Tapia Flores
 */

public class Factura {
    private int cantidad;
    private double subtotal;
    private double total;
    private double iva;
    private double precio_unidad;

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }
    public void precioUnidad(double a){
        this.precio_unidad = a;
    
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal() {
        this.subtotal = this.cantidad* this.precio_unidad;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal() {
        this.total = this.subtotal + this.iva;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva() {
        this.iva = this.subtotal * 0.12 ;
    }
    
    
    
    
    
    
}
