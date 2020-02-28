package herenciaFiguras;

public class Triangulo extends Figura1 {
    private double baseTria;
    private double  alturaTria;
    private double areaTria;

    public Triangulo(String nombre, double baseTria,double alturaTria){
        this.nombreFig= nombre;
        this.baseTria = baseTria;
        this.alturaTria = alturaTria;
    }

    public double getBaseTria() {
        return baseTria;
    }

    public void setBaseTria(Double baseTria) {
        this.baseTria = baseTria;
    }

    public double getAlturaTria() {
        return alturaTria;
    }

    public void setAlturaTria(Double alturaTria) {
        this.alturaTria = alturaTria;
    }
    public void calcularAreaT(){
        areaTria = (baseTria*alturaTria)/2;
    }
    public double getAreaTria(){
        return areaTria;
    }
}
