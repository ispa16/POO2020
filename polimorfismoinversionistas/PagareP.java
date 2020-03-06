package polimorfismoinversionistas;

public class PagareP extends InversionistaP {
    private double intAnual;

    /**
     * Metodo constructor para pagare
     * @param numCl
     * @param nom
     * @param numCu
     * @param inve
     * @param plazoInv
     * @param intAnual
     */
    public PagareP(int numCl, String nom, String numCu, double inve, int plazoInv, double intAnual){
        this.numCl = numCl;
        this.nom = nom;
        this.numCu = numCu;
        this.inve = inve;
        this.plazoInv = plazoInv;
        this.intAnual = intAnual;
    }

    /**
     * Metodo para obtener el interes anual
     * @return intAnual
     */
    public double getIntAnual() {
        return intAnual;
    }

    /**
     * Metodo abstracto para calcular el interes ganado
     */
    @Override
    public void calcularIntGanado() {
        intGanado = inve * (intAnual / 100) * plazoInv;
    }
}
