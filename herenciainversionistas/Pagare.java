package herenciainversionistas;

public class Pagare extends Inversionista{
    private double intAnual;
    private double cuenta;
    private double pagar;

    /**
     * Metodo constructor para pagare
     * @param numCli
     * @param nombre
     * @param numCuenta
     * @param invert
     * @param plazoInv
     * @param intAnual
     * @param cuenta
     */
    public Pagare(int numCli, String nombre, String numCuenta, double invert, int plazoInv, double intAnual,
                  double cuenta){
        this.numCli = numCli;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.invert = invert;
        this.plazoInv = plazoInv;
        this.intAnual = intAnual;
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
     * @return pagar
     */
    public double calcularPagar(){
        pagar = (cuenta - invert) + (invert / plazoInv) + (plazoInv * (invert * (intAnual / 100)));
        return pagar;
    }
}
