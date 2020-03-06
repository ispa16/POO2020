package polimorfismovolumen;

import java.util.regex.Pattern;

public class EsferaP extends FiguraP {
    private double radio;

    /**
     * Metodo constructor para la esfera
     * @param nomb
     * @param radio
     */
    public EsferaP(String nomb, double radio){
        this.nomb = nomb;
        this.radio = radio;
    }

    /**
     * Metodo para obtener el radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Metodo para obtener el volumen
     */
    @Override
    public void calcularVolu() {
        volu = (4/3) * Math.PI * Math.pow(radio, 3);
    }
}
