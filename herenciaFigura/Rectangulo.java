package herenciaFiguras;

import arreglosDeberPoo.Ficha;

public class Rectangulo extends Figura1 {
    private Double baseRect;
    private Double alturaRect;
    private  Double areaR;

    public Rectangulo(String nombre, double baseRect,double alturaRect){
        this.nombreFig= nombre;
        this.baseRect = baseRect;
        this.alturaRect = alturaRect;
    }


    public Double getBaseRect() {
        return baseRect;
    }

    public void setBaseRect(Double baseRect) {
        this.baseRect = baseRect;
    }

    public Double getAlturaRect() {
        return alturaRect;
    }

    public void setAlturaRect(Double alturaRect) {
        this.alturaRect = alturaRect;
    }
    public void calcularAreaR(){
        areaR = baseRect *alturaRect;
    }
    public double getR(){
        return areaR;
    }
}
