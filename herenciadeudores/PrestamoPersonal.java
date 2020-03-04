package herenciadeudores;

public class PrestamoPersonal extends ClienteDeudor {
    private double personal;

    /**
     * Metodo constructor para el prestamo personal
     * @param numCli
     * @param nom
     * @param numCue
     * @param prestado
     * @param interes
     * @param plazo
     */
    public PrestamoPersonal(int numCli, String nom, String numCue, double prestado, double interes, int plazo){
        this.numCli = numCli;
        this.nom = nom;
        this.numCue = numCue;
        this.prestado = prestado;
        this.interes = interes;
        this.plazo = plazo;
    }

    /**
     * Metodo para calcular el prestamo personal
     * @return personal
     */
    public double calcularPersonal(){
        personal = prestado + plazo * (prestado * interes / 100);
        return personal;
    }
}
