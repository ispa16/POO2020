package polimorfismoinversionistas;

public abstract class InversionistaP {
    protected int numCl;
    protected String nom;
    protected String numCu;
    protected double inve;
    protected int plazoInv;
    protected double intGanado;

    /**
     * Metodo para obtener el numero de cliente
     * @return numCl
     */
    public int getNumCl() {
        return numCl;
    }

    /**
     * Metodo para actualizar el numero de cliente
     * @param numCl
     */
    public void setNumCl(int numCl) {
        this.numCl = numCl;
    }

    /**
     * Metodo para obtener el nombre
     * @return cliente
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
     * @return numCu
     */
    public String getNumCu() {
        return numCu;
    }

    /**
     * Metodo para actualizar el numero de cuenta
     * @param numCu
     */
    public void setNumCu(String numCu) {
        this.numCu = numCu;
    }

    /**
     * Metodo para obtener la inversion
     * @return  inve
     */
    public double getInve() {
        return inve;
    }

    /**
     * Metodo para actualizar la inversion
     * @param inve
     */
    public void setInve(double inve) {
        this.inve = inve;
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

    /**
     * Metodo para obtener el interes ganado
     * @return intGanado
     */
    public double getIntGanado() {
        return intGanado;
    }

    /**
     * Metodo abstracto para el interes ganado
     */
    public abstract void calcularIntGanado();
}
