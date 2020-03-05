package polimorfismopoo;

public class EmpleadoAsalariado2 extends Empleado2{
    private double sueldoMensual;

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoQuincenal(){
        return sueldoQuincena;
    }
    @Override
    public void calcularSueldoQuincena(){
        sueldoQuincena = sueldoMensual / 2;
    }
}