package herenciaFiguras;
import java.lang.Math;
public class Circulo extends Figura1 {
    private double radioC;
    private double areaC;

    public Circulo(String nombre, double radioC){
        this.nombreFig= nombre;
        this.radioC = radioC;

    }



    public double getRadioC() {
        return radioC;
    }

    public void setRadioC(double radioC) {
        this.radioC = radioC;
    }

    public void calcularAreaC(){
        areaC = 3.14* Math.pow(radioC,2);
    }
    public double getA(){
        return areaC;
    }

}
