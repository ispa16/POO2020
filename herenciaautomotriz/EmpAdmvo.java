package herenciaautomotriz;

public class EmpAdmvo extends Empleado {
    private double sueldo;
    private double quincena;

    /**
     * Metodo constructor para el empleado administrativo
     * @param rfc
     * @param nombre
     * @param departamento
     * @param puesto
     * @param sueldo
     */
    public  EmpAdmvo(String rfc, String nombre, String departamento, String puesto, double sueldo){
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    /**
     * Metodo para obtener el sueldo
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Metodo para calcular la quincena
     * @return quicena
     */
    public double calcularQuincena(){
        quincena = sueldo / 2;
        return quincena;
    }
}
