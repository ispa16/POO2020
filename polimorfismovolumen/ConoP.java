package polimorfismovolumen;

public class ConoP extends FiguraP{
    private double radio;
    private double altura;

    /**
     * Metodo constructor para el cono
     * @param nomb
     * @param radio
     * @param altura
     */
    public ConoP(String nomb, double radio, double altura){
        this.nomb = nomb;
        this.radio = radio;
        this.altura = altura;
    }

    /**
     * Metodo para obtener el radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Metodo para obtener la altura
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Metodo para calcular el volumen
     */
    @Override
    public void calcularVolu() {
        volu = (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }
}
