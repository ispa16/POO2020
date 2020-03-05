package polimorfismofigura;

public abstract class Figura3 {
    protected String nomFigura;
    protected double area;

    /**
     * Metodo para obtener el nombre de la figura
     * @return nomFigura
     */
    public String getNomFigura() {
        return nomFigura;
    }

    /**
     * Metodo para actualizar el nombre de la figura
     * @param nomFigura
     */
    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    /**
     * Metodo para obtener el area
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * Metodo abstracto para calcular el area
     */
    public abstract void calcularArea();
}