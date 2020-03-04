package herenciaautomotriz;

public class EmpVendedor extends Empleado {
    private double salario;
    private double valor;
    private double quincena;

    /**
     * Metodo contructor para el empleado vendedor
     * @param rfc
     * @param nombre
     * @param departamento
     * @param puesto
     * @param salario
     * @param valor
     */
    public EmpVendedor(String rfc, String nombre, String departamento, String puesto, double salario, double valor){
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
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
     * Metodo para obtener el valos
     * @return valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Metodo para calcular la quincena
     * @return quincena
     */
    public double calcularQuincena(){
        quincena = salario + (valor * 0.02);
        return quincena;
    }
}
