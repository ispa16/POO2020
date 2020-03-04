package herenciadeudores;

public class PrestamoHipotecario extends ClienteDeudor {
    private double hipotecario;

    /**
     * Metodo constructor para el prestamo hipotecario
     * @param numCli
     * @param nom
     * @param numCue
     * @param prestado
     * @param interes
     * @param plazo
     */
    public PrestamoHipotecario(int numCli, String nom, String numCue, double prestado, double interes, int plazo){
        this.numCli = numCli;
        this.nom = nom;
        this.numCue = numCue;
        this.prestado = prestado;
        this.interes = interes;
        this.plazo = plazo;
    }

    /**
     * Metodo para calcular la hipoteca
     * @return hipotecario
     */
    public double calcularHipotecario(){

        double calc = interes / 1200;
        double poten = plazo * 12;
        double numerador = (1 + Math.pow(calc, poten)) * calc;
        double denominador = (1 + Math.pow(calc, poten)) - 1;
        hipotecario = prestado * (numerador / denominador);
        return hipotecario;
    }
}
