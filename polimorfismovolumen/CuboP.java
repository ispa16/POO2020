package polimorfismovolumen;

import javax.print.DocFlavor;

public class CuboP extends FiguraP{
    private double lado;

    /**
     * Metodo constructor para el cubo
     * @param nomb
     * @param lado
     */
    public CuboP(String nomb, double lado){
        this.nomb = nomb;
        this.lado = lado;
    }
    /**
     * Metodo para obtener el lado
     * @return lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Metodo para calcular el volumen
     */
    @Override
    public void calcularVolu(){
        volu = Math.pow(lado, 3);
    }
}
