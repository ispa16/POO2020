package polimorfismovolumen;

public abstract class FiguraP {
    protected String nomb;
    protected double volu;

    /**
     * Metodo para obtener el nombre
     * @return nomb
     */
    public String getNomb() {
        return nomb;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nomb
     */
    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    /**
     * Metodo para obtener el volumen
     * @return volu
     */
    public double getVolu() {
        return volu;
    }

    /**
     * Metodo abstracto para calcular el volumen
     */
    public abstract void calcularVolu();
}
