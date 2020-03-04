package herenciainversionistas;

public class CuentaAhorro extends Inversionista{
    private double intAnual;
    private double cuenta;
    private double ahorro;

    /**
     * Metodo constructor para cuenta de ahorro
     * @param numCli
     * @param nombre
     * @param numCuenta
     * @param invert
     * @param intAnual
     * @param plazoInv
     * @param cuenta
     */
    public CuentaAhorro(int numCli, String nombre, String numCuenta, double invert, double intAnual, int plazoInv,
                        double cuenta){
        this.numCli = numCli;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.invert = invert;
        this.intAnual = intAnual;
        this.plazoInv = plazoInv;
        this.cuenta = cuenta;
    }

    /**
     * Metodo para obtener el interes anual
     * @return intAnual
     */
    public double getIntAnual() {
        return intAnual;
    }

    /**
     * Metodo para obtener el saldo de la cuenta
     * @return cuenta
     */
    public double getCuenta() {
        return cuenta;
    }

    /**
     * Metodo para calcular el interes
     * @return ahorro
     */
    public double calcularAhorro(){
        ahorro = cuenta;
        for(int i = 0; i < plazoInv; i++){
            ahorro += invert * 12;
            ahorro += ahorro * (intAnual / 100);
        }
        ahorro = ahorro - (invert + cuenta);
        return ahorro;
    }
}
