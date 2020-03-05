package polimorfismopoo;

public class EmpleadoPorHoras2 extends Empleado2{
    private double cuotas;
    private double horas;

    /**
     * Metodo para actualizar la cuota
     * @param cuotas
     */
    public void setCuotas(double cuotas) {
        this.cuotas = cuotas;
    }

    /**
     * Metodo para actualizar las horas
     * @param horas
     */
    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getSueldoQuincenal(){
        return sueldoQuincena;
    }

    @Override
    public void calcularSueldoQuincena() {
        sueldoQuincena = horas * cuotas;
    }
}
