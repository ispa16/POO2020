package deber_seleccion;

class Empleado {
    private String nombre;
    private double horas;
    private double cuota;

    /**
     * Metodo para los datos del empleado
     * @param nombre
     * @param horas
     * @param cuota
     */
    public Empleado(String nombre, double horas, double cuota){
        this.setNombre(nombre);
        this.setHoras(horas);
        this.setCuota(cuota);
    }

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener las horas
     * @return horas
     */
    public double getHoras() {
        return horas;
    }

    /**
     * Metodo para actualizar las horas
     * @param horas
     */
    public void setHoras(double horas) {
        this.horas = horas;
    }

    /**
     * Metodo para obtener la cuota
     * @return cuota
     */
    public double getCuota() {
        return cuota;
    }

    /**
     * Metodo para actualizar la cuota
     * @param cuota
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    /**
     * Metodo para calcular y obtener el sueldoQuincena
     * @return sueldoQuincena
     */
    public double obtenerSueldo(){
        double sueldo;
        if(horas <= 40){
            sueldo = horas * cuota;
        }else{
            if(horas <= 50) {
                sueldo = 40 * cuota + ((horas - 40) * (cuota * 2));
            }else{
                sueldo = (40 * cuota) + (10 * cuota*2) + ((horas - 50) * (cuota * 3));
            }
        }
        return sueldo;
    }

    /**
     * Metodo para obtener el reporte del empleado
     * @return reporte
     */
    public String obtenerEmpleado(){
        String reporte = "Nombre: "+nombre+"\n\nSueldo: "+obtenerSueldo()+"\n";
        return reporte;
    }
}