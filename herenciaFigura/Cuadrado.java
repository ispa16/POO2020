package herenciaFiguras;

public class Cuadrado extends Figura1 {
    private Double ladoCua;

    private Double areaCua;

    public Cuadrado(String nombre, double ladoCua){
        this.nombreFig= nombre;
        this.ladoCua = ladoCua;
    }


    public Double getLadoCua() {
        return ladoCua;
    }

    public void setBaseCua(Double ladoCua) {
        this.ladoCua = ladoCua;
    }
    public void calcularAreaCua(){
        areaCua = Math.pow(ladoCua,2);
    }
    public double getAreaCua(){
        return areaCua;
    }
}
