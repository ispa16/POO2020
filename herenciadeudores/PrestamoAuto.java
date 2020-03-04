package herenciadeudores;

public class PrestamoAuto extends ClienteDeudor {
    private double auto;

    /**
     * Metodo constructor para el prestamo automovil
     * @param numCli
     * @param nom
     * @param numCue
     * @param prestado
     * @param interes
     * @param plazo
     */
    public PrestamoAuto(int numCli, String nom, String numCue, double prestado, double interes, int plazo){
        this.numCli = numCli;
        this.nom = nom;
        this.numCue = numCue;
        this.prestado = prestado;
        this.interes = interes;
        this.plazo = plazo;
    }

    /**
     * Metodo para calcular el precio del auto
     * @return auto
     */
    public double calcularAuto(){
        auto = prestado + plazo * (prestado * interes);
        return auto;
    }
}
