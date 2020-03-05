package polimorfismofigura;

public class Rectangulo3 extends Figura3 {
    private double baseRecta;
    private double alturaRecta;

    /**
     * Metodo para actualizar la base del rectangulo
     * @param baseRecta
     */
    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    /**
     * Metodo para actualizar la altura del rectangulo
     * @param alturaRecta
     */
    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    @Override
    public void calcularArea() {
        area = baseRecta * alturaRecta;
    }
}
