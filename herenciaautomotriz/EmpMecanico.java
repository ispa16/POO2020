package herenciaautomotriz;

public class EmpMecanico extends Empleado {
    private int num;
    private double costo;
    private double quincena;

    /**
     * Metodo costructor para el empleado mecanico
     * @param rfc
     * @param nombre
     * @param departamento
     * @param puesto
     * @param num
     * @param costo
     */
    public EmpMecanico(String rfc, String nombre, String departamento, String puesto, int num, double costo){
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.num = num;
        this.costo = costo;
    }

    /**
     * Metodo para obtener el numero de trabajos
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * Metodo para obtener el costo
     * @return costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Metodo para calcular la quincena
     * @return quincena
     */
    public double calcularQuincena(){
        quincena = (num * costo) * 0.04;
        return quincena;
    }
}
