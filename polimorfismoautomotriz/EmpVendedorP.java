package polimorfismoautomotriz;

public class EmpVendedorP extends EmpleadoP {
    private double salario;
    private double valor;

    /**
     * Metodo constructor para empleado vendedor
     * @param rfc
     * @param nom
     * @param dep
     * @param puest
     * @param salario
     * @param valor
     */
    public EmpVendedorP(String rfc, String nom, String dep, String puest, double salario, double valor){
        this.rfc = rfc;
        this.nom = nom;
        this.dep = dep;
        this.puest = puest;
        this.salario = salario;
        this.valor = valor;
    }

    /**
     * Metodo para obtener el salario
     * @return salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Metodo para obtener el valor
     * @return valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Metodo abstracto para la quincena
     */
    @Override
    public void calcularQuin() {
        quin = salario + (valor * 0.02);
    }
}
