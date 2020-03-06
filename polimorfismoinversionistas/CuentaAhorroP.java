package polimorfismoinversionistas;

public class CuentaAhorroP extends InversionistaP {
    private double intAnual;
    private double saldo;

    /**
     * Metodo constructor para la cuenta de ahorro
     * @param numCl
     * @param nom
     * @param numCu
     * @param inve
     * @param intAnual
     * @param plazoInv
     * @param saldo
     */
    public CuentaAhorroP(int numCl, String nom, String numCu, double inve, double intAnual, int plazoInv,
                        double saldo){
        this.numCl = numCl;
        this.nom = nom;
        this.numCu = numCu;
        this.inve = inve;
        this.intAnual = intAnual;
        this.plazoInv = plazoInv;
        this.saldo = saldo;
    }

    /**
     * Metodo para obtener el interes anual
     * @return intAnual
     */
    public double getIntAnual() {
        return intAnual;
    }

    /**
     * Metodo para obtener el saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo abstracto para calcular el interes ganado
     */
    @Override
    public void calcularIntGanado() {
        intGanado = saldo;
        for(int i = 0; i < plazoInv; i++){
            intGanado += inve * 12;
            intGanado += intGanado * (intAnual / 100);
        }
        intGanado = intGanado - (inve + saldo);
    }
}
