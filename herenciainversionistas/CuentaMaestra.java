package herenciainversionistas;

public class CuentaMaestra extends Inversionista {
    private double maestra;

    /**
     * Metodo contructor para cuenta maestra
     * @param numCli
     * @param nombre
     * @param numCuenta
     * @param invert
     * @param plazoInv
     */
    public CuentaMaestra(int numCli, String nombre, String numCuenta, double invert, int plazoInv){
        this.numCli = numCli;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.invert = invert;
        this.plazoInv = plazoInv;
    }

    /**
     * Metodo para calcular la cuenta maestra
     * @return maestra
     */
    public double calcularMaestra(){
        if(invert >= 1000.00 && invert < 4000.00){
            maestra = plazoInv * (invert * 0.05);
        }else{
            if(invert >= 4000.00 && invert < 20000.00){
                maestra = plazoInv * (invert * 0.0515);
            }else{
                if(invert >= 20000.00 && invert < 100000.00){
                    maestra = plazoInv * (invert * 0.0525);
                }else{
                    if(invert >= 1000000.00 && invert < 500000.00){
                        maestra = plazoInv * (invert * 0.055);
                    }else{
                        if(invert >= 500000.00){
                            maestra = plazoInv * (invert * 0.0575);
                        }
                    }
                }
            }
        }
        return maestra;
    }
}
