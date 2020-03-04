package herenciainversionistas;

public class Inversionista {
    protected int numCli;
    protected String nombre;
    protected String numCuenta;
    protected double invert;
    protected int plazoInv;

    /**
     * Metodo para obtener el numero de cliente
     * @return numCli
     */
    public int getNumCli() {
        return numCli;
    }

    /**
     * Metodo para actualizar el numero del cliente
     * @param numCli
     */
    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    /**
     * Metodo para obtener el nombre del cliente
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el numero de cuenta
     * @return numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * Metodo para actualizar el numero de cuenta
     * @param numCuenta
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Metodo para obtener la cantidad invertida
     * @return invert
     */
    public double getInvert() {
        return invert;
    }

    /**
     * Metodo para actualizar la cantidad invertida
     * @param invert
     */
    public void setInvert(double invert) {
        this.invert = invert;
    }

    /**
     * Metodo para obtener el plazo
     * @return plazoInv
     */
    public int getPlazoInv() {
        return plazoInv;
    }

    /**
     * Metodo para actualizar el plazo
     * @param plazoInv
     */
    public void setPlazoInv(int plazoInv) {
        this.plazoInv = plazoInv;
    }
}
