package polimorfismofigura;

public class Cuadrado3 extends Figura3 {
    private double ladoCuad;

    /**
     * Metodo para actualizar el lado del cuadrado
     * @param ladoCuad
     */
    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    @Override
    public void calcularArea() {
        area = Math.pow(ladoCuad, 2);
    }
}
