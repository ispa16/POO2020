package polimorfismodeudores;

public class PrestamoAutoP extends ClienteDeudorP {

    /**
     * Metodo constructor para el prestamo automovil
     * @param numCl
     * @param cliente
     * @param numCue
     * @param prestamo
     * @param interes
     * @param plazo
     */
    public PrestamoAutoP(int numCl, String cliente, String numCue, double prestamo, double interes, int plazo){
        this.numCl = numCl;
        this.cliente = cliente;
        this.numCue = numCue;
        this.prestamo = prestamo;
        this.interes = interes;
        this.plazo = plazo;
    }

    /**
     * Metodo abstracto para calcular el precio del auto
     */
    @Override
    public void calcularPagar(){
        pagar = prestamo + plazo * (prestamo * interes);
    }
}
