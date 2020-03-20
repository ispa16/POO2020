/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;


public class Productos {
    
    private double costo;
    private String nombre;
    private double id;
    private int stock;
    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the id
     */
    public double getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(double id) {
        this.id = id;
    }

    /**
     * @return the stock
     */
    public double getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void addStock(int stock){
        this.stock = this.stock + stock;
    }
    
    public void removeStock(int stock){
        this.stock = this.stock - stock;
    }
    
}
