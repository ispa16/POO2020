package herencia_empleada;

public class EmpleadoPorHora extends Empleado {
    private int hora;
    private double valor_hora;
    double pago;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public void pago(){
        this.pago= hora*valor_hora;
    }
    public double get_pago(){
        return pago;
    }
}
