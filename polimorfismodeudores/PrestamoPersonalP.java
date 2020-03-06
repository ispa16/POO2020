package polimorfismodeudores;

public class PrestamoPersonalP extends ClienteDeudorP{

    /**
     * Metodo constructor para el prestamo personal
     * @param numCl
     * @param cliente
     * @param numCue
     * @param prestamo
     * @param interes
     * @param plazo
     */
    public PrestamoPersonalP(int numCl, String cliente, String numCue, double prestamo, double interes, int plazo){
        this.numCl = numCl;
        this.cliente = cliente;
        this.numCue = numCue;
        this.prestamo = prestamo;
        this.interes = interes;
        this.plazo = plazo;
    }

    /**
     * Metodo abstracto para calcular el prestamo personal
     */
    @Override
    public void calcularPagar(){
        pagar = prestamo + plazo * (prestamo * interes / 100);
    }
}
