package polimorfismoinversionistas;

public class CuentaMaestraP extends InversionistaP {
    /**
     * Metodo contructor para cuenta maestra
     * @param numCl
     * @param nom
     * @param numCu
     * @param inve
     * @param plazoInv
     */
    public CuentaMaestraP(int numCl, String nom, String numCu, double inve, int plazoInv){
        this.numCl = numCl;
        this.nom = nom;
        this.numCu = numCu;
        this.inve = inve;
        this.plazoInv = plazoInv;
    }

    /**
     * Metodo para calcular la cuenta maestra
     * @return intGanado
     */
    public void calcularIntGanado() {
        if (inve >= 1000.00 && inve < 4000.00) {
            intGanado = plazoInv * (inve * 0.05);
        } else {
            if (inve >= 4000.00 && inve < 20000.00) {
                intGanado = plazoInv * (inve * 0.0515);
            } else {
                if (inve >= 20000.00 && inve < 100000.00) {
                    intGanado = plazoInv * (inve * 0.0525);
                } else {
                    if (inve >= 1000000.00 && inve < 500000.00) {
                        intGanado = plazoInv * (inve * 0.055);
                    } else {
                        if (inve >= 500000.00) {
                            intGanado = plazoInv * (inve * 0.0575);
                        }
                    }
                }
            }
        }
    }
}
