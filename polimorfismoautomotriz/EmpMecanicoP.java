package polimorfismoautomotriz;

public class EmpMecanicoP extends EmpleadoP {
    private int num;
    private double costo;

    /**
     * Metodo constructor para empleado mecanico
     * @param rfc
     * @param nom
     * @param dep
     * @param puest
     * @param num
     * @param costo
     */
    public EmpMecanicoP(String rfc, String nom, String dep, String puest, int num, double costo){
        this.rfc = rfc;
        this.nom = nom;
        this.dep = dep;
        this.puest = puest;
        this.num = num;
        this.costo = costo;
    }

    /**
     * Metodo para obtener el numero
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * Metodo para obener el costo
     * @return costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Metodo abstracto para obtener la quincena
     */
    @Override
    public void calcularQuin() {
        quin = (num * costo) * 0.04;
    }
}
