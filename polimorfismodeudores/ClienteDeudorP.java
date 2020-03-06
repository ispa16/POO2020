package polimorfismodeudores;

public abstract class ClienteDeudorP {
    protected int numCl;
    protected String cliente;
    protected String numCue;
    protected double prestamo;
    protected double interes;
    protected int plazo;
    protected double pagar;
    /**
     * Metodo para obtener el numero de cliente
     *
     * @return numCl
     */
    public int getNumCl() {
        return numCl;
    }

    /**
     * Metodo para actualizar el numero de cliente
     *
     * @param numCl
     */
    public void setNumCl(int numCl) {
        this.numCl = numCl;
    }

    /**
     * Metodo para obtener el nombre
     *
     * @return nombre
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Metodo para actualizar el nombre
     *
     * @param cliente
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Metodo para obtener el numero de cuenta
     *
     * @return numCue
     */
    public String getNumCue() {
        return numCue;
    }

    /**
     * Metodo para actualizar el numero de cuenta
     *
     * @param numCue
     */
    public void setNumCue(String numCue) {
        this.numCue = numCue;
    }

    /**
     * Metodo para obtener el prestamo
     *
     * @return prestamo
     */
    public double getPrestamo() {
        return prestamo;
    }

    /**
     * Metodo para actualizar el prestamo
     *
     * @param prestamo
     */
    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }

    /**
     * Metodo para obtener el interes
     *
     * @return interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * Metodo para actualizar el interes
     *
     * @param interes
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }

    /**
     * Metodo para obtener el plazo
     *
     * @return plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * Metodo para actualizar el plazo
     *
     * @param plazo
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    /**
     * Metodo para obtener lo que se tiene que pagar
     * @return
     */
    public double getPagar() {
        return pagar;
    }

    /**
     * Metodo abstracto para calcular lo que se tiene que pagar
     */
    public abstract void calcularPagar();
}
