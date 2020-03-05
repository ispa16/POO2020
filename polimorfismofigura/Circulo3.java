package polimorfismofigura;

public class Circulo3 extends Figura3 {
    private double radioCirc;

    /**
     * Metodo para actualizar el radio del cuadrado
     * @param radioCirc
     */
    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radioCirc, 2);
    }
}
