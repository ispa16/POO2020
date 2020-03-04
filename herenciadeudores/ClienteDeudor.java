package herenciadeudores;

public class ClienteDeudor {
    protected int numCli;
    protected String nom;
    protected String numCue;
    protected double prestado;
    protected double interes;
    protected int plazo;

    /**
     * Metodo para obtener el numero de cliente
     * @return numCli
     */
    public int getNumCli() {
        return numCli;
    }

    /**
     * Metodo para actualizar el numero de cliente
     * @param numCli
     */
    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    public String getNom() {
        return nom;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Metodo para obtener el numero de cuenta
     * @return numCue
     */
    public String getNumCue() {
        return numCue;
    }

    /**
     * Metodo para actualizar el numero de cuenta
     * @param numCue
     */
    public void setNumCue(String numCue) {
        this.numCue = numCue;
    }

    /**
     * Metodo para obtener el prestamo
     * @return
     */
    public double getPrestado() {
        return prestado;
    }

    /**
     * Metodo para actualizar el prestamo
     * @param prestado
     */
    public void setPrestado(double prestado) {
        this.prestado = prestado;
    }

    /**
     * Metodo para obtener el interes
     * @return interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * Metodo para actualizar el interes
     * @param interes
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }

    /**
     * Metodo para obtener el plazo
     * @return plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * Metodo para actualizar el plazo
     * @param plazo
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
}
