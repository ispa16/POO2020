package polimorfismofigura;

public class Triangulo3 extends Figura3 {
    private double baseTria;
    private double alturaTria;

    /**
     * Metodo para actualizar la base del triangulo
     * @param baseTria
     */
    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    /**
     * Metodo para actualizar la altura del triangulo
     * @param alturaTria
     */
    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    @Override
    public void calcularArea(){
        area = (baseTria * alturaTria) / 2;
    }
}